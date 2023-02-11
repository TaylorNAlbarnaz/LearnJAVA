package edu.taylor.modulo2.lifo;

public class Main {
    public static void main(String[] args) {
        Pile myPile = new Pile();

        myPile.push(new Node(1));
        myPile.push(new Node(2));
        myPile.push(new Node(3));
        myPile.push(new Node(4));
        myPile.push(new Node(5));

        System.out.println(myPile);

        myPile.pop();
        myPile.pop();

        System.out.println(myPile);
    }
}
