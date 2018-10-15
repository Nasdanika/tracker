# Vision

## Context

A development team owns multiple Maven artifacts. There are more artifacts than team members. 
The team works in increments (sprints) with each increment touching different artifacts. 
Each artifact has a Maven-generated site. There is also a Maven-generated site for the team/organization referencing artifact sites.

The team treats its internal processes and supporting infrastructure as artifacts too to have a unified approach to documentation (sites) and change/work management - issues, versions, increments.

The team needs to:

* Track:
    * Issues at the artifact level. 
    * Artifact-team member association. 
    * Cross-artifact efforts.
* Publish changelogs and roadmaps to artifact and team sites.
* Perform increment (sprint) capacity planning.
* Maintain roadmaps at a quarter and year level. 

## Embodiments

The tracker will have two embodiments:

* Editor - eclipse plug-in - for individual use. The editor may support generation of static HTML reports.
* Server - collaborative use. The server shall be able to import models created by the editor. Development of the Web UI may take longer than creation of the editor because editor would be mostly auto-generated. Therefore in initial releases the server might be read-only - an alternative to static HTML reports. Also, both static HTML reports and the server shall utilize the same model -> HTML functionality. The server shall provide both REST API and HTML Web UI.  
* CDO Editor - connect to the server and have full access to the model. Can be used while the Web UI does not have the full functionality yet. Need to expose tcp acceptor and secure it. 

## Java Metaphor

As a tracker provides an ability to submit an issue for an artifact to be worked on by a developer the team work can be thought as a computer program.

In Java terminology:

* Artifact is an object with data - site, binaries, and behavior - execution of issues.
* Developers are worker threads executing issues in the context of containing artifacts.
* Issues are commands or method invocations or Callables submitted to the artifact resulting in completable futures which can be chained using ".then" - parent/child issues. Issues can be composite - containment - which is similar to ".then" and also to fork-join.
* Issue categories are object methods. Artifacts (objects) can be configured to assign method (category) invocations to different threads (developers).
 
## DSL

Because artifacts can be treated as invokable objects, it is possible to create an Organization Domain-Specific Language to work with the organization's
artifacts. Such a language would contain constructs for organizations, artifacts, categories and will be developer-independent. 
It would be possible to write "recipes" in such a language to execute repeatable processes. 

Such recipes can be invoked from tools such eclipse plug-ins and/or be published as libraries. For example, a wizard creating a new project in Eclipse may use the DSL to create a request for a new user ID in the team's FTP server or a new build job, ...

To avoid complexities of external DSL's the DSL shall be internal - a Java API. Such API can be generated from the tracker model. It can be done
by the server and downloaded by the API Maven build script before compilation - fully automated way. 

Another option is to use Codegen generating API from the model data retrieved over CDO or the REST endpoint. In this case the code may have ``@generated`` annotations to support manual/generated code co-existence similar to ECore code generator.   

Options:

* Low level - tracker release specific:
    * Generated model, CDO API's. This option is the easiest, but it has dependency on CDO jars and bypasses the application security.
    * REST endpoint, Java bindings - swagger.json and JAX-RS or something else. More effort, but will go through the application security and may generate permissions-specific API.
* High level - built on the low level and generated from the model, not meta-model. It is specific for a model state.    


An example of such a DSL using the Foundation Server project:

```
// Creates organization passing API key to access the REST endpoint. The URL is hardcoded in the generated API.
Nasdanika nasdanika = new Nasdanika("12345"); 

// Get Foundation Server artifact/project
FoundationServer foundationServer = nasdanika.getFoundationServer();

// Submit a new issue to the cdo category
Issue firstIssue = foundationServer.cdo(description, configuration, ...);

// Submit a new issue to the web category 
Issue secondIssue = fundationServer.web(...);

// Establish parent/child relationship
firstIssue.then(secondIssue);


```

For DSL model elements exposeable via the DSL shall have java name attributes.

E.g. organization may have API package name attribute and artifacts, groups, and categories may have javaName attribute. If such attributes are blank then Java names shall be derived from model elements names.

