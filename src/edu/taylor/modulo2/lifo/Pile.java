package edu.taylor.modulo2.lifo;

public class Pile<T> {
    private LNode<T> refLNodeEntry;

    public Pile() {
        this.refLNodeEntry = null;
    }

    public void push(LNode<T> newLNode) {
        LNode<T> refAuxiliar = refLNodeEntry;
        refLNodeEntry = newLNode;
        refLNodeEntry.setRefNode(refAuxiliar);
    }

    public void pop() {
        if (!isEmpty()) {
            refLNodeEntry = refLNodeEntry.getRefNode();
        }
    }

    public LNode<T> top() {
        return refLNodeEntry;
    }

    public boolean isEmpty() {
        return refLNodeEntry == null;
    }

    @Override
    public String toString() {
        String returnString = "";
        LNode<T> auxiliarLNode = refLNodeEntry;

        while (auxiliarLNode != null) {
            returnString += "[ Node { data: " + auxiliarLNode.getData() + " } ]\n";
            auxiliarLNode = auxiliarLNode.getRefNode();
        }
        return returnString;
    }
}
