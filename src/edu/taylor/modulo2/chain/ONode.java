package edu.taylor.modulo2.chain;

public class ONode<T> {
    private T data;
    private ONode<T> nextONode;

    public ONode() {
        this.nextONode = null;
    }

    public ONode(T data) {
        this.nextONode = null;
        this.data = data;
    }

    public ONode(T data, ONode<T> nextONode) {
        this.nextONode = nextONode;
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ONode<T> getNextONode() {
        return nextONode;
    }

    public void setNextONode(ONode<T> nextONode) {
        this.nextONode = nextONode;
    }

    @Override
    public String toString() {
        return "ONode{" +
                "data=" + data +
                '}';
    }

    public String toStringList() {
        String str = toString();

        if (nextONode != null) {
            str += " -> " + nextONode;
        } else {
            str += " -> null";
        }

        return str;
    }
}
