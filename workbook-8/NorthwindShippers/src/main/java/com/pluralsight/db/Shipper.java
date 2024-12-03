package com.pluralsight.db;

public class Shipper {
    private int id;
    private String name;
    private int phone;

    public Shipper(int id, String name, int phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Shipper{id=" + id + ", name='" + name + "', phone='" + phone + "'}";
    }
}
