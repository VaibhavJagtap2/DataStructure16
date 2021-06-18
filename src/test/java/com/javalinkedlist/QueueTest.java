package com.javalinkedlist;

import org.junit.Assert;
import org.junit.Test;

public class QueueTest {
    MyQueue myQueue = new MyQueue();
    @Test
    public void given3NumbersWhenAddedTOQueueShouldReturnTrue() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myQueue.queue(myFirstNode);
        myQueue.queue(mySecondNode);
        myQueue.queue(myThirdNode);
        myQueue.printQueue();
        INode peak = myQueue.peak();
        Assert.assertEquals(peak,myFirstNode);
    }
    @Test
    public void given3NumbersWhenDeletePeakOfQueueShouldReturnTrue() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myQueue.queue(myFirstNode);
        myQueue.queue(mySecondNode);
        myQueue.queue(myThirdNode);
        INode peak = myQueue.dequeue();
        myQueue.printQueue();
        Assert.assertEquals(peak, myFirstNode);
    }
}
