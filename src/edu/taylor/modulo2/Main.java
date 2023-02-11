package edu.taylor.modulo2;

import edu.taylor.modulo2.fifo.Queue;
import edu.taylor.modulo2.lifo.LNode;
import edu.taylor.modulo2.lifo.Pile;

public class Main {
    public static void main(String[] args) {
        showLifo();
        showFifo();
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
        System.out.println("Top -> " + myPile.top() + "\n");
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
        System.out.println();
        System.out.println("First -> firstNode.object -> " + myQueue.first() + "\n");
    }
}
