package edu.taylor.modulo2.doublechain;

public class DoubleChain<T> {
    private DoubleNode<T> entryRef;
    private DoubleNode<T> lastRef;

    private int listSize;

    public DoubleChain() {
        entryRef = null;
        lastRef = null;
        this.listSize = 0;
    }

    public int size() {
        return listSize;
    }

    public void add(T data) {
        DoubleNode<T> newDoubleNode = new DoubleNode<>(data);
        newDoubleNode.setNextRef(null);
        newDoubleNode.setPrevRef(lastRef);

        if (entryRef == null)
            entryRef = newDoubleNode;
        if (lastRef != null)
            lastRef.setNextRef(newDoubleNode);

        lastRef = newDoubleNode;
        listSize++;
    }

    public void add(T data, int index) {
        DoubleNode<T> auxiliarRef = getDoubleNode(index);
        DoubleNode<T> newDoubleNode = new DoubleNode<>(data);
        newDoubleNode.setNextRef(auxiliarRef);

        if (newDoubleNode.getNextRef() != null) {
            newDoubleNode.setPrevRef(auxiliarRef.getNextRef());
            newDoubleNode.getNextRef().setPrevRef(newDoubleNode);
        } else {
            newDoubleNode.setPrevRef(lastRef);
            lastRef = newDoubleNode;
        }

        if (index == 0) {
            entryRef = auxiliarRef;
        } else {
            newDoubleNode.getPrevRef().setNextRef(newDoubleNode);
        }

        listSize++;
    }

    public void remove(int index) {
        if (index == 0) {
            entryRef = entryRef.getNextRef();
            if (entryRef != null) {
                entryRef.setPrevRef(null);
            }
        } else {
            DoubleNode<T> auxiliarRef = getDoubleNode(index);
            auxiliarRef.getPrevRef().setNextRef(auxiliarRef.getNextRef());

            if (auxiliarRef != lastRef) {
                auxiliarRef.getNextRef().setPrevRef(auxiliarRef.getPrevRef());
            } else {
                lastRef = auxiliarRef;
            }
        }
        listSize--;
    }

    public T get(int index) {
        return getDoubleNode(index).getData();
    }

    private DoubleNode<T> getDoubleNode(int index) {
        DoubleNode<T> auxiliarRef = entryRef;

        for (int i=0; (i < index) && (auxiliarRef != null); i++) {
            auxiliarRef = auxiliarRef.getNextRef();
        }

        return auxiliarRef;
    }

    @Override
    public String toString() {
        String returnString = "";

        DoubleNode<T> auxiliarRef = entryRef;
        for (int i = 0; i < listSize; i++) {
            returnString += "[ Node { data: " + auxiliarRef.getData() + " } ] ---> ";
            auxiliarRef = auxiliarRef.getNextRef();
        }
        returnString += "null";

        return returnString;
    }
}
