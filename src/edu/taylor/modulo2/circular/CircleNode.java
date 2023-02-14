package edu.taylor.modulo2.circular;

public class CircleNode<T> {
    private T data;
    private CircleNode<T> nextRef;

    public CircleNode(T data) {
        this.nextRef = null;
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public CircleNode<T> getNextRef() {
        return nextRef;
    }

    public void setNextRef(CircleNode<T> nextRef) {
        this.nextRef = nextRef;
    }

    @Override
    public String toString() {
        return "Circular{" +
                "data=" + data +
                '}';
    }
}
