package com.pluralsight;

public class Reservations {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservations(String roomType, double price, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        if (roomType.equalsIgnoreCase("king")) {
            this.price = 139;
        } else if (roomType.equalsIgnoreCase("double")) {
            this.price = 124;
        }
    }


    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }


    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getReservationTotal() {
        double totalPrice = price * numberOfNights;

        if (isWeekend) {
            totalPrice *= 1.1;

        }return totalPrice;
    }
}