If the DSL proves to be useful it can be implemented as an external DSL using Xtext. 

## Automated execution of issues

Because an issue is a command it might be auto-submitted over a REST interface (see the DSL above) and some issues may be auto-resolved.

To support this:

* An ``IssueWorker`` service interface shall be created. It may have ``boolean accept(Issue) method``.
* An issue category shall have a flag indicating that it may be worked by an issue worker and an OSGi service filter attribute to select appropriate worker(s). 
* Issue shall have ``configuration`` attribute containing YAML configuration to be used by the issue worker.
* Issue notes shall be considered as Promise progress notifications and Completable Future/promise resolution. Therefore they shall have a type and also support ``configuration`` attribute to pass computer-readable information.
* If there is no worker which accepts the issue or a worker cannot process the issue then it gets assigned to the developer associated with the category.

## Completion notifications

As an issue is a completable future or Promise, issues shall support completion notification processing - when all child issues of a particular issue get resolved/closed the issue shall either notify the assigned developer or proceed to automated execution.    
  
## Use cases

TODO - create a story model with roles and stories, publish story model documentation to the site similar to the model documentation.

### Planning

#### Roadmap

Create a hierarchy of increments. 

Create an artifact element for a future artifact, create a version, link to an increment when it is planned to release the initial version of the artifact.

Similar to existing artifacts - create a version, link to an increment.

Validation - versions can be linked only to leaf increments.

"Logarithmic" time scale - year/quarter/sprint. Years on the far horizon, quarters for a quarter or two ahead, sprints for the next 3-6 months.

When a large increment gets broken down - move versions to sub-increments. Maybe do it automatically in the Web UI - move to the first child.

#### Capacity

Create availability entries for organization members. Issue - version - increment association subtract remaining effort from availability.

### Reporting

Roadmap.

Burndown charts, remaining effort, spent effort at different levels - organization, artifact, version, issue.

Developer allocation at different levels.

Issue relationships.

#### Artifact site reports

HTTP GET version endpoint to download zip archive with XHTML content to be put under src/site/xhtml/tracker in pre-site phase using Maven plug-in - https://github.com/maven-download-plugin/maven-download-plugin, or antrun.

More generally - the archive may be put under src/site and contain different resources, e.g. a bootstrap distribution under resources.

The archive shall contain:   

* changelog.xhtml - Generated static changelog up to the context version containing only closed issues.
* roadmap.xhtml - static roadmap at the time of generation plus an AJAX call to pull the most recent roadmap or simply a link to the roadmap on the server - might be configurable.
* issues/{id}.xhtml - issues included in the changelog and roadmap at the time of site publishing with dependencies. Only public issues.
* report-issue.xhtml - contains a form to report an issue with the context version hardcoded.
* developers.xhtml - A list of developers. Another approach would be to patch pom.xml with developer information, but it is more involved.      
* For organizations:
    * artifacts.xhtml - a list of artifacts owned by the organization with links to artifact version sites.
    * members.xhtml - a list of organization members with links to additional details, e.g. number of artifacts which this member works on (is a developer) and with a link to member details which lists member roles in different artifacts.
* groups/{group-id}.xhtml - group information - a list of artifacts in the group and sub-groups. Groups can be linked from site.xml menu. It is also possible to generate an xml file to be merged into site.xml - this way it doesn't have to be updated manually when new components/groups get added. But it is more involved and less flexible.    

The editor embodiment may generate these files from the model to be published and pulled by artifact/organization sites, until the server embodiment is available. 
    

## Roles

* Administrator - full access
* Artifact owner (manager) - can add developers to an artifact etc - basically full access to the artifact.
* Viewer
* Reporter
* Developer


## TODO's

* Elaborate issue, including effort estimate.
* Token expansion in artifact/version URL's - similar to how it is done in pom.xml
* Issue lifecycle and reference data such as severity/priority - in the model so can be configured differently for different orgs/artifacts. Lifecycle transitions relationship. Reference data is inherited. If reference data has at least one entry in replaces the parent reference - no addition - would be too complicated. Edit should scope selection choices.
* API token GUUID generation for added security
