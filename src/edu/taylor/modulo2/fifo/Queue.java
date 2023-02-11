package edu.taylor.modulo2.fifo;

public class Queue {
    private FNode refEntryFNode;

    public Queue() {
        this.refEntryFNode = null;
    }

    public boolean isEmpty() {
        return refEntryFNode == null;
    }

    public void enqueue(Object obj) {
        FNode newFNode = new FNode(obj);
        newFNode.setRefNode(refEntryFNode);
        refEntryFNode = newFNode;
    }

    public Object first() {
        if (!isEmpty()) {
            FNode firstFNode = refEntryFNode;
            while (firstFNode.getRefNode() != null) {
                firstFNode = firstFNode.getRefNode();
            }
            return firstFNode.getObject();
        }
        return null;
    }

    public Object dequeue() {
        if (!isEmpty()) {
            FNode firstFNode = refEntryFNode;
            FNode auxiliarFNode = refEntryFNode;

            while (firstFNode.getRefNode() != null) {
                auxiliarFNode = firstFNode;
                firstFNode = firstFNode.getRefNode();
            }
            auxiliarFNode.setRefNode(null);
            return firstFNode.getObject();
        }
        return null;
    }

    @Override
    public String toString() {
        String returnString = "";
        FNode auxiliarFNode = refEntryFNode;

        if (!isEmpty()) {
            while (true) {
                returnString += "[ Node { object: " + auxiliarFNode.getObject() + " } ] ---> ";
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
