package edu.taylor.modulo2.lifo;

public class LNode<T> {
    private T data;
    private LNode<T> refLNode = null;

    public LNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public LNode<T> getRefNode() {
        return refLNode;
    }

    public void setRefNode(LNode<T> refLNode) {
        this.refLNode = refLNode;
    }

    @Override
    public String toString() {
        return "Node { " +
                "data: " + data +
                " }";
    }
}
