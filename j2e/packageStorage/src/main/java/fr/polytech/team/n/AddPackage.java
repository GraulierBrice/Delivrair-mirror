package fr.polytech.team.n;

import javax.ejb.Local;

@Local
public interface AddPackage {
    void registerPackage(Long packageId, Shipper shipper);
}
