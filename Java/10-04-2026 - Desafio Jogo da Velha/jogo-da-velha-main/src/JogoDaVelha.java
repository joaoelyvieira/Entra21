
import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {
        // Inicia o scanner para leitura de entrada do jogador
        // Cria o tabuleiro 3x3 do jogo da velha

        Scanner sc = new Scanner(System.in);

        int[][] tabuleiro = new int[3][3];
        int jogador = 1;

        // Loop principal do jogo, executa até alguém vencer ou empatar

        while (true) {

            mostrarTabuleiro(tabuleiro);

            System.out.println(
                    "Jogador " + jogador + " (" + (jogador == 1 ? "X" : "O") + "), insira a linha e a coluna (0-2):");

            int linha = sc.nextInt();
            int coluna = sc.nextInt();

            // Validação de limites
            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
                System.out.println("Posição inválida! Tente novamente.");
                continue;
            }

            // Verifica se a posição está livre
            if (tabuleiro[linha][coluna] != 0) {
                System.out.println("Posição já ocupada. Tente novamente.");
                continue;
            }

            // Realiza a jogada
            tabuleiro[linha][coluna] = jogador;

            // Verifica vitória
            if (verificarVitoria(tabuleiro, jogador)) {
                mostrarTabuleiro(tabuleiro);
                System.out.println("Jogador " + jogador + " venceu!");
                break;
            }

            // Verifica empate
            if (verificarEmpate(tabuleiro)) {
                mostrarTabuleiro(tabuleiro);
                System.out.println("Empate!");
                break;
            }

            // Troca de jogador
            jogador = (jogador == 1) ? 2 : 1;
        }

        sc.close();
    }

    private static void mostrarTabuleiro(int[][] tabuleiro) {
        System.out.println("\nTabuleiro:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                char simbolo;

                if (tabuleiro[i][j] == 1)
                    simbolo = 'X';
                else if (tabuleiro[i][j] == 2)
                    simbolo = 'O';
                else
                    simbolo = '|';

                System.out.print(simbolo + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static boolean verificarVitoria(int[][] tabuleiro, int jogador) {

        // Linhas
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) {
                return true;
            }
        }

        // Colunas
        for (int j = 0; j < 3; j++) {
            if (tabuleiro[0][j] == jogador && tabuleiro[1][j] == jogador && tabuleiro[2][j] == jogador) {
                return true;
            }
        }

        // Diagonal
        if (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) {
            return true;
        }

        // Diagonal
        if (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador) {
            return true;
        }

        return false;
    }

    private static boolean verificarEmpate(int[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
