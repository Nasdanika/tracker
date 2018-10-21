# Nasdanika Tracker

Agile is a great methodology! 
Comparing to waterfall it is a big step forward in the direction of recognition that the world is full of uncertainties and fluctuations making long-term precise planning impossible.
However, in some organizations requirements of the "Classical Agile" are unrealistic to met. For example:

* The size of a scrum team is 15+ developers plus the product owner and the scrum master.
* The team owns 30+ software components (Maven projects).
* Team members are not 100% dedicated to Sprint activities in an isolated uninterrupted fashion - they have to work on production incidents and participate in a number of other efforts including maintaining 2 year roadmaps.
* The team is distributed across the globe.
* The components owned by the team are consumed by a number of other teams and sprint activities have to be tracked in the agile tracker of the consuming team requested a particular feature, not in the team's tracker.
* The team shares an agile tracker with other teams and the tracker does not have a concept of a component or a component version.

Under the above circumstances the classical agile stops working correctly in the same way as classical mechanics stops working at speeds nearing the speed of light. 
One may say that what is explained above is not agile, and they would be right. 

However, if it's a given then the classical agile needs to be adjusted to become the speed-of-light agile. 
This is the intention of the Nasdanika Tracker - to be a tool for tracking development activities in situations where other tooling does not meet the requirements of the team.      

Nasdanika Tracker is an issue tracker for Maven projects - it assumes that deliverables (components, projects) are represented as Maven artifacts organized into groups and delivered in increments called versions.

The tracker can be used as an eclipse plugin and in the future also as a web application. 

This product is in an early stage of development. The [vision](vision.html) document explains where development is intended to be headed.    

## Resources

* [Model documentation](modeldoc/index.html)
* JavaDoc
    * [Model](apidocs/model)
    * [Edit](apidocs/edit)
    * [Editor](apidocs/editor)
* [Sources](tracker.zip)    

## P2 Repository

* ``https://www.nasdanika.org/products/tracker/repository``
* [Archived](https://www.nasdanika.org/products/tracker/org.nasdanika.bank.repository-0.1.0-SNAPSHOT.zip)

## How to contribute

As an open source project we use the [Fork and Pull Model](https://help.github.com/articles/about-collaborative-development-models/).
You can find more information about collaborative development at GitHub in this article - [Collaborating with issues and pull requests](https://help.github.com/categories/collaborating-with-issues-and-pull-requests).

When you contribute code, please make sure that the changes are clearly identifiable. In particular, avoid making non-functional changes in the code which you do not touch, 
e.g. auto-formatting of an entire compilation unit. 

