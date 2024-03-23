package exercicios.ex03;

public class Main {

    public static void main(String[] args) {
        int numeroInteiro = 10;
        double numeroDouble = 3.5;

        double numeroInteiroParaDouble = (double) numeroInteiro;

        double resultado = numeroInteiroParaDouble + numeroDouble;

        System.out.println("Soma do numeros double: " + resultado);

    }
}
