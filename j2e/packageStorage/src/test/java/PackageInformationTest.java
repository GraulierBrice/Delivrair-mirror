package fr.polytech.team.n;




import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import javax.ejb.EJB;
import javax.inject.Inject;

import org.json.JSONObject;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class PackageInformationTest {

    @EJB private PackageInformation pack;
    private Package p;

    @Before
    public void setUpContext() throws Exception {
        initMock();
        p = new Package(1);
        p.setCustomer(new Customer(0,"a","b"));
        p.setAddress("c");
    }

    @Test
    public void getPackageByIdTest(int id)  {
        Package p2 = pack.getPackageById(1);
        assertTrue(p.getAddress().equals(p2.getAddress()));
    }



    private void initMock() throws Exception {
        // Mocking the external partner
        ShipperApi mocked = mock(ShipperApi.class);
        pack.useShipperReference(mocked);
        when(mocked.getPackage(eq(1))).thenReturn(p);
    }

}
