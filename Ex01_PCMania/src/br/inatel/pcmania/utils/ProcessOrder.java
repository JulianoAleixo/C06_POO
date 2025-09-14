package br.inatel.pcmania.utils;

import br.inatel.pcmania.computer.Computer;

public class ProcessOrder {
    // Methods
    public static void helper(Computer[] computers) {
        if (computers.length == 0) {
            System.out.println("[Erro] Nenhum computador no pedido.");
        } else {
            System.out.println("Pedido enviado...");
        }
    }
}
