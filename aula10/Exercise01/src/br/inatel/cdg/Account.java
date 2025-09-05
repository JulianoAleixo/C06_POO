package br.inatel.cdg;

public class Account {
    // Attributes
    private int number;
    private float balance;
    private float limit;
    private Client[] clients;

    // Methods
    public void withdraw(float amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else{
            System.out.println("Saldo Insuficiente");
        }
    }

    public void deposit(float amount) {
        this.balance += amount;
    }

    // Constructor
    public Account() {
        setClients(new Client[3]);
    }

    // Getters and Setters
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public float getBalance() {
        return balance;
    }

    public float getLimit() {
        return limit;
    }

    public void setLimit(float limit) {
        this.limit = limit;
    }

    public Client[] getClients() {
        return clients;
    }

    public void setClients(Client[] clients) {
        this.clients = clients;
    }
}
