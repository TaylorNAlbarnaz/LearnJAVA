package edu.taylor.modulo2.lifo;

public class Pile {

    private Node refNodeEntry;

    public Pile() {
        this.refNodeEntry = null;
    }

    public void push(Node newNode) {
        Node refAuxiliar = refNodeEntry;
        refNodeEntry = newNode;
        refNodeEntry.setRefNode(refAuxiliar);
    }

    public void pop() {
        if (!isEmpty()) {
            refNodeEntry = refNodeEntry.getRefNode();
        }
    }

    public Node top() {
        return refNodeEntry;
    }

    public boolean isEmpty() {
        return refNodeEntry == null;
    }

    @Override
    public String toString() {
        String returnString = "-------------\n";
        returnString += "   Pilha\n";
        returnString += "-------------\n";

        Node auxiliarNode = refNodeEntry;

        while (auxiliarNode != null) {
            returnString += "[ Node { dado: " + auxiliarNode.getData() + " } ]\n";
            auxiliarNode = auxiliarNode.getRefNode();
        }

        returnString += "-------------\n";
        return returnString;
    }
}
