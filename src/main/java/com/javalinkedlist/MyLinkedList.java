package com.javalinkedlist;

public class MyLinkedList<K>  {
        public INode<K> head;
        public INode<K> tail;
        public MyLinkedList() {
            this.head = head;
            this.tail = tail;
        }
        public void add(INode<K> newNode) {
            if(this.tail == null) {
                this.tail = newNode;
            }
            if(this.head == null) {
                this.head = newNode;
            }
            else {
                INode<K> tempNode = this.head;
                this.head = newNode;
                this.head.setNext(tempNode);
            }
        }
        public void append(INode newNode) {
            if(this.tail == null) {
                this.tail = newNode;
            }
            if(this.head == null) {
                this.head = newNode;
            }
            else {
                this.tail.setNext(newNode);
                this.tail = newNode;
                //          INode<K> tempNode = this.head;//       this.head = newNode;
                //         this.head.setNext(tempNode);
            }
        }
        public void insert(INode destNode, INode newNode) {
            INode tempNode = this.head;
            while (!tempNode.getKey().equals(destNode.getKey())) {
                tempNode = tempNode.getNext();
            }
            newNode.setNext(tempNode.getNext());
            tempNode.setNext(newNode);
        }
        public void pop() {
            // INode<K> tempNode = this.head;
            this.head = this.head.getNext();
            // return tempNode;
        }
        public INode popLast() throws NullPointerException {
            if (this.head == null)
                return null;
            if (this.head.getNext().equals(null))
                return null;
            else{
                INode tempNode = head;
                while (!tempNode.getNext().equals(tail)){
                }
                INode tempLastNode = tempNode.getNext();
                tempLastNode.setNext(null);
                return tempLastNode;
            }
        }
        public void printMyNodes() {
            StringBuffer myNodes = new StringBuffer("My Nodes: ");
            INode tempNode = head;
            while(tempNode.getNext() != null) {
                myNodes.append(tempNode.getKey());
                if(!tempNode.equals(tail))
                    myNodes.append("->");
                tempNode = tempNode.getNext();
            }
            myNodes.append(tempNode.getKey());
            System.out.println(myNodes);
        }
    }
