/**
 */
package org.nasdanika.tracker;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Issue Relationship Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Issue relationships may be of different types. This enumeration lists some of them.
 * <!-- end-model-doc -->
 * @see org.nasdanika.tracker.TrackerPackage#getIssueRelationshipType()
 * @model
 * @generated
 */
public enum IssueRelationshipType implements Enumerator {
	/**
	 * The '<em><b>Parent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The containing issue is the "parent" of target "child" issues and can be closed/resolved only after all children are resolved. A child issue may have multiple parents - it is a graph, not a tree.
	 * <!-- end-model-doc -->
	 * @see #PARENT_VALUE
	 * @generated
	 * @ordered
	 */
	PARENT(0, "Parent", "Parent"),

	/**
	 * The '<em><b>Child</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The opposite to the parent relationship.
	 * <!-- end-model-doc -->
	 * @see #CHILD_VALUE
	 * @generated
	 * @ordered
	 */
	CHILD(1, "Child", "Child"),

	/**
	 * The '<em><b>Duplicate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source issue is a duplicate of the target issue (and vice versa).
	 * <!-- end-model-doc -->
	 * @see #DUPLICATE_VALUE
	 * @generated
	 * @ordered
	 */
	DUPLICATE(2, "Duplicate", "Duplicate"),

	/**
	 * The '<em><b>Related</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unspecified relationship.
	 * <!-- end-model-doc -->
	 * @see #RELATED_VALUE
	 * @generated
	 * @ordered
	 */
	RELATED(3, "Related", "Related");

	/**
	 * The '<em><b>Parent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The containing issue is the "parent" of target "child" issues and can be closed/resolved only after all children are resolved. A child issue may have multiple parents - it is a graph, not a tree.
	 * <!-- end-model-doc -->
	 * @see #PARENT
	 * @model name="Parent"
	 * @generated
	 * @ordered
	 */
	public static final int PARENT_VALUE = 0;

	/**
	 * The '<em><b>Child</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The opposite to the parent relationship.
	 * <!-- end-model-doc -->
	 * @see #CHILD
	 * @model name="Child"
	 * @generated
	 * @ordered
	 */
	public static final int CHILD_VALUE = 1;

	/**
	 * The '<em><b>Duplicate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source issue is a duplicate of the target issue (and vice versa).
	 * <!-- end-model-doc -->
	 * @see #DUPLICATE
	 * @model name="Duplicate"
	 * @generated
	 * @ordered
	 */
	public static final int DUPLICATE_VALUE = 2;

	/**
	 * The '<em><b>Related</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unspecified relationship.
	 * <!-- end-model-doc -->
	 * @see #RELATED
	 * @model name="Related"
	 * @generated
	 * @ordered
	 */
	public static final int RELATED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Issue Relationship Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IssueRelationshipType[] VALUES_ARRAY =
		new IssueRelationshipType[] {
			PARENT,
			CHILD,
			DUPLICATE,
			RELATED,
		};

	/**
	 * A public read-only list of all the '<em><b>Issue Relationship Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IssueRelationshipType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Issue Relationship Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IssueRelationshipType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IssueRelationshipType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Issue Relationship Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IssueRelationshipType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IssueRelationshipType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Issue Relationship Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IssueRelationshipType get(int value) {
		switch (value) {
			case PARENT_VALUE: return PARENT;
			case CHILD_VALUE: return CHILD;
			case DUPLICATE_VALUE: return DUPLICATE;
			case RELATED_VALUE: return RELATED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private IssueRelationshipType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //IssueRelationshipType
