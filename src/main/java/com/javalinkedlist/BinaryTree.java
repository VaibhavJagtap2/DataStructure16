package com.javalinkedlist;

public class BinaryTree<K extends Comparable<K>> {
    private BinaryNode<K> root;

    public void add(K key) {
        this.root = this.addRecursively(root, key);
    }

    public BinaryNode<K> addRecursively(BinaryNode<K> current, K key) {
        if (current == null)
            return new BinaryNode<>(key);
        int compareResult = key.compareTo(current.key);
        if (compareResult == 0) {
            return current;
        }
        if (compareResult < 0) {
            current.left = addRecursively(current.left, key);
        } else {
            current.right = addRecursively(current.right, key);
        }
        return current;
    }

    public int getSize() {
        return this.getSizeRecursive(root);
    }

    public int getSizeRecursive(BinaryNode<K> current) {
        return current == null ? 0 : 1 + this.getSizeRecursive(current.left)
                + this.getSizeRecursive(current.right);
    }

    public boolean searchNode(K key){
        return search(root,key);
    }

    public  boolean search(BinaryNode current,K nodeToBeSearched){
        if(current==null){
            return false;
        }if(current.key== nodeToBeSearched){
            return true;
        }
        boolean result=false;
        if(current.key.compareTo(nodeToBeSearched)>0){
            result=search(current.left,nodeToBeSearched);
        }else if(current.key.compareTo(nodeToBeSearched)<0){
            result=search(current.right,nodeToBeSearched);
        }
        return result;
    }
}

