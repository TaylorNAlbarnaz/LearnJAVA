package edu.taylor.modulo2.lifo;

public class LNode {
    private int data;
    private LNode refLNode = null;

    public LNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public LNode getRefNode() {
        return refLNode;
    }

    public void setRefNode(LNode refLNode) {
        this.refLNode = refLNode;
    }

    @Override
    public String toString() {
        return "Node { " +
                "data: " + data +
                " }";
    }
}
