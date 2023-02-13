package edu.taylor.modulo2.circular;

public class Circular<T> {
    public CircleNode<T> head;
    public CircleNode<T> tail;
    private int listSize;

    public Circular() {
        this.head = null;
        this.tail = null;
        this.listSize = 0;
    }

    public boolean isEmpty() {
        return this.listSize == 0;
    }

    public int size() {
        return this.listSize;
    }

    public T get(int index) {
        return getCircleNode(index).getData();
    }

    public CircleNode<T> getCircleNode(int index) {
        if (this.isEmpty())
            throw new IndexOutOfBoundsException("The list is empty!");

        if (index == 0)
            return tail;

        CircleNode<T> auxiliarRef = tail;
        for (int i = 0; (i < index) && (auxiliarRef != null); i++) {
            auxiliarRef = auxiliarRef.getNextRef();
        }

        return auxiliarRef;
    }

    public void remove(int index) {
        if (index >= listSize)
            throw new IndexOutOfBoundsException("Index out of list size!");

        CircleNode<T> auxiliarRef = tail;
        if (index == 0) {
            tail = tail.getNextRef();
            head.setNextRef(tail);
        } else if (index == 1) {
            tail.setNextRef(tail.getNextRef().getNextRef());
        } else {
            for (int i = 0; i < index; i++) {
                auxiliarRef = auxiliarRef.getNextRef();
            }
            auxiliarRef.setNextRef(auxiliarRef.getNextRef().getNextRef());

            if (index == listSize-1) {
                tail = auxiliarRef.getNextRef();
            }
        }
        
        listSize--;
    }

    public void add(T data) {
        CircleNode<T> newCircleNode = new CircleNode<>(data);

        if (isEmpty()) {
            head = newCircleNode;
            tail = head;
            head.setNextRef(tail);
        } else {
            newCircleNode.setNextRef(tail);
            head.setNextRef(newCircleNode);
            tail = newCircleNode;
        }
        listSize++;
    }

    @Override
    public String toString() {
        String returnString = "Circular: ";

        CircleNode<T> auxiliarRef = tail;
        for (int i = 0; i < listSize; i++) {
            returnString += "[ Node { data: " + auxiliarRef.getData() + " } ] ---> ";
            auxiliarRef = auxiliarRef.getNextRef();
        }

        returnString += (isEmpty()) ? "[]" : "{...}";

        return returnString;
    }
}
