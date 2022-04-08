### Important Links
* [C1 Code](https://replit.com/@ridhimainukurti/triridhimainukurti#src/TechTalk1/Queue.java)
* [C2 Code](https://replit.com/@ridhimainukurti/triridhimainukurti#src/TechTalk1/Stack.java)
* [C3 Code](https://replit.com/@ridhimainukurti/triridhimainukurti#src/TechTalk1/Merge.java)
* [C4 Code](https://replit.com/@ridhimainukurti/triridhimainukurti#src/TechTalk1/LinkedList.java)
* [Ticket](https://github.com/ridhimainukurti/triridhimainukurti/issues/2)

### Challenge 1 ~ Queue

Add elements into the queue and depending on the method written which in this case was our add and delete method, we can delete from the head of the connection or from the tail of the connection. 
```
public void add(T data) {
        // add new object to end of Queue
        LinkedList<T> tail = new LinkedList<>(data, null);

        if (head == null)  // initial condition
            this.head = this.tail = tail;
        else {  // nodes in queue
            this.tail.setNextNode(tail); // current tail points to new tail
            this.tail = tail;  // update tail
        }
    }
```
This is the deleting method below through which we are deleting from the tail of the connection and then assigning to the next head so that it keeps going. The iterator within the code will act as a for each and iterate through all of the elements. 
```

  // to delete the elements within the queue
    public void delete() {
      // looks at the current head and moves to the next link or head within the list
      this.head = head.getNext();
      // then sets the previous node or head as the tail while the one in front of it is the tail
      this.head.setPrevNode(tail);
    }
```

### Challenge 2 ~ Stacks 

Stacks is another data collection where the concept is to add certain elements within the stack and the first element added in is the last one out. Think of it as when you put the plates from the dishwasher into the cupboard. The last plate you add in is the first one to come out and use. Here below is the methods and classes written in order to build a stack in java. The below code will show the tester and what is actually running within replit. 

```
class StackTester {
    public static void main(String[] args)
    {

        Object[] queuestart = new Integer[] { 1, 2, 3};
        Object[] stackfinal = new Integer[] {};
        QueueManager startq = new QueueManager("Integers", queuestart);

        
        Stack finals = new Stack();
        for (int i = 0; i < queuestart.length; i++) {
            finals.push(queuestart[i]);
        }
        System.out.println("\nQueue to Stack:");
        for (int i = 0; i < queuestart.length; i++) {
            System.out.print(finals.pop() + " ");
        }
        System.out.println();

    }
}
```

### Challenge 3 ~ Merge Queue

This is where there are the blending of two queues together into one. Below is the method witten to achieve that merge. 

```
public Queue<T> merged() {
    QueueIterator<T> firstQueue = new QueueIterator<T>(queue1);
    QueueIterator<T> secQueue = new QueueIterator<T>(queue2);
    Queue<T> mergedQueues = new Queue<T>();

    while (firstQueue.hasNext() && secQueue.hasNext()) {
      T first = firstQueue.next();
      T sec = secQueue.next();

      if ((int)first <= (int)sec) {
        mergedQueues.add(first);
      }
      else {
        mergedQueues.add(sec);
      }
    }

    return mergedQueues;
    
  }
```
This was done by adding both the first and second queues accordingly according the number and order of the elements within both of the queues. So therefore it combined the queues into numerical order. 

### Challenge 4 ~ LinkedLists 

This is where the elements are entered according to a certain collection where they are identified as the beginning and the end and therefore each of the elements are connected through a connection. Therefore within the LinkedList there is a head and a tail within the collection. 

```
public LinkedList(T data, LinkedList<T> node) {
    this.setData(data);
    this.setPrevNode(node);
    this.setNextNode(null);
  }

    /**
     *  Clone an object,
     *
     * @param  node  object to clone
     */
  public LinkedList(LinkedList<T> node) {
    this.setData(node.data);
    this.setPrevNode(node.prevNode);
    this.setNextNode(node.nextNode);
  }
```

