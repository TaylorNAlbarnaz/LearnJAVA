package edu.taylor.modulo2.tree;

public class Tree<T extends Comparable<T>> {
    public BinaryNode<T> root;

    public Tree() {
        this.root = null;
    }

    public void add(T data) {
        BinaryNode<T> newBinaryNode = new BinaryNode<>(data);
        root = add(root, newBinaryNode);
    }

    private BinaryNode<T> add(BinaryNode<T> current, BinaryNode<T> newBinaryNode) {
        if (current == null) {
            return newBinaryNode;
        } else if (newBinaryNode.getData().compareTo(current.getData()) < 0) {
            current.setLeftRef(add(current.getLeftRef(), newBinaryNode));
        } else {
            current.setRightRef(add(current.getRightRef(), newBinaryNode));
        }
        return current;
    }

    public void showInOrder() {
        System.out.println();
        System.out.println("InOrder: ");
        showInOrder(root);
    }

    private void showInOrder(BinaryNode<T> current) {
        if (current != null) {
            showInOrder(current.getLeftRef());
            System.out.print(current.getData() + ", ");
            showInOrder(current.getRightRef());
        }
    }

    public void showPostOrder() {
        System.out.println();
        System.out.println("PostOrder: ");
        showPostOrder(root);
    }

    private void showPostOrder(BinaryNode<T> current) {
        if (current != null) {
            showPostOrder(current.getLeftRef());
            showPostOrder(current.getRightRef());
            System.out.print(current.getData() + ", ");
        }
    }

    public void showPreOrder() {
        System.out.println();
        System.out.println("PreOrder: ");
        showPreOrder(root);
    }

    private void showPreOrder(BinaryNode<T> current) {
        if (current != null) {
            System.out.print(current.getData() + ", ");
            showPreOrder(current.getLeftRef());
            showPreOrder(current.getRightRef());
        }
    }

    public void remove(T data) {
        try {
            BinaryNode<T> current = root;
            BinaryNode<T> parent = null;
            BinaryNode<T> child;
            BinaryNode<T> temp;

            while (current != null && !current.getData().equals(data)) {
                parent = current;
                if (data.compareTo(current.getData()) < 0) {
                    current = current.getLeftRef();
                } else {
                    current = current.getRightRef();
                }
            }

            if (current == null) {
                System.out.println("Data not found in tree!");
            }

            if (parent == null) {
                if (current.getRightRef() == null) {
                    this.root = current.getLeftRef();
                } else if (current.getLeftRef() == null) {
                    this.root = current.getRightRef();
                } else {
                    for (temp = current, child = current.getLeftRef();
                        child.getRightRef() != null;
                        temp = child, child = child.getLeftRef()
                    ) {
                        if (child != current.getLeftRef()) {
                            temp.setRightRef(child.getLeftRef());
                            child.setLeftRef(root.getLeftRef());
                        }
                    }
                    child.setRightRef(root.getRightRef());
                    root = child;
                }
            } else if (current.getRightRef() == null) {
                if (parent.getLeftRef() == current) {
                    parent.setLeftRef(current.getLeftRef());
                } else {
                    parent.setRightRef(current.getLeftRef());
                }
            } else if (current.getLeftRef() == null) {
                if (parent.getLeftRef() == current) {
                    parent.setLeftRef(current.getRightRef());
                } else {
                    parent.setRightRef(current.getRightRef());
                }
            } else {
                for (
                        temp = current, child = current.getLeftRef();
                        child.getLeftRef() != null;
                        temp = child, child = child.getRightRef()
                ) {
                    if (child != current.getLeftRef()) {
                        temp.setRightRef(child.getLeftRef());
                        child.setLeftRef(current.getLeftRef());
                    }
                    child.setRightRef(current.getRightRef());
                    if (parent.getLeftRef() == current) {
                        parent.setLeftRef(child);
                    } else {
                        parent.setRightRef(child);
                    }
                }
            }
        } catch (NullPointerException err) {
            System.out.println("Data not found!");
        }
    }
}
