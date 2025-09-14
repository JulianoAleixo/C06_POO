package br.inatel.pcmania.computer;

public class BasicHardware {
    // Attributes
    private String name;
    private float capacity;

    // Constructor
    public BasicHardware(String name, float capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Getters
    public String getName() {
        return name;
    }

    public float getCapacity() {
        return capacity;
    }
}