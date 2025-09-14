package br.inatel.pcmania.computer;

public class USBMemory {
    // Attributes
    private String name;
    private int capacity;

    // Constructor
    public USBMemory(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
}
