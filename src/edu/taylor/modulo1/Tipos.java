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
        System.out.print(idade + " " + ano + " " + cep + " " + letra + " " + " " + nome +
                " " + numGalaxias + " " + numPequeno + " " + numGrande);
    }
}
