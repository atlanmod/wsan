/**
 * generated by Xtext 2.13.0
 */
package lang.iotlang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lang.iotlang.Rule#getName <em>Name</em>}</li>
 *   <li>{@link lang.iotlang.Rule#getSubject <em>Subject</em>}</li>
 *   <li>{@link lang.iotlang.Rule#getPermission <em>Permission</em>}</li>
 *   <li>{@link lang.iotlang.Rule#getAction <em>Action</em>}</li>
 *   <li>{@link lang.iotlang.Rule#getObject <em>Object</em>}</li>
 *   <li>{@link lang.iotlang.Rule#getPorts <em>Ports</em>}</li>
 *   <li>{@link lang.iotlang.Rule#getObjectMessage <em>Object Message</em>}</li>
 * </ul>
 *
 * @see lang.iotlang.IotlangPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see lang.iotlang.IotlangPackage#getRule_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link lang.iotlang.Rule#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Subject</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subject</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subject</em>' reference.
   * @see #setSubject(Thing)
   * @see lang.iotlang.IotlangPackage#getRule_Subject()
   * @model
   * @generated
   */
  Thing getSubject();

  /**
   * Sets the value of the '{@link lang.iotlang.Rule#getSubject <em>Subject</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subject</em>' reference.
   * @see #getSubject()
   * @generated
   */
  void setSubject(Thing value);

  /**
   * Returns the value of the '<em><b>Permission</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Permission</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Permission</em>' attribute.
   * @see #setPermission(String)
   * @see lang.iotlang.IotlangPackage#getRule_Permission()
   * @model
   * @generated
   */
  String getPermission();

  /**
   * Sets the value of the '{@link lang.iotlang.Rule#getPermission <em>Permission</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Permission</em>' attribute.
   * @see #getPermission()
   * @generated
   */
  void setPermission(String value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' attribute.
   * @see #setAction(String)
   * @see lang.iotlang.IotlangPackage#getRule_Action()
   * @model
   * @generated
   */
  String getAction();

  /**
   * Sets the value of the '{@link lang.iotlang.Rule#getAction <em>Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' attribute.
   * @see #getAction()
   * @generated
   */
  void setAction(String value);

  /**
   * Returns the value of the '<em><b>Object</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object</em>' reference.
   * @see #setObject(Thing)
   * @see lang.iotlang.IotlangPackage#getRule_Object()
   * @model
   * @generated
   */
  Thing getObject();

  /**
   * Sets the value of the '{@link lang.iotlang.Rule#getObject <em>Object</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object</em>' reference.
   * @see #getObject()
   * @generated
   */
  void setObject(Thing value);

  /**
   * Returns the value of the '<em><b>Ports</b></em>' reference list.
   * The list contents are of type {@link lang.iotlang.Port}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ports</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ports</em>' reference list.
   * @see lang.iotlang.IotlangPackage#getRule_Ports()
   * @model
   * @generated
   */
  EList<Port> getPorts();

  /**
   * Returns the value of the '<em><b>Object Message</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object Message</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Message</em>' reference.
   * @see #setObjectMessage(Message)
   * @see lang.iotlang.IotlangPackage#getRule_ObjectMessage()
   * @model
   * @generated
   */
  Message getObjectMessage();

  /**
   * Sets the value of the '{@link lang.iotlang.Rule#getObjectMessage <em>Object Message</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Message</em>' reference.
   * @see #getObjectMessage()
   * @generated
   */
  void setObjectMessage(Message value);

} // Rule
