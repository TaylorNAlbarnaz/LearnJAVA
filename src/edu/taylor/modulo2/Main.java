package edu.taylor.modulo2;

import edu.taylor.modulo2.chain.Chain;
import edu.taylor.modulo2.fifo.Queue;
import edu.taylor.modulo2.lifo.LNode;
import edu.taylor.modulo2.lifo.Pile;

public class Main {
    public static void main(String[] args) {
        showLifo();
        showFifo();
        showChain();
    }

    public static void showLifo() {
        Pile<Integer> myPile = new Pile<>();

        myPile.push(new LNode<>(1));
        myPile.push(new LNode<>(2));
        myPile.push(new LNode<>(3));
        myPile.push(new LNode<>(4));
        myPile.push(new LNode<>(5));

        System.out.println(myPile);

        myPile.pop();
        myPile.pop();

        System.out.println(myPile);
    }

    public static void showFifo() {
        Queue<String> myQueue = new Queue<>();

        myQueue.enqueue("primeiro");
        myQueue.enqueue("segundo");
        myQueue.enqueue("terceiro");
        myQueue.enqueue("quarto");
        myQueue.enqueue("quinto");

        System.out.println(myQueue);

        myQueue.dequeue();
        myQueue.dequeue();

        System.out.println(myQueue);
    }

    public static void showChain() {
        Chain<String> myChain = new Chain<>();

        myChain.add("Item 1");
        myChain.add("Item 2");
        myChain.add("Item 3");
        myChain.add("Item 4");
        myChain.add("Item 5");

        System.out.println(myChain);

        myChain.remove(4);
        myChain.remove(3);

        System.out.println(myChain);
    }
}
