package fr.polytech.team.n;

import javax.ejb.Local;

@Local
public interface DroneManager{

    public void viewDroneInformation(Drone drone);
    public void setToCharge(Drone drone);
    public void setToMaintenance(Drone drone);
    public void setToAvailable(Drone drone);
    public void setToFlying(Drone drone);

}