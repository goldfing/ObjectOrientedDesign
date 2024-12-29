package ParkingLot;

public class ParkingLot {
    private ParkingFloor[] floors;

    public void setFloors(ParkingFloor[] floors) {
        this.floors = floors;
    }

    public void parkingPitIn(int floor, String carLicensePlate) {
        int floorIndex = floor-1;

        if (floor < 1 || floor > floors.length) {
            throw new IllegalArgumentException("Invalid floor");
        }

        if (floors[floorIndex].getBlankSpots() == 0) {
            throw new IllegalArgumentException("Floor is Full");
        }

        floors[floorIndex].pitIn(carLicensePlate);
    }

    public void parkingPitOut(int floor, String carLicensePlate) {
        int floorIndex = floor-1;

        if (floor < 1 || floor > floors.length) {
            throw new IllegalArgumentException("Invalid floor");
        }

        if (!floors[floorIndex].isFull()) {
            throw new IllegalArgumentException("Floor is Full");
        }

        floors[floorIndex].pitOut(carLicensePlate);
    }

    public void printParkingLot() {
        for (ParkingFloor floor : floors) {
            System.out.println(floor.getStatus());
        }
    }
}
