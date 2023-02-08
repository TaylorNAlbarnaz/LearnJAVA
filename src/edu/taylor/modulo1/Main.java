package edu.taylor.modulo1;


public class Main {
    public static void main(String[] args) {
        int primeiroValor = 4;
        int segundoValor = 6;

        var resultado = multiplicar(primeiroValor, segundoValor);
        System.out.print(resultado);
    }
    
    public static int multiplicar(int primeiroValor, int segundoValor) {
        return primeiroValor * segundoValor;
    }
}