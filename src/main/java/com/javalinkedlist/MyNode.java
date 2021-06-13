package com.javalinkedlist;

public class MyNode<K> implements INode<K> {
    public K key;
    public INode next;

    public MyNode(K key) {
        this.key = key;
        this.next = null;
    }
    @Override
    public K getKey() {
        return key;
    }
    @Override
    public void setKey(K key) {
        this.key = key;
    }
    public INode<K> getNext() {
        return next;
    }
    public void setNext(INode next) {
        this.next = (MyNode<K>) next;
    }
    @Override
    public String toString() {
        StringBuilder MyNodeString = new StringBuilder();
        MyNodeString.append("MyNode{" + "Key=").append(key).append('}');
        if (next != null)
            MyNodeString.append("->").append(next);
        return MyNodeString.toString();
    }
}

