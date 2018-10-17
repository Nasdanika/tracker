/**
 */
package org.nasdanika.tracker.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.nasdanika.cdo.security.provider.CDOItemProviderAdapterEx;

import org.nasdanika.tracker.Issue;
import org.nasdanika.tracker.TrackerFactory;
import org.nasdanika.tracker.TrackerPackage;

/**
 * This is the item provider adapter for a {@link org.nasdanika.tracker.Issue} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IssueItemProvider 
	extends CDOItemProviderAdapterEx
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addSummaryPropertyDescriptor(object);
			addReporterPropertyDescriptor(object);
			addCategoryPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addArtifactVersionPropertyDescriptor(object);
			addTargetVersionPropertyDescriptor(object);
			addFixedInVersionPropertyDescriptor(object);
			addInboundRelationshipsPropertyDescriptor(object);
			addAssignedToPropertyDescriptor(object);
			addSubscribersPropertyDescriptor(object);
			addPrivatePropertyDescriptor(object);
			addStatusPropertyDescriptor(object);
			addResolutionPropertyDescriptor(object);
			addSubmittedPropertyDescriptor(object);
			addLastUpdatePropertyDescriptor(object);
			addEstimatedEffortPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Reporter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReporterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Issue_reporter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Issue_reporter_feature", "_UI_Issue_type"),
				 TrackerPackage.Literals.ISSUE__REPORTER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Category feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCategoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Issue_category_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Issue_category_feature", "_UI_Issue_type"),
				 TrackerPackage.Literals.ISSUE__CATEGORY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Summary feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSummaryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Issue_summary_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Issue_summary_feature", "_UI_Issue_type"),
				 TrackerPackage.Literals.ISSUE__SUMMARY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Issue_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Issue_description_feature", "_UI_Issue_type"),
				 TrackerPackage.Literals.ISSUE__DESCRIPTION,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Artifact Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArtifactVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Issue_artifactVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Issue_artifactVersion_feature", "_UI_Issue_type"),
				 TrackerPackage.Literals.ISSUE__ARTIFACT_VERSION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Issue_targetVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Issue_targetVersion_feature", "_UI_Issue_type"),
				 TrackerPackage.Literals.ISSUE__TARGET_VERSION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fixed In Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFixedInVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Issue_fixedInVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Issue_fixedInVersion_feature", "_UI_Issue_type"),
				 TrackerPackage.Literals.ISSUE__FIXED_IN_VERSION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inbound Relationships feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInboundRelationshipsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Issue_inboundRelationships_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Issue_inboundRelationships_feature", "_UI_Issue_type"),
				 TrackerPackage.Literals.ISSUE__INBOUND_RELATIONSHIPS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Assigned To feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssignedToPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Issue_assignedTo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Issue_assignedTo_feature", "_UI_Issue_type"),
				 TrackerPackage.Literals.ISSUE__ASSIGNED_TO,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Subscribers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubscribersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Issue_subscribers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Issue_subscribers_feature", "_UI_Issue_type"),
				 TrackerPackage.Literals.ISSUE__SUBSCRIBERS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Private feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrivatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Issue_private_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Issue_private_feature", "_UI_Issue_type"),
				 TrackerPackage.Literals.ISSUE__PRIVATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Issue_status_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Issue_status_feature", "_UI_Issue_type"),
				 TrackerPackage.Literals.ISSUE__STATUS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resolution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResolutionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Issue_resolution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Issue_resolution_feature", "_UI_Issue_type"),
				 TrackerPackage.Literals.ISSUE__RESOLUTION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Submitted feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubmittedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Issue_submitted_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Issue_submitted_feature", "_UI_Issue_type"),
				 TrackerPackage.Literals.ISSUE__SUBMITTED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Last Update feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastUpdatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Issue_lastUpdate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Issue_lastUpdate_feature", "_UI_Issue_type"),
				 TrackerPackage.Literals.ISSUE__LAST_UPDATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Estimated Effort feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEstimatedEffortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Issue_estimatedEffort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Issue_estimatedEffort_feature", "_UI_Issue_type"),
				 TrackerPackage.Literals.ISSUE__ESTIMATED_EFFORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(TrackerPackage.Literals.ISSUE__OUTBOUND_RELATIONSHIPS);
			childrenFeatures.add(TrackerPackage.Literals.ISSUE__NOTES);
			childrenFeatures.add(TrackerPackage.Literals.ISSUE__CHILDREN);
			childrenFeatures.add(TrackerPackage.Literals.ISSUE__REQUIREMENTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Issue.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Issue"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Issue)object).getSummary();
		return label == null || label.length() == 0 ?
			getString("_UI_Issue_type") :
			getString("_UI_Issue_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Issue.class)) {
			case TrackerPackage.ISSUE__SUMMARY:
			case TrackerPackage.ISSUE__DESCRIPTION:
			case TrackerPackage.ISSUE__PRIVATE:
			case TrackerPackage.ISSUE__SUBMITTED:
			case TrackerPackage.ISSUE__LAST_UPDATE:
			case TrackerPackage.ISSUE__ESTIMATED_EFFORT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TrackerPackage.ISSUE__OUTBOUND_RELATIONSHIPS:
			case TrackerPackage.ISSUE__NOTES:
			case TrackerPackage.ISSUE__CHILDREN:
			case TrackerPackage.ISSUE__REQUIREMENTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(TrackerPackage.Literals.ISSUE__OUTBOUND_RELATIONSHIPS,
				 TrackerFactory.eINSTANCE.createIssueRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(TrackerPackage.Literals.ISSUE__NOTES,
				 TrackerFactory.eINSTANCE.createNote()));

		newChildDescriptors.add
			(createChildParameter
				(TrackerPackage.Literals.ISSUE__NOTES,
				 TrackerFactory.eINSTANCE.createProgressReport()));

		newChildDescriptors.add
			(createChildParameter
				(TrackerPackage.Literals.ISSUE__CHILDREN,
				 TrackerFactory.eINSTANCE.createIssue()));

		newChildDescriptors.add
			(createChildParameter
				(TrackerPackage.Literals.ISSUE__REQUIREMENTS,
				 TrackerFactory.eINSTANCE.createRequirement()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TrackerEditPlugin.INSTANCE;
	}

}
