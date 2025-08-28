import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int x = rand.nextInt(2);
        int y = rand.nextInt(2);

        int maxSize;

        do {
            System.out.print("Digite o número de linhas/colunas do tabuleiro: ");
            maxSize = sc.nextInt();
            if (maxSize < 2) {
                System.out.println("[Erro] Tamanho precisa ser maior igual a 2.");
            }
        } while (maxSize < 2);

        int[][] board = new int[maxSize][maxSize];

        board[x][y] = -1;

        boolean found = false;

        while(true){
            int xUser;
            int yUser;
            do {
                System.out.printf("Digite um número (0 até %d) para X: \n", maxSize);
                xUser =  sc.nextInt();
                if (xUser < 0 || xUser > maxSize) {
                    System.out.println("[Erro] Número inválido");
                }
            } while (xUser < 0 || xUser > maxSize);

            do {
                System.out.printf("Digite um número (0 até %d) para Y: \n", maxSize);
                yUser =  sc.nextInt();
                if (yUser < 0 || yUser > maxSize) {
                    System.out.println("[Erro] Número inválido");
                }
            }  while (yUser < 0 || yUser > maxSize);

            if (board[xUser][yUser] == -1) {
                System.out.println("Booommmmmm!!!!!!");
                found = true;
            } else if(board[xUser][yUser] == 1){
                System.out.println("Posição já visitada");
            } else {
                board[xUser][yUser] = 1;
                System.out.println("Bomba não está nesta posição.");
            }

            System.out.println();

            int lines = 3 * maxSize - 1;
            for (int i = 0; i < lines; i++) {
                System.out.print("-");
            }
            System.out.println();

            for (int i = 0; i< board.length; i++){
                for (int j = 0; j< board[i].length; j++){
                    switch (board[i][j]) {
                        case 0:
                            System.out.print("  ");
                            break;
                        case 1:
                            System.out.print("🚩");
                            break;
                        case -1:
                            if (found) {
                                System.out.print("💣");
                            } else {
                                System.out.print("  ");
                            }
                            break;
                    }
                    if (j < board[i].length - 1) {
                        System.out.print("|");
                    }
                }
                System.out.println();
                for (int k = 0; k < lines; k++) {
                    System.out.print("-");
                }
                System.out.println();
            }

            if (found) {
                break;
            }
        }

        sc.close();
    }
}