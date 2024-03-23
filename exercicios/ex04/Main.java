package exercicios.ex04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = leitor.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = leitor.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Resto da divisão");
        int operacao = leitor.nextInt();

        switch (operacao) {
            case 1:
                System.out.println("Soma: " + (numero1 + numero2));
                break;
            case 2:
                System.out.println("Subtração: " + (numero1 - numero2));
                break;
            case 3:
                System.out.println("Multiplicação: " + (numero1 * numero2));
                break;
            case 4:
                if (numero2 != 0) {
                    System.out.println("Divisão: " + (numero1 / numero2));
                } else {
                    System.out.println("Não é possível dividir por zero.");
                }
                break;
            case 5:
                if (numero2 != 0) {
                    System.out.println("Resto da divisão: " + (numero1 % numero2));
                } else {
                    System.out.println("Não é possível calcular o resto da divisão por zero.");
                }
                break;
            default:
                System.out.println("Opção inválida.");

                leitor.close();
        }
    }
}
