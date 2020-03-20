package fr.polytech.team.n;

import javax.ejb.Local;
import java.util.List;

@Local
public interface PackageInformation {
    void useShipperReference(ShipperApi shipper);

    List<Package> getPackages();

    Package getPackageById(int id);
}
