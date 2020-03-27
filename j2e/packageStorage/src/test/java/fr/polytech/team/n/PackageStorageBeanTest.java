package fr.polytech.team.n;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import javax.ejb.EJB;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class PackageStorageBeanTest {
    @EJB
    private PackageInformation pack;
    private Package p;

    @Before
    public void setUpContext() throws Exception {
        initMock();
        p = new Package(1l);
        p.setCustomer(new Customer(0l, "a", "b"));
        p.setAddress("c");
    }

    @org.junit.Test
    public void getPackageByIdTest() {
        Package p2 = pack.getPackageById(1l);
        assertEquals(p.getAddress(), p2.getAddress());
    }

    private void initMock() throws Exception {
        // Mocking the external partner
        ShipperApi mocked = mock(ShipperApi.class);
        pack.useShipperReference(mocked);
        when(mocked.getPackage(eq(1l))).thenReturn(p);
    }

    @Test
    public void isTrue() {
        assertTrue(true);
    }
}