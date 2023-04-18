/**
 */
package CSYE7230_FinalProject.neueducsye7230lms;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.Domain#getDomianID <em>Domian ID</em>}</li>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.Domain#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.Domain#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject {
	/**
	 * Returns the value of the '<em><b>Domian ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domian ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domian ID</em>' attribute.
	 * @see #setDomianID(String)
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getDomain_DomianID()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDomianID();

	/**
	 * Sets the value of the '{@link CSYE7230_FinalProject.neueducsye7230lms.Domain#getDomianID <em>Domian ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domian ID</em>' attribute.
	 * @see #getDomianID()
	 * @generated
	 */
	void setDomianID(String value);

	/**
	 * Returns the value of the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Name</em>' attribute.
	 * @see #setDomainName(String)
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getDomain_DomainName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDomainName();

	/**
	 * Sets the value of the '{@link CSYE7230_FinalProject.neueducsye7230lms.Domain#getDomainName <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Name</em>' attribute.
	 * @see #getDomainName()
	 * @generated
	 */
	void setDomainName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getDomain_Description()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link CSYE7230_FinalProject.neueducsye7230lms.Domain#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Domain
