package com.codeyapa.parkinglot.exception;

public class InvalidParkingLotException extends ParkingFullException {

    private String lot;

    public InvalidParkingLotException() {
        super("Invalid parking lot", 0, 0);
        this.lot = "";
    }

    public InvalidParkingLotException(String message, String lot) {
        super(message, 0, 0);
        this.lot = lot;
    }

    public String getParkingName() {
        return lot;
    }

    public void setParkingName(String lot) {
        this.lot = lot;
    }

    public String getError() {
        return "Invalid Parking Lot: " + lot;
    }
}
