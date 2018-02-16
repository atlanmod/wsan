/**
 * generated by Xtext 2.13.0
 */
package lang.iotlang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lang.iotlang.Thing#getName <em>Name</em>}</li>
 *   <li>{@link lang.iotlang.Thing#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link lang.iotlang.Thing#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @see lang.iotlang.IotlangPackage#getThing()
 * @model
 * @generated
 */
public interface Thing extends EObject
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
   * @see lang.iotlang.IotlangPackage#getThing_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link lang.iotlang.Thing#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
   * The list contents are of type {@link lang.iotlang.PlatformAnnotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotations</em>' containment reference list.
   * @see lang.iotlang.IotlangPackage#getThing_Annotations()
   * @model containment="true"
   * @generated
   */
  EList<PlatformAnnotation> getAnnotations();

  /**
   * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
   * The list contents are of type {@link lang.iotlang.Port}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ports</em>' containment reference list.
   * @see lang.iotlang.IotlangPackage#getThing_Ports()
   * @model containment="true"
   * @generated
   */
  EList<Port> getPorts();

} // Thing
