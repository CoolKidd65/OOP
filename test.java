package com.codeyapa.parkinglot;

import com.codeyapa.parkinglot.exception.ParkingFullException;
import com.codeyapa.parkinglot.exception.InvalidParkingLotException;
import com.codeyapa.parkinglot.exception.InvalidParkingFloorException;

public class TestParkingExceptions {

    public static void main(String[] args) {

        ParkingFullException fullEx = new ParkingFullException("Parking is full", 50, 50);

        System.out.println("Max capacity: " + full.getMaxCap());
        System.out.println("Current vehicles: " + full.getCurrent());
        System.out.println("Is over capacity? " + full.overCap());
        System.out.println();

        InvalidParkingLotException lot = new InvalidParkingLotException("Unknown parking lot", "Lot Z");
        System.out.println("Parking lot name: " + lot.getParkingName());
        System.out.println("Details: " + lot.getError());
        System.out.println();

        InvalidParkingFloorException floor = new InvalidParkingFloorException("Invalid floor selected", -2);
        System.out.println("Floor number: " + floor.getFloorNum());
        System.out.println("Is basement? " + floor.isBasement());
        System.out.println();
