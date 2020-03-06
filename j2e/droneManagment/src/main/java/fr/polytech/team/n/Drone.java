public class Drone {
    private int id;
    private long flightTime;
    private int battery;
    private DroneStatus status;

    public Drone(int id, long flightTime, int battery, DroneStatus status) {
        this.id = id;
        this.flightTime = flightTime;
        this.battery = battery;
        this.status = status;
    }
}