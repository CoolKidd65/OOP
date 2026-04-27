package com.codeyapa.parkinglot.exception;

public class InvalidParkingFloorException extends ParkingFullException {

    private int floorNum;

    public InvalidParkingFloorException() {
        super("Invalid parking floor", 0, 0);
        this.floorNum = -1;
    }

    public InvalidParkingFloorException(String message, int floorNum) {
        super(message, 0, 0);
        this.floorNum = floorNum;
    }

    public int getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(int floorNum) {
        this.floorNum = floorNum;
    }

    public boolean isBasement() {
        return floorNum < 0;
    }
}
