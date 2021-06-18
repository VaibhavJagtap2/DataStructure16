package com.javalinkedlist;
public class MyQueue {
    private final MyLinkedList myLinkedList;
    public MyQueue() {
        this.myLinkedList = new MyLinkedList();
    }
    public void queue(INode myNode) {
        myLinkedList.append(myNode);
    }
    public void printQueue() {
        myLinkedList.printMyNodes();
    }
    public INode peak() {
        return myLinkedList.head;
    }
    public INode dequeue() {
        return myLinkedList.pop();
    }
}