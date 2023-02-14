package edu.taylor.modulo2.tree;

public class BinaryNode<T extends Comparable<T>> {
    private T data;
    private BinaryNode<T> leftRef;
    private BinaryNode<T> rightRef;

    public BinaryNode(T data) {
        this.leftRef = null;
        this.rightRef = null;
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BinaryNode<T> getLeftRef() {
        return leftRef;
    }

    public void setLeftRef(BinaryNode<T> leftRef) {
        this.leftRef = leftRef;
    }

    public BinaryNode<T> getRightRef() {
        return rightRef;
    }

    public void setRightRef(BinaryNode<T> rightRef) {
        this.rightRef = rightRef;
    }

    @Override
    public String toString() {
        return "BinaryNode{" +
                "data=" + data +
                '}';
    }
}
