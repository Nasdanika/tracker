/**
 */
package org.nasdanika.tracker.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.nasdanika.tracker.Artifact;
import org.nasdanika.tracker.TrackerFactory;
import org.nasdanika.tracker.TrackerPackage;

/**
 * This is the item provider adapter for a {@link org.nasdanika.tracker.Artifact} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArtifactItemProvider 
	extends KnowledgeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactItemProvider(AdapterFactory adapterFactory) {
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

			addIdPropertyDescriptor(object);
			addGroupIDPropertyDescriptor(object);
			addPrivatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Artifact_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Artifact_id_feature", "_UI_Artifact_type"),
				 TrackerPackage.Literals.ARTIFACT__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Group ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGroupIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Artifact_groupID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Artifact_groupID_feature", "_UI_Artifact_type"),
				 TrackerPackage.Literals.ARTIFACT__GROUP_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_Artifact_private_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Artifact_private_feature", "_UI_Artifact_type"),
				 TrackerPackage.Literals.ARTIFACT__PRIVATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(TrackerPackage.Literals.ARTIFACT__DEVELOPERS);
			childrenFeatures.add(TrackerPackage.Literals.ARTIFACT__MODULES);
			childrenFeatures.add(TrackerPackage.Literals.ARTIFACT__ISSUES);
			childrenFeatures.add(TrackerPackage.Literals.ARTIFACT__VERSIONS);
			childrenFeatures.add(TrackerPackage.Literals.ARTIFACT__CATEGORIES);
			childrenFeatures.add(TrackerPackage.Literals.ARTIFACT__ROLES);
			childrenFeatures.add(TrackerPackage.Literals.ARTIFACT__ISSUE_RELATIONSHIP_TYPES);
			childrenFeatures.add(TrackerPackage.Literals.ARTIFACT__ISSUE_STATUSES);
			childrenFeatures.add(TrackerPackage.Literals.ARTIFACT__ISSUE_RESOLUTIONS);
			childrenFeatures.add(TrackerPackage.Literals.ARTIFACT__ISSUE_PRIORITIES);
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
	 * This returns Artifact.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Artifact"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Artifact)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Artifact_type") :
			getString("_UI_Artifact_type") + " " + label;
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

		switch (notification.getFeatureID(Artifact.class)) {
			case TrackerPackage.ARTIFACT__ID:
			case TrackerPackage.ARTIFACT__GROUP_ID:
			case TrackerPackage.ARTIFACT__PRIVATE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TrackerPackage.ARTIFACT__DEVELOPERS:
			case TrackerPackage.ARTIFACT__MODULES:
			case TrackerPackage.ARTIFACT__ISSUES:
			case TrackerPackage.ARTIFACT__VERSIONS:
			case TrackerPackage.ARTIFACT__CATEGORIES:
			case TrackerPackage.ARTIFACT__ROLES:
			case TrackerPackage.ARTIFACT__ISSUE_RELATIONSHIP_TYPES:
			case TrackerPackage.ARTIFACT__ISSUE_STATUSES:
			case TrackerPackage.ARTIFACT__ISSUE_RESOLUTIONS:
			case TrackerPackage.ARTIFACT__ISSUE_PRIORITIES:
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
				(TrackerPackage.Literals.ARTIFACT__DEVELOPERS,
				 TrackerFactory.eINSTANCE.createDeveloper()));

		newChildDescriptors.add
			(createChildParameter
				(TrackerPackage.Literals.ARTIFACT__MODULES,
				 TrackerFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(TrackerPackage.Literals.ARTIFACT__MODULES,
				 TrackerFactory.eINSTANCE.createOrganization()));

		newChildDescriptors.add
			(createChildParameter
				(TrackerPackage.Literals.ARTIFACT__ISSUES,
				 TrackerFactory.eINSTANCE.createIssue()));

		newChildDescriptors.add
			(createChildParameter
				(TrackerPackage.Literals.ARTIFACT__VERSIONS,
				 TrackerFactory.eINSTANCE.createVersion()));

		newChildDescriptors.add
			(createChildParameter
				(TrackerPackage.Literals.ARTIFACT__CATEGORIES,
				 TrackerFactory.eINSTANCE.createCategory()));

		newChildDescriptors.add
			(createChildParameter
				(TrackerPackage.Literals.ARTIFACT__ROLES,
				 TrackerFactory.eINSTANCE.createRole()));

		newChildDescriptors.add
			(createChildParameter
				(TrackerPackage.Literals.ARTIFACT__ISSUE_RELATIONSHIP_TYPES,
				 TrackerFactory.eINSTANCE.createIssueRelationshipType()));

		newChildDescriptors.add
			(createChildParameter
				(TrackerPackage.Literals.ARTIFACT__ISSUE_STATUSES,
				 TrackerFactory.eINSTANCE.createIssueStatus()));

		newChildDescriptors.add
			(createChildParameter
				(TrackerPackage.Literals.ARTIFACT__ISSUE_RESOLUTIONS,
				 TrackerFactory.eINSTANCE.createIssueResolution()));

		newChildDescriptors.add
			(createChildParameter
				(TrackerPackage.Literals.ARTIFACT__ISSUE_PRIORITIES,
				 TrackerFactory.eINSTANCE.createIssuePriority()));
	}

}
