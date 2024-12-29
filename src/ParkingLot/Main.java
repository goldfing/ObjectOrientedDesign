package ParkingLot;

public class Main {
    public static void main(String[] args) {
        // 주차장을 만든다.
        ParkingLot parkingLot = new ParkingLot();

        // 층의 개수와 층별로 주차장의 개수를 셋업한다.
        ParkingFloor pf1 = new ParkingFloor(1, 50);

        ParkingFloor[] floors = new ParkingFloor[] {pf1};
        parkingLot.setFloors(floors);

        // 차량
        String car1 = "111가1111";

        // 주차
        parkingLot.parkingPitIn(1, car1);

        parkingLot.printParkingLot();

        // 출차
        parkingLot.parkingPitOut(1, car1);

        parkingLot.printParkingLot();
    }
}
