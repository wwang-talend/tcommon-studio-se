/**
 */
package testcontainer.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.talend.designer.core.model.utils.emf.talendfile.impl.ProcessTypeImpl;

import testcontainer.TestContainer;
import testcontainer.TestContainerNode;
import testcontainer.TestcontainerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link testcontainer.impl.TestContainerImpl#getTestContainerNodes <em>Test Container Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestContainerImpl extends ProcessTypeImpl implements TestContainer {
    /**
     * The cached value of the '{@link #getTestContainerNodes() <em>Test Container Nodes</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTestContainerNodes()
     * @generated
     * @ordered
     */
    protected EList<TestContainerNode> testContainerNodes;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TestContainerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TestcontainerPackage.Literals.TEST_CONTAINER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TestContainerNode> getTestContainerNodes() {
        if (testContainerNodes == null) {
            testContainerNodes = new EObjectContainmentEList<TestContainerNode>(TestContainerNode.class, this, TestcontainerPackage.TEST_CONTAINER__TEST_CONTAINER_NODES);
        }
        return testContainerNodes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TestcontainerPackage.TEST_CONTAINER__TEST_CONTAINER_NODES:
                return ((InternalEList<?>)getTestContainerNodes()).basicRemove(otherEnd, msgs);
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
            case TestcontainerPackage.TEST_CONTAINER__TEST_CONTAINER_NODES:
                return getTestContainerNodes();
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
            case TestcontainerPackage.TEST_CONTAINER__TEST_CONTAINER_NODES:
                getTestContainerNodes().clear();
                getTestContainerNodes().addAll((Collection<? extends TestContainerNode>)newValue);
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
            case TestcontainerPackage.TEST_CONTAINER__TEST_CONTAINER_NODES:
                getTestContainerNodes().clear();
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
            case TestcontainerPackage.TEST_CONTAINER__TEST_CONTAINER_NODES:
                return testContainerNodes != null && !testContainerNodes.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //TestContainerImpl
