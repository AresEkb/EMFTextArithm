/**
 */
package org.emftext.language.arithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Bit Shift Op</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.emftext.language.arithm.ArithmPackage#getBitShiftOp()
 * @model
 * @generated
 */
public enum BitShiftOp implements Enumerator {
	/**
   * The '<em><b>LEFT</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #LEFT_VALUE
   * @generated
   * @ordered
   */
	LEFT(0, "LEFT", "LEFT"),

	/**
   * The '<em><b>RIGHT</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #RIGHT_VALUE
   * @generated
   * @ordered
   */
	RIGHT(0, "RIGHT", "RIGHT");

	/**
   * The '<em><b>LEFT</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LEFT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #LEFT
   * @model
   * @generated
   * @ordered
   */
	public static final int LEFT_VALUE = 0;

	/**
   * The '<em><b>RIGHT</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RIGHT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #RIGHT
   * @model
   * @generated
   * @ordered
   */
	public static final int RIGHT_VALUE = 0;

	/**
   * An array of all the '<em><b>Bit Shift Op</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final BitShiftOp[] VALUES_ARRAY =
		new BitShiftOp[]
    {
      LEFT,
      RIGHT,
    };

	/**
   * A public read-only list of all the '<em><b>Bit Shift Op</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final List<BitShiftOp> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
   * Returns the '<em><b>Bit Shift Op</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static BitShiftOp get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      BitShiftOp result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Bit Shift Op</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static BitShiftOp getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      BitShiftOp result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Bit Shift Op</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static BitShiftOp get(int value) {
    switch (value)
    {
      case LEFT_VALUE: return LEFT;
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
	private BitShiftOp(int value, String name, String literal) {
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
	
} //BitShiftOp