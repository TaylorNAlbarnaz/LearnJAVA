package edu.taylor.modulo2.fifo;

public class FNode {
    private Object object;
    private FNode refFNode;

    public FNode(Object object) {
        this.refFNode = null;
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public FNode getRefNode() {
        return refFNode;
    }

    public void setRefNode(FNode refFNode) {
        this.refFNode = refFNode;
    }

    @Override
    public String toString() {
        return "Node { " +
                "object: " + object +
                " }";
    }
}
