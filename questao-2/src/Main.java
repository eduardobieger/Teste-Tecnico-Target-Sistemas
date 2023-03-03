public class Main {
    public static void main(String[] args) {
        int primeiroFibonacci = 0;
        int segundoFibonacci = 1;
        int fibonacci = 0;
        int entrada = 144;

        while(fibonacci < entrada) {
            fibonacci = primeiroFibonacci + segundoFibonacci;
            primeiroFibonacci = segundoFibonacci;
            segundoFibonacci = fibonacci;
        }

        if(fibonacci == entrada) {
            System.out.println("O número informado(" + entrada + ") pertence a sequência de Fibonacci.");
        } else {
            System.out.println("O número informado(" + entrada + ") não pertence a sequência de Fibonacci.");
        }

    }
}