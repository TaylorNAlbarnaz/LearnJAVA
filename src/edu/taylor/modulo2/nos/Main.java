package edu.taylor.modulo2.nos;

public class Main {
    public static void main(String[] args) {
        //Nós de String
        No<String> noString1 = new No<String>("Conteúdo Nó 1");

        No<String> noString2 = new No<String>("Conteúdo Nó 2");
        noString1.setProximoNo(noString2);

        No<String> noString3 = new No<String>("Conteúdo Nó 3");
        noString2.setProximoNo(noString3);

        //Nós de Integer
        No<Integer> noInteger1 = new No<Integer>(1);

        No<Integer> noInteger2 = new No<Integer>(2);
        noInteger1.setProximoNo(noInteger2);

        No<Integer> noInteger3 = new No<Integer>(3);
        noInteger2.setProximoNo(noInteger3);
        
        //Visualizar cadeias de nós
        No<String> currentNoString = noString1;
        while (currentNoString != null) {
            System.out.println(currentNoString);
            currentNoString = currentNoString.getProximoNo();
        }

        System.out.println("--------------------");

        No<Integer> currentNoInteger = noInteger1;
        while (currentNoInteger != null) {
            System.out.println(currentNoInteger);
            currentNoInteger = currentNoInteger.getProximoNo();
        }
    }   
}