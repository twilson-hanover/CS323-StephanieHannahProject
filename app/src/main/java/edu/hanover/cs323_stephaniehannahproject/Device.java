package edu.hanover.cs323_stephaniehannahproject;

public class Device {
    private String name;

    //drinks is an array of Device
    public static final Device[] devices = {
            new Device("Laptop"),
            new Device("Phone"),
            new Device("Tablet"),
            new Device("Other")
    };

    //Each Drink has a name, description, and an image resource
    private Device(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
