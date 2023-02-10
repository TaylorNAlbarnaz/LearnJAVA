package edu.taylor.modulo1;

public class Tipos {
    byte idade = 21;
    short ano = 2023;
    int cep = 96570000;
    char letra = 'T';
    String nome = "Taylor";
    Long numGalaxias = 2000000000000L;
    float numPequeno = 50000.00f;
    double numGrande = 100000000000.00;

    public void mostrarVariaveis() {
        System.out.println("Idade: " + idade);
        System.out.println("Ano: " + ano);
        System.out.println("CEP: " + cep);
        System.out.println("Letra: " + letra);
        System.out.println("Nome: " + nome);
        System.out.println("Número de Galáxias: " + numGalaxias);
        System.out.println("Número Pequeno: " + numPequeno);
        System.out.println("Número Grande: " + numGrande);
    }
}
