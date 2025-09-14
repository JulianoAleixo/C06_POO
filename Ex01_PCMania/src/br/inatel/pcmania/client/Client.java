package br.inatel.pcmania.client;

import br.inatel.pcmania.computer.Computer;

public class Client {
    // Attributes
    private String name;
    private String cpf;
    private Computer[] computers;

    // Methods
    public float calculateTotalPurchase() {
        float total = 0;
        for (Computer computer : this.computers) {
            if (computer == null) {
                break;
            }
            total += computer.getPrice();
        }
        return total;
    }

    // Constructor
    public Client(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
        this.computers = new Computer[10];
    }

    // Getters and Setters
    public Computer[] getComputers() {
        return computers;
    }

    public void setComputers(Computer[] computers) {
        this.computers = computers;
    }

    public String getCpf() {
        return cpf;
    }

    public String getName() {
        return name;
    }
}
