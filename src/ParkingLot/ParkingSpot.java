package ParkingLot;

public class ParkingSpot {
    private String licensePlate;
    private boolean isParked = false;

    public void parkIn(String licensePlate) {
        this.licensePlate = licensePlate;
        this.isParked = true;
    }

    public void parkOut() {
        this.licensePlate = null;
        this.isParked = false;
    }

    public boolean lookupParkedVehicle(String licensePlate) {
        if (this.isParked) {
            return this.licensePlate.equals(licensePlate);
        }
        return false;
    }

    public boolean isParked() {
        return isParked;
    }
}
