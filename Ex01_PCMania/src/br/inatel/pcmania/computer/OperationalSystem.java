package br.inatel.pcmania.computer;

public class OperationalSystem {
    // Attributes
    private String name;
    private int type;

    // Constructor
    public OperationalSystem(String name, int type) {
        this.name = name;
        this.type = type;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getType() {
        return type;
    }
}
