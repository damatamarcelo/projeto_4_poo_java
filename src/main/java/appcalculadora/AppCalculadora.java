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
        try (Scanner input = new Scanner(System.in)) {
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
                        System.out.println("Informe o seu primeiro nome: ");
                        String nomeSm = input.nextLine().toUpperCase();

                        System.out.println("Informe o primeiro número: ");
                        double vlrXSm = input.nextDouble();

                        System.out.println("Informe o segundo número: ");
                        double vlrYSm = input.nextDouble();

                        Calculos calc = new Calculos(vlrXSm, vlrYSm);
                        double result = calc.soma(vlrXSm, vlrYSm);

                        System.out.println(
                                "Olá " + nomeSm + ", o resultado de " + vlrXSm + " + " + vlrYSm + " é = " + result);
                        break;
                    case 2:
                        System.out.println("Informe o seu primeiro nome: ");
                        String nomeSb = input.nextLine().toUpperCase();

                        System.out.println("Informe o primeiro número: ");
                        double vlrXSb = input.nextDouble();

                        System.out.println("Informe o segundo número: ");
                        double vlrYSb = input.nextDouble();

                        Calculos calcSb = new Calculos(vlrXSb, vlrYSb);
                        double resultSb = calcSb.soma(vlrXSb, vlrYSb);

                        System.out.println(
                                "Olá " + nomeSb + ", o resultado de " + vlrXSb + " - " + vlrYSb + " é = " + resultSb);
                        break;
                    case 3:
                        System.out.println("Informe o seu primeiro nome: ");
                        String nomeMt = input.nextLine().toUpperCase();

                        System.out.println("Informe o primeiro número: ");
                        double vlrXMt = input.nextDouble();

                        System.out.println("Informe o segundo número: ");
                        double vlrYMt = input.nextDouble();

                        Calculos calcMt = new Calculos(vlrXMt, vlrYMt);
                        double resultMt = calcMt.multiplicacao(vlrXMt, vlrYMt);

                        System.out.println(
                                "Olá " + nomeMt + ", o resultado de " + vlrXMt + " * " + vlrYMt + " é = " + resultMt);
                        break;
                    case 4:
                        System.out.println("Informe o seu primeiro nome: ");
                        String nomeDv = input.nextLine().toUpperCase();

                        System.out.println("Informe o primeiro número: ");
                        double vlrXDv = input.nextDouble();

                        System.out.println("Informe o segundo número: ");
                        double vlrYDv = input.nextDouble();

                        Calculos calcDv = new Calculos(vlrXDv, vlrYDv);
                        double resultDv = calcDv.divisao(vlrXDv, vlrYDv);

                        System.out.println(
                                "Olá " + nomeDv + ", o resultado de " + vlrXDv + " / " + vlrYDv + " é = " + resultDv);
                        break;
                    case 5:
                        
                        break;
                    case 0:
                        System.out.println("Saindo...");
                    default:
                        System.out.println("Operação inválida! Tente novamente.");
                        mostrarMenu();
                }
            } while (opcao == 0);
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        menuOpcoes();
    }
}
