package com.javalinkedlist;

public interface INode<K> {
    K getKey();
    void setKey(K ket);

    INode getNext();
    void setNext(INode next);
}
