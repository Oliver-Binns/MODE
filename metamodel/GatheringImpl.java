/**
 */
package Y1481702.impl;

import Y1481702.Gathering;
import Y1481702.Requirement;
import Y1481702.TeamMember;
import Y1481702.TestCase;
import Y1481702.Y1481702Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gathering</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Y1481702.impl.GatheringImpl#getReqs <em>Reqs</em>}</li>
 *   <li>{@link Y1481702.impl.GatheringImpl#getTests <em>Tests</em>}</li>
 *   <li>{@link Y1481702.impl.GatheringImpl#getPeople <em>People</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GatheringImpl extends EObjectImpl implements Gathering {
	/**
	 * The cached value of the '{@link #getReqs() <em>Reqs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqs()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> reqs;

	/**
	 * The cached value of the '{@link #getTests() <em>Tests</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTests()
	 * @generated
	 * @ordered
	 */
	protected EList<TestCase> tests;

	/**
	 * The cached value of the '{@link #getPeople() <em>People</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeople()
	 * @generated
	 * @ordered
	 */
	protected EList<TeamMember> people;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GatheringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Y1481702Package.Literals.GATHERING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getReqs() {
		if (reqs == null) {
			reqs = new EObjectContainmentEList<Requirement>(Requirement.class, this, Y1481702Package.GATHERING__REQS);
		}
		return reqs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestCase> getTests() {
		if (tests == null) {
			tests = new EObjectContainmentEList<TestCase>(TestCase.class, this, Y1481702Package.GATHERING__TESTS);
		}
		return tests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TeamMember> getPeople() {
		if (people == null) {
			people = new EObjectContainmentEList<TeamMember>(TeamMember.class, this, Y1481702Package.GATHERING__PEOPLE);
		}
		return people;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Requirement> getTopLevelRequirements() {
		EList<Requirement> topLevel = new BasicEList<Requirement>();
		for(Requirement req: this.reqs){
			//If the requirement has no origin, this is top level
			if(req.getOrigin().isEmpty()){
				topLevel.add(req);
			}
		}
		return topLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Y1481702Package.GATHERING__REQS:
				return ((InternalEList<?>)getReqs()).basicRemove(otherEnd, msgs);
			case Y1481702Package.GATHERING__TESTS:
				return ((InternalEList<?>)getTests()).basicRemove(otherEnd, msgs);
			case Y1481702Package.GATHERING__PEOPLE:
				return ((InternalEList<?>)getPeople()).basicRemove(otherEnd, msgs);
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
			case Y1481702Package.GATHERING__REQS:
				return getReqs();
			case Y1481702Package.GATHERING__TESTS:
				return getTests();
			case Y1481702Package.GATHERING__PEOPLE:
				return getPeople();
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
			case Y1481702Package.GATHERING__REQS:
				getReqs().clear();
				getReqs().addAll((Collection<? extends Requirement>)newValue);
				return;
			case Y1481702Package.GATHERING__TESTS:
				getTests().clear();
				getTests().addAll((Collection<? extends TestCase>)newValue);
				return;
			case Y1481702Package.GATHERING__PEOPLE:
				getPeople().clear();
				getPeople().addAll((Collection<? extends TeamMember>)newValue);
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
			case Y1481702Package.GATHERING__REQS:
				getReqs().clear();
				return;
			case Y1481702Package.GATHERING__TESTS:
				getTests().clear();
				return;
			case Y1481702Package.GATHERING__PEOPLE:
				getPeople().clear();
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
			case Y1481702Package.GATHERING__REQS:
				return reqs != null && !reqs.isEmpty();
			case Y1481702Package.GATHERING__TESTS:
				return tests != null && !tests.isEmpty();
			case Y1481702Package.GATHERING__PEOPLE:
				return people != null && !people.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GatheringImpl
