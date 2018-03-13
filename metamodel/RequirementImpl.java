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
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Y1481702.impl.RequirementImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link Y1481702.impl.RequirementImpl#isInsatiable <em>Insatiable</em>}</li>
 *   <li>{@link Y1481702.impl.RequirementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Y1481702.impl.RequirementImpl#getAllocatedTo <em>Allocated To</em>}</li>
 *   <li>{@link Y1481702.impl.RequirementImpl#getDecomposition <em>Decomposition</em>}</li>
 *   <li>{@link Y1481702.impl.RequirementImpl#getOrigin <em>Origin</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RequirementImpl extends EObjectImpl implements Requirement {
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
	 * The default value of the '{@link #isInsatiable() <em>Insatiable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInsatiable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INSATIABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInsatiable() <em>Insatiable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInsatiable()
	 * @generated
	 * @ordered
	 */
	protected boolean insatiable = INSATIABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAllocatedTo() <em>Allocated To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedTo()
	 * @generated
	 * @ordered
	 */
	protected EList<TeamMember> allocatedTo;

	/**
	 * The cached value of the '{@link #getDecomposition() <em>Decomposition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecomposition()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> decomposition;

	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> origin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Y1481702Package.Literals.REQUIREMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Y1481702Package.REQUIREMENT__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInsatiable() {
		return insatiable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsatiable(boolean newInsatiable) {
		boolean oldInsatiable = insatiable;
		insatiable = newInsatiable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Y1481702Package.REQUIREMENT__INSATIABLE, oldInsatiable, insatiable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Y1481702Package.REQUIREMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TeamMember> getAllocatedTo() {
		if (allocatedTo == null) {
			allocatedTo = new EObjectWithInverseResolvingEList.ManyInverse<TeamMember>(TeamMember.class, this, Y1481702Package.REQUIREMENT__ALLOCATED_TO, Y1481702Package.TEAM_MEMBER__WORKING_ON);
		}
		return allocatedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getDecomposition() {
		if (decomposition == null) {
			decomposition = new EObjectWithInverseResolvingEList.ManyInverse<Requirement>(Requirement.class, this, Y1481702Package.REQUIREMENT__DECOMPOSITION, Y1481702Package.REQUIREMENT__ORIGIN);
		}
		return decomposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getOrigin() {
		if (origin == null) {
			origin = new EObjectWithInverseResolvingEList.ManyInverse<Requirement>(Requirement.class, this, Y1481702Package.REQUIREMENT__ORIGIN, Y1481702Package.REQUIREMENT__DECOMPOSITION);
		}
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Integer getProgress() {
		int total = 0;
		for(Requirement req: decomposition){
			if(req.getProgress() != null)
				total += req.getProgress();
		}
		return (total == 0) ? 0: total / decomposition.size();
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
			case Y1481702Package.REQUIREMENT__ALLOCATED_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAllocatedTo()).basicAdd(otherEnd, msgs);
			case Y1481702Package.REQUIREMENT__DECOMPOSITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDecomposition()).basicAdd(otherEnd, msgs);
			case Y1481702Package.REQUIREMENT__ORIGIN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOrigin()).basicAdd(otherEnd, msgs);
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
			case Y1481702Package.REQUIREMENT__ALLOCATED_TO:
				return ((InternalEList<?>)getAllocatedTo()).basicRemove(otherEnd, msgs);
			case Y1481702Package.REQUIREMENT__DECOMPOSITION:
				return ((InternalEList<?>)getDecomposition()).basicRemove(otherEnd, msgs);
			case Y1481702Package.REQUIREMENT__ORIGIN:
				return ((InternalEList<?>)getOrigin()).basicRemove(otherEnd, msgs);
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
			case Y1481702Package.REQUIREMENT__UID:
				return getUid();
			case Y1481702Package.REQUIREMENT__INSATIABLE:
				return isInsatiable();
			case Y1481702Package.REQUIREMENT__DESCRIPTION:
				return getDescription();
			case Y1481702Package.REQUIREMENT__ALLOCATED_TO:
				return getAllocatedTo();
			case Y1481702Package.REQUIREMENT__DECOMPOSITION:
				return getDecomposition();
			case Y1481702Package.REQUIREMENT__ORIGIN:
				return getOrigin();
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
			case Y1481702Package.REQUIREMENT__UID:
				setUid((Integer)newValue);
				return;
			case Y1481702Package.REQUIREMENT__INSATIABLE:
				setInsatiable((Boolean)newValue);
				return;
			case Y1481702Package.REQUIREMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Y1481702Package.REQUIREMENT__ALLOCATED_TO:
				getAllocatedTo().clear();
				getAllocatedTo().addAll((Collection<? extends TeamMember>)newValue);
				return;
			case Y1481702Package.REQUIREMENT__DECOMPOSITION:
				getDecomposition().clear();
				getDecomposition().addAll((Collection<? extends Requirement>)newValue);
				return;
			case Y1481702Package.REQUIREMENT__ORIGIN:
				getOrigin().clear();
				getOrigin().addAll((Collection<? extends Requirement>)newValue);
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
			case Y1481702Package.REQUIREMENT__UID:
				setUid(UID_EDEFAULT);
				return;
			case Y1481702Package.REQUIREMENT__INSATIABLE:
				setInsatiable(INSATIABLE_EDEFAULT);
				return;
			case Y1481702Package.REQUIREMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Y1481702Package.REQUIREMENT__ALLOCATED_TO:
				getAllocatedTo().clear();
				return;
			case Y1481702Package.REQUIREMENT__DECOMPOSITION:
				getDecomposition().clear();
				return;
			case Y1481702Package.REQUIREMENT__ORIGIN:
				getOrigin().clear();
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
			case Y1481702Package.REQUIREMENT__UID:
				return uid != UID_EDEFAULT;
			case Y1481702Package.REQUIREMENT__INSATIABLE:
				return insatiable != INSATIABLE_EDEFAULT;
			case Y1481702Package.REQUIREMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Y1481702Package.REQUIREMENT__ALLOCATED_TO:
				return allocatedTo != null && !allocatedTo.isEmpty();
			case Y1481702Package.REQUIREMENT__DECOMPOSITION:
				return decomposition != null && !decomposition.isEmpty();
			case Y1481702Package.REQUIREMENT__ORIGIN:
				return origin != null && !origin.isEmpty();
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
		result.append(", insatiable: ");
		result.append(insatiable);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //RequirementImpl
