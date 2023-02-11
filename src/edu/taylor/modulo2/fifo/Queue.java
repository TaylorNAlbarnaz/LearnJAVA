package edu.taylor.modulo2.fifo;

public class Queue<T> {
    private FNode<T> refEntryFNode;

    public Queue() {
        this.refEntryFNode = null;
    }

    public boolean isEmpty() {
        return refEntryFNode == null;
    }

    public void enqueue(T data) {
        FNode<T> newFNode = new FNode<>(data);
        newFNode.setRefNode(refEntryFNode);
        refEntryFNode = newFNode;
    }

    public T first() {
        if (!isEmpty()) {
            FNode<T> firstFNode = refEntryFNode;
            while (firstFNode.getRefNode() != null) {
                firstFNode = firstFNode.getRefNode();
            }
            return firstFNode.getData();
        }
        return null;
    }

    public T dequeue() {
        if (!isEmpty()) {
            FNode<T> firstFNode = refEntryFNode;
            FNode<T> auxiliarFNode = refEntryFNode;

            while (firstFNode.getRefNode() != null) {
                auxiliarFNode = firstFNode;
                firstFNode = firstFNode.getRefNode();
            }
            auxiliarFNode.setRefNode(null);
            return firstFNode.getData();
        }
        return null;
    }

    @Override
    public String toString() {
        String returnString = "";
        FNode<T> auxiliarFNode = refEntryFNode;

        if (!isEmpty()) {
            while (true) {
                returnString += "[ Node { object: " + auxiliarFNode.getData() + " } ] ---> ";
                if (auxiliarFNode.getRefNode() != null) {
                    auxiliarFNode = auxiliarFNode.getRefNode();
                } else {
                    break;
                }
            }
            returnString += "null";
        } else {
            returnString = "null";
        }

        return returnString;
    }
}
