package fr.polytech.team.n;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;


@Stateless
public class PackageStorageBean implements AddPackage, PackageInformation {


    private ShipperApi shipper;

    @Override
    public void registerPackage(int packageId, Shipper shipper) {
    }

    @Override
    public List<Package> getPackages() {
        return null;
    }

    @Override
    public Package getPackageById(int id)  {
        try {
           return shipper.getPackage(id);
        } catch (ExternalPartnerException e) {
            e.printStackTrace();
            return null;
        }
    }
}
