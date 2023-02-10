package edu.taylor.modulo2.nos;

public class Main {
    public static void main(String[] args) {
        No no1 = new No("Conteúdo nó1");

        No no2 = new No("Conteúdo nó2");
        no1.setProximoNo(no2);

        No no3 = new No("Conteúdo nó3");
        no2.setProximoNo(no3);

        No no4 = new No("Conteúdo nó4");
        no3.setProximoNo(no4);

        //no1->no2->no3->no4->null

        No currentNo = no1;
        while (currentNo != null) {
            System.out.println(currentNo);
            currentNo = currentNo.getProximoNo();
        }
    }   
}