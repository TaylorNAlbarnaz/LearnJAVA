package edu.taylor.modulo2.chain;

public class Chain<T> {
    ONode<T> entryRef;

    public Chain() {
        this.entryRef = null;
    }

    public void add(T data) {
        ONode<T> newONode = new ONode<>(data);
        if (this.isEmpty()) {
            entryRef = newONode;
            return;
        }

        ONode<T> auxiliarRef = entryRef;
        for (int i = 0; i < this.size()-1; i++) {
            auxiliarRef = auxiliarRef.getNextONode();
        }

        auxiliarRef.setNextONode(newONode);
    }

    public T get(int index) {
        return getONode(index).getData();
    }

    private ONode<T> getONode(int index) {
        checkValidIndex(index);

        ONode<T> auxiliarRef = entryRef;
        ONode<T> returnRef = null;

        for (int i = 0; i <= index; i++) {
            returnRef = auxiliarRef;
            auxiliarRef = auxiliarRef.getNextONode();
        }

        return returnRef;
    }

    private void checkValidIndex(int index) {
        if (index >= size()) {
            throw new IndexOutOfBoundsException("Chain doesn't have a " + index + " index!");
        }
    }

    public T remove(int index) {
        ONode<T> pivotRef = getONode(index);
        if (index == 0) {
            entryRef = pivotRef.getNextONode();
            return pivotRef.getData();
        }

        ONode<T> previousRef = getONode(index - 1);
        previousRef.setNextONode(pivotRef.getNextONode());

        return pivotRef.getData();
    }

    public int size() {
        int chainSize = 0;

        ONode<T> auxiliarRef = entryRef;
        while (true) {
            if (auxiliarRef == null)
                break;

            chainSize++;
            if (auxiliarRef.getNextONode() == null)
                break;

            auxiliarRef = auxiliarRef.getNextONode();
        }

        return chainSize;
    }

    public boolean isEmpty() {
        return entryRef == null;
    }

    @Override
    public String toString() {
        String returnString = "Chain: ";

        ONode<T> auxiliarRef = entryRef;
        for (int i = 0; i < size(); i++) {
            returnString += "[ Node { data: " + auxiliarRef.getData() + " } ] ---> ";
            auxiliarRef = auxiliarRef.getNextONode();
        }
        returnString += "null";

        return returnString;
    }
}
