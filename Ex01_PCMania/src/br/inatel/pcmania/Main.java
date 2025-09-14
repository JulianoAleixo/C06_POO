/*
 * Nome: Juliano Moreira Aleixo
 * Matrícula: GES 501
 * Turma: C06-B
 * Github: https://github.com/julianoaleixo
 * Contato: https://julianoaleixo.dev
 * */

package br.inatel.pcmania;

import br.inatel.pcmania.client.Client;
import br.inatel.pcmania.computer.BasicHardware;
import br.inatel.pcmania.computer.Computer;
import br.inatel.pcmania.computer.OperationalSystem;
import br.inatel.pcmania.computer.USBMemory;

import java.util.Scanner;

import static br.inatel.pcmania.utils.ProcessOrder.helper;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BasicHardware[] basicHardware1 = {
                new BasicHardware("Pentium Core i3 - MHz", 2200),
                new BasicHardware("Memória RAM - GB", 8),
                new BasicHardware("HD - GB", 500)
        };
        BasicHardware[] basicHardware2 = {
                new BasicHardware("Pentium Core i5 - MHz", 3370),
                new BasicHardware("Memória RAM - GB", 16),
                new BasicHardware("HD - TB", 1)
        };
        BasicHardware[] basicHardware3 = {
                new BasicHardware("Pentium Core i7 - MHz", 4500),
                new BasicHardware("Memória RAM", 32),
                new BasicHardware("HD - TB", 2)
        };

        OperationalSystem operationalSystem1 = new OperationalSystem("macOS Sequoia", 64);
        OperationalSystem operationalSystem2 = new OperationalSystem("Windows 8", 64);
        OperationalSystem operationalSystem3 = new OperationalSystem("Windows 10", 64);

        Computer[] computers = {
                new Computer("Apple", 501, basicHardware1, operationalSystem1),
                new Computer("Samsung", 501 + 1234, basicHardware2, operationalSystem2),
                new Computer("Dell", 501 + 5678, basicHardware3, operationalSystem3)
        };

        USBMemory[] usbMemories = {
                new USBMemory("Pen-drive - GB", 16),
                new USBMemory("Pen-drive - GB", 32),
                new USBMemory("HD Externo - TB", 1),
        };

        for (int i = 0; i < computers.length; i++) {
            computers[i].addUSBMemory(usbMemories[i]);
        }

        System.out.println("Bem vindo à PC Mania!");
        System.out.println("Digite seu nome:");
        String name = sc.nextLine();
        System.out.println("Digite seu CPF:");
        String cpf  = sc.nextLine();
        Client client = new Client(name, cpf);

        Computer[] purchasedComputers = new Computer[99];
        int pcCount = 0;
        int choice;

        do {
            if (pcCount == purchasedComputers.length) {
                break;
            }

            System.out.println("Escolha uma das promoções abaixo:");
            System.out.println("-------------------------------------------------------");
            for (int i = 0; i < computers.length; i++) {
                    System.out.printf("Promoção %d: \n", i + 1);
                    System.out.printf("%s - R$%.2f\n\n", computers[i].getBrand(), computers[i].getPrice());
            }
            System.out.println("-------------------------------------------------------");
            System.out.println("Digite o número da promoção ou 0 para finalizar a compra:");

            choice = sc.nextInt();
            if (choice >= 1 && choice <= 3) {
                purchasedComputers[pcCount] = computers[choice - 1];
                pcCount++;
                System.out.printf("PC da Promoção %d adicionado ao carrinho!\n\n", choice);
            } else if (choice != 0) {
                System.out.println("[Erro] Valor inválido. Tente novamente.\n");
            }
        } while (choice != 0);

        Computer[] finalPurchasedComputers = new Computer[pcCount];
        for (int i = 0; i < pcCount; i++) {
            if (purchasedComputers[i] == null) {
                break;
            }
            finalPurchasedComputers[i] = purchasedComputers[i];
        }

        client.setComputers(finalPurchasedComputers);

        System.out.println("\n-------------------------------------------------------");
        System.out.println("               Resumo da sua Compra");
        System.out.println("-------------------------------------------------------");
        System.out.printf("Nome do cliente: %s\n", client.getName());
        System.out.printf("CPF do cliente: %s\n", client.getCpf());
        System.out.printf("Total da compra: R$ %.2f\n\n", client.calculateTotalPurchase());

        for (int i = 0; i < finalPurchasedComputers.length; i++) {
            if (finalPurchasedComputers[i] != null) {
                System.out.printf("----------------- PC Adquirido %d -----------------\n", i + 1);
                finalPurchasedComputers[i].showPCConfigs();
            }
        }

        helper(finalPurchasedComputers);

        sc.close();
    }
}