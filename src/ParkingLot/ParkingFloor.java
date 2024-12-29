package ParkingLot;

public class ParkingFloor {
    private int floorNumber;
    private ParkingSpot[] spots;
    private int blankSpots;

    private ParkingFloor() {}

    public ParkingFloor(int floor, int spotCount) {
        this.floorNumber = floor;
        this.blankSpots = spotCount;
        this.spots = new ParkingSpot[spotCount];
    }

    public void pitIn(String licensePlate) {
        if (blankSpots <= 0) {
            throw new IllegalStateException("Parking Floor is full");
        }
        for (ParkingSpot spot : spots) {
            if (spot != null && !spot.isParked()) {
                spot.parkIn(licensePlate);
                break;
            }
        }
        blankSpots--;
    }

    public void pitOut(String licensePlate) {
        for (ParkingSpot spot : spots) {
            if (spot != null && spot.lookupParkedVehicle(licensePlate)) {
                spot.parkOut();
                break;
            }
        }
        blankSpots++;
    }

    public int getBlankSpots() {
        return blankSpots;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public boolean isFull() {
        return blankSpots > 0 || blankSpots != spots.length;
    }

    public String getStatus() {
        String status = "";
        status += "Floor Number: " + floorNumber + "\n";
        status += "Number of Spots: " + spots.length + "\n";
        status += "Number of Blank Spots: " + blankSpots + "\n";

        return status;
    }
}
