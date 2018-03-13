/**
 */
package Y1481702.impl;

import Y1481702.Requirement;
import Y1481702.TeamMember;
import Y1481702.Y1481702Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Team Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Y1481702.impl.TeamMemberImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link Y1481702.impl.TeamMemberImpl#getForename <em>Forename</em>}</li>
 *   <li>{@link Y1481702.impl.TeamMemberImpl#getSurname <em>Surname</em>}</li>
 *   <li>{@link Y1481702.impl.TeamMemberImpl#getFullname <em>Fullname</em>}</li>
 *   <li>{@link Y1481702.impl.TeamMemberImpl#getWorkingOn <em>Working On</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TeamMemberImpl extends EObjectImpl implements TeamMember {
	/**
	 * The default value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected static final int UID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected int uid = UID_EDEFAULT;

	/**
	 * The default value of the '{@link #getForename() <em>Forename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForename()
	 * @generated
	 * @ordered
	 */
	protected static final String FORENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForename() <em>Forename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForename()
	 * @generated
	 * @ordered
	 */
	protected String forename = FORENAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSurname() <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurname()
	 * @generated
	 * @ordered
	 */
	protected static final String SURNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSurname() <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurname()
	 * @generated
	 * @ordered
	 */
	protected String surname = SURNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFullname() <em>Fullname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullname()
	 * @generated
	 * @ordered
	 */
	protected static final String FULLNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkingOn() <em>Working On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkingOn()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> workingOn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeamMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Y1481702Package.Literals.TEAM_MEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUid() {
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUid(int newUid) {
		int oldUid = uid;
		uid = newUid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Y1481702Package.TEAM_MEMBER__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getForename() {
		return forename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForename(String newForename) {
		String oldForename = forename;
		forename = newForename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Y1481702Package.TEAM_MEMBER__FORENAME, oldForename, forename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSurname(String newSurname) {
		String oldSurname = surname;
		surname = newSurname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Y1481702Package.TEAM_MEMBER__SURNAME, oldSurname, surname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getFullname() {
		return (forename != null ? forename: "") + 
				" " + 
				(surname != null ? surname: "");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setFullname(String newFullname) {
		String oldFullname = getFullname();
		
		String[] parts = newFullname.split(" ", 2);
		setForename(parts[0]);
		if(parts.length > 1){
			setSurname(parts[1]);
		}else{
			setSurname("");
		}
		
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Y1481702Package.TEAM_MEMBER__FULLNAME, oldFullname, getFullname()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getWorkingOn() {
		if (workingOn == null) {
			workingOn = new EObjectWithInverseResolvingEList.ManyInverse<Requirement>(Requirement.class, this, Y1481702Package.TEAM_MEMBER__WORKING_ON, Y1481702Package.REQUIREMENT__ALLOCATED_TO);
		}
		return workingOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Y1481702Package.TEAM_MEMBER__WORKING_ON:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkingOn()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Y1481702Package.TEAM_MEMBER__WORKING_ON:
				return ((InternalEList<?>)getWorkingOn()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Y1481702Package.TEAM_MEMBER__UID:
				return getUid();
			case Y1481702Package.TEAM_MEMBER__FORENAME:
				return getForename();
			case Y1481702Package.TEAM_MEMBER__SURNAME:
				return getSurname();
			case Y1481702Package.TEAM_MEMBER__FULLNAME:
				return getFullname();
			case Y1481702Package.TEAM_MEMBER__WORKING_ON:
				return getWorkingOn();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Y1481702Package.TEAM_MEMBER__UID:
				setUid((Integer)newValue);
				return;
			case Y1481702Package.TEAM_MEMBER__FORENAME:
				setForename((String)newValue);
				return;
			case Y1481702Package.TEAM_MEMBER__SURNAME:
				setSurname((String)newValue);
				return;
			case Y1481702Package.TEAM_MEMBER__FULLNAME:
				setFullname((String)newValue);
				return;
			case Y1481702Package.TEAM_MEMBER__WORKING_ON:
				getWorkingOn().clear();
				getWorkingOn().addAll((Collection<? extends Requirement>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Y1481702Package.TEAM_MEMBER__UID:
				setUid(UID_EDEFAULT);
				return;
			case Y1481702Package.TEAM_MEMBER__FORENAME:
				setForename(FORENAME_EDEFAULT);
				return;
			case Y1481702Package.TEAM_MEMBER__SURNAME:
				setSurname(SURNAME_EDEFAULT);
				return;
			case Y1481702Package.TEAM_MEMBER__FULLNAME:
				setFullname(FULLNAME_EDEFAULT);
				return;
			case Y1481702Package.TEAM_MEMBER__WORKING_ON:
				getWorkingOn().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Y1481702Package.TEAM_MEMBER__UID:
				return uid != UID_EDEFAULT;
			case Y1481702Package.TEAM_MEMBER__FORENAME:
				return FORENAME_EDEFAULT == null ? forename != null : !FORENAME_EDEFAULT.equals(forename);
			case Y1481702Package.TEAM_MEMBER__SURNAME:
				return SURNAME_EDEFAULT == null ? surname != null : !SURNAME_EDEFAULT.equals(surname);
			case Y1481702Package.TEAM_MEMBER__FULLNAME:
				return FULLNAME_EDEFAULT == null ? getFullname() != null : !FULLNAME_EDEFAULT.equals(getFullname());
			case Y1481702Package.TEAM_MEMBER__WORKING_ON:
				return workingOn != null && !workingOn.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (uid: ");
		result.append(uid);
		result.append(", forename: ");
		result.append(forename);
		result.append(", surname: ");
		result.append(surname);
		result.append(')');
		return result.toString();
	}

} //TeamMemberImpl
