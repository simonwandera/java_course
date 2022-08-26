package CollectionsAndDataStructures;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueuePractise {

    private PriorityQueue<String> priorityQueue = new PriorityQueue<>();
    public PriorityQueuePractise() {

        priorityQueue.add("Felix");
        priorityQueue.add("Tony");
        priorityQueue.add("Sharon");
        priorityQueue.add("Prisca");
        priorityQueue.add("Simon");
        priorityQueue.add("Janet");
        priorityQueue.add("Purity");
        priorityQueue.add("Michael");
        priorityQueue.add("Charity");

    }
    public void priorityQueueOperations(){

        System.out.println("Head: " + priorityQueue.element());
        System.out.println("Head: " + priorityQueue.peek());

    }
    public void IteratingPriorityQueues(){
        Iterator iterator = priorityQueue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
