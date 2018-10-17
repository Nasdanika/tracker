/**
 */
package org.nasdanika.tracker;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skill</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.tracker.Skill#getLevel <em>Level</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Skill#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Skill#getKnowledge <em>Knowledge</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.tracker.TrackerPackage#getSkill()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Skill extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.tracker.SkillLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see org.nasdanika.tracker.SkillLevel
	 * @see #setLevel(SkillLevel)
	 * @see org.nasdanika.tracker.TrackerPackage#getSkill_Level()
	 * @model
	 * @generated
	 */
	SkillLevel getLevel();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Skill#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see org.nasdanika.tracker.SkillLevel
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(SkillLevel value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description in markdown.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.tracker.TrackerPackage#getSkill_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Skill#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Knowledge</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.tracker.Knowledge#getExperts <em>Experts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Knowledge</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Knowledge</em>' reference.
	 * @see #setKnowledge(Knowledge)
	 * @see org.nasdanika.tracker.TrackerPackage#getSkill_Knowledge()
	 * @see org.nasdanika.tracker.Knowledge#getExperts
	 * @model opposite="experts"
	 * @generated
	 */
	Knowledge getKnowledge();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Skill#getKnowledge <em>Knowledge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Knowledge</em>' reference.
	 * @see #getKnowledge()
	 * @generated
	 */
	void setKnowledge(Knowledge value);

} // Skill
