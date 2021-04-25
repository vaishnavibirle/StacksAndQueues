package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueueOperationTest {
    @Test
    public void given3Numbers_WhenAddedToQueue_ShouldHaveLastAdded() {
        QueueOperation<Integer> myQueue = new QueueOperation<>();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);

        INode<Integer> MyNode = myQueue.peak();
        myQueue.printQueue();
        Assertions.assertEquals(myFirstNode,MyNode);
    }

    @Test
    public void given3Numbers_WhenDequeueRemoveFromTheBeginning() {
        QueueOperation<Integer> myQueue = new QueueOperation<>();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);

        INode<Integer> myNode = myQueue.peak();
        Assertions.assertEquals(myFirstNode,myNode);
        INode<Integer> poped = myQueue.dequeue();
        myQueue.printQueue();
        Assertions.assertEquals(myFirstNode,poped);


    }
}
