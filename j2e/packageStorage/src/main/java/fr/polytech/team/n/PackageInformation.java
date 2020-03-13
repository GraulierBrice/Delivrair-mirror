package fr.polytech.team.n;

import javax.ejb.Local;
import java.util.List;

@Local
public interface PackageInformation {
    List<Package> getPackages();
}
