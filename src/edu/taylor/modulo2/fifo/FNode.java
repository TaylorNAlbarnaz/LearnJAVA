package edu.taylor.modulo2.fifo;

public class FNode<T> {
    private T data;
    private FNode<T> refFNode;

    public FNode(T data) {
        this.refFNode = null;
        this.data = data;
    }

    public T getData() { return data; }

    public void setData(T data) {
        this.data = data;
    }

    public FNode<T> getRefNode() {
        return refFNode;
    }

    public void setRefNode(FNode<T> refFNode) {
        this.refFNode = refFNode;
    }

    @Override
    public String toString() {
        return "Node { " +
                "data: " + data +
                " }";
    }
}
