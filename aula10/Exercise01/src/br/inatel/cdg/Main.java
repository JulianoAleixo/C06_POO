package br.inatel.cdg;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client();
        client1.setName("Juliano");
        client1.setCpf(12345);

        Client client2 = new Client();
        client2.setName("Chris");
        client2.setCpf(67890);

        Client[] clients = new Client[2];
        clients[0] = client1;
        clients[1] = client2;

        Account account = new Account();
        account.setClients(clients);
        account.setNumber(501);
        account.setLimit(123);
        account.deposit(1000);
        System.out.printf("Saldo da conta %d: R$%.2f\n", account.getNumber(), account.getBalance());
        account.withdraw(500);
        System.out.printf("Saldo da conta %d: R$%.2f\n", account.getNumber(), account.getBalance());
        account.withdraw(510);
    }
}
