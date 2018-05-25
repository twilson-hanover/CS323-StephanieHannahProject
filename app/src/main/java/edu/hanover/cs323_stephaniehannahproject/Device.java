package edu.hanover.cs323_stephaniehannahproject;

public class Device {
    private String name;
    public static final Device[] devices = {
            new Device("Laptop"),
            new Device("Phone"),
            new Device("Tablet"),
            new Device("Other")
    };

    private Device(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return this.name;
    }
}
