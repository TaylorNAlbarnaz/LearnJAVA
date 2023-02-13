package edu.taylor.modulo2.doublechain;

public class DoubleNode<T> {
    private T data;
    private DoubleNode<T> nextRef;
    private DoubleNode<T> prevRef;

    public DoubleNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public DoubleNode<T> getNextRef() {
        return nextRef;
    }

    public void setNextRef(DoubleNode<T> nextRef) {
        this.nextRef = nextRef;
    }

    public DoubleNode<T> getPrevRef() {
        return prevRef;
    }

    public void setPrevRef(DoubleNode<T> prevRef) {
        this.prevRef = prevRef;
    }

    @Override
    public String toString() {
        return "DoubleNode{" +
                "data=" + data +
                '}';
    }
}
