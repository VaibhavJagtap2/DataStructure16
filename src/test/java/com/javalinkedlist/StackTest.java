package com.javalinkedlist;

import org.junit.Assert;
import org.junit.Test;

public class StackTest {
    MyStack myStack = new MyStack();
    @Test
    public void given3NumberswhenAddedToStackShouldReturnTrue() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.printStack();
        INode peak = myStack.peak();
        Assert.assertEquals(peak, myThirdNode);
    }
}
