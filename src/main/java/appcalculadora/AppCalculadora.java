package appcalculadora;

import java.util.Scanner;

public class AppCalculadora {
    public static void mostrarMenu() {
        System.out.println("-----------Seja bem vindo-----------");
        System.out.println("-----Selecione a opção desejada-----");
        System.out.println("|----1 - Soma----------------------|");
        System.out.println("|----2 - Subtração-----------------|");
        System.out.println("|----3 - Multiplicação-------------|");
        System.out.println("|----4 - Divisão-------------------|");
        System.out.println("|----5 - Raiz Quadrada-------------|");
        System.out.println("|----0 - Sair----------------------|");
    }

    public static void menuOpcoes() {
        try(Scanner input = new Scanner(System.in)) {
            int opcao = -1;

            do {
                mostrarMenu();
                System.out.println("Escolha uma opção: ");

                if (input.hasNextInt()) {
                    opcao = input.nextInt();
                    input.nextLine();
                } else {
                    System.out.println("Entrada inválida! Digite um número");
                    continue;
                }

                switch (opcao) {
                    case 1:
                        
                        break;
                
                    default:
                        break;
                }
            } while (opcao == 0);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}