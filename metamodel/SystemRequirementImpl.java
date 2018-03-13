/**
 */
package Y1481702.impl;

import Y1481702.SystemRequirement;
import Y1481702.TestCase;
import Y1481702.Y1481702Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Y1481702.impl.SystemRequirementImpl#getConflicts <em>Conflicts</em>}</li>
 *   <li>{@link Y1481702.impl.SystemRequirementImpl#getProgress <em>Progress</em>}</li>
 *   <li>{@link Y1481702.impl.SystemRequirementImpl#getVerifiedBy <em>Verified By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemRequirementImpl extends RequirementImpl implements SystemRequirement {
	/**
	 * The cached value of the '{@link #getConflicts() <em>Conflicts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConflicts()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemRequirement> conflicts;

	/**
	 * The default value of the '{@link #getProgress() <em>Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgress()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PROGRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgress() <em>Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgress()
	 * @generated
	 * @ordered
	 */
	protected Integer progress = PROGRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVerifiedBy() <em>Verified By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifiedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<TestCase> verifiedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Y1481702Package.Literals.SYSTEM_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemRequirement> getConflicts() {
		if (conflicts == null) {
			conflicts = new EObjectResolvingEList<SystemRequirement>(SystemRequirement.class, this, Y1481702Package.SYSTEM_REQUIREMENT__CONFLICTS);
		}
		return conflicts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Integer getProgress() {
		if(decomposition == null || decomposition.isEmpty())
			return progress;
		return super.getProgress();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgress(Integer newProgress) {
		Integer oldProgress = progress;
		progress = newProgress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Y1481702Package.SYSTEM_REQUIREMENT__PROGRESS, oldProgress, progress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestCase> getVerifiedBy() {
		if (verifiedBy == null) {
			verifiedBy = new EObjectWithInverseResolvingEList.ManyInverse<TestCase>(TestCase.class, this, Y1481702Package.SYSTEM_REQUIREMENT__VERIFIED_BY, Y1481702Package.TEST_CASE__VERIFYING);
		}
		return verifiedBy;
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
			case Y1481702Package.SYSTEM_REQUIREMENT__VERIFIED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVerifiedBy()).basicAdd(otherEnd, msgs);
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
			case Y1481702Package.SYSTEM_REQUIREMENT__VERIFIED_BY:
				return ((InternalEList<?>)getVerifiedBy()).basicRemove(otherEnd, msgs);
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
			case Y1481702Package.SYSTEM_REQUIREMENT__CONFLICTS:
				return getConflicts();
			case Y1481702Package.SYSTEM_REQUIREMENT__PROGRESS:
				return getProgress();
			case Y1481702Package.SYSTEM_REQUIREMENT__VERIFIED_BY:
				return getVerifiedBy();
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
			case Y1481702Package.SYSTEM_REQUIREMENT__CONFLICTS:
				getConflicts().clear();
				getConflicts().addAll((Collection<? extends SystemRequirement>)newValue);
				return;
			case Y1481702Package.SYSTEM_REQUIREMENT__PROGRESS:
				setProgress((Integer)newValue);
				return;
			case Y1481702Package.SYSTEM_REQUIREMENT__VERIFIED_BY:
				getVerifiedBy().clear();
				getVerifiedBy().addAll((Collection<? extends TestCase>)newValue);
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
			case Y1481702Package.SYSTEM_REQUIREMENT__CONFLICTS:
				getConflicts().clear();
				return;
			case Y1481702Package.SYSTEM_REQUIREMENT__PROGRESS:
				setProgress(PROGRESS_EDEFAULT);
				return;
			case Y1481702Package.SYSTEM_REQUIREMENT__VERIFIED_BY:
				getVerifiedBy().clear();
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
			case Y1481702Package.SYSTEM_REQUIREMENT__CONFLICTS:
				return conflicts != null && !conflicts.isEmpty();
			case Y1481702Package.SYSTEM_REQUIREMENT__PROGRESS:
				return PROGRESS_EDEFAULT == null ? progress != null : !PROGRESS_EDEFAULT.equals(progress);
			case Y1481702Package.SYSTEM_REQUIREMENT__VERIFIED_BY:
				return verifiedBy != null && !verifiedBy.isEmpty();
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
		result.append(" (progress: ");
		result.append(progress);
		result.append(')');
		return result.toString();
	}

} //SystemRequirementImpl
