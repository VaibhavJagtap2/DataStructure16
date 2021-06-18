package com.javalinkedlist;

public class MyLinkedList<K>  {
        public INode<K> head;
        public INode<K> tail;
        public static int count;

        public static int getCount(){
            return count;
        }
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
            if(this.head == null) {
                this.head = newNode;
            }
            if(this.tail == null) {
                this.tail = newNode;
            }
            else {

                INode tempNode = this.head;
                while (tempNode.getNext() != null) {
                    tempNode = tempNode.getNext();
                }
                tempNode.setNext(newNode);
                this.tail = newNode;
            }
        }
    public void insert(INode myNode, INode newNode) {
        INode tempNode=myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
        }
        public INode pop() {
             INode<K> tempNode = this.head;
            this.head = this.head.getNext();
             return tempNode;
        }
        public INode popLast() throws NullPointerException {
            if (this.head == null)
                return null;
            if (this.head.getNext().equals(null))
                return null;
            else {
                INode tempNode = head;
                while (!tempNode.getNext().equals(tail)) {
                }
                INode tempLastNode = tempNode.getNext();
                tempLastNode.setNext(null);
                return tempLastNode;
            }
        }
    public  INode search(K key ) {
        INode tempNode=this.head;
        while (tempNode!=null && tempNode.getNext()!=null){
            if(tempNode.getNext().equals(key)){
                tempNode=tempNode.getNext();
                return tempNode;
            }
        }
        return null;
    }
    public void sorted(INode newNode){
            count++;
            INode currentNode = this.head;
            INode prevNode = null;
            while (currentNode != null && (int) newNode.getKey() > (int) currentNode.getKey()) {
                prevNode = currentNode;
                currentNode = currentNode.getNext();
            }
            if (prevNode == null) {
                this.head = newNode;
            }else {
                prevNode.setNext(newNode);
            }
            newNode.setNext(currentNode);
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

    public void insertMiddle(K key,INode newNode) {
            insert(search(key),newNode);
    }

    public void deleteMiddle(K key,INode previous) {
            INode tempNode = this.head;
            while (!tempNode.getNext().equals(key)){
                tempNode = tempNode.getNext();
            }
        tempNode.setNext(tempNode.getNext().getNext());
            System.out.println("size of linkedlist: "+size());
    }
    public int size(){
            INode tempNode = this.head;
            int size = 0;
            while (tempNode != null){
                size++;
                tempNode = tempNode.getNext();
            }
            return size;
    }
}
