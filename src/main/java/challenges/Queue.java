package challenges;
import java.util.Iterator;
import java.util.LinkedList;

public class Queue<T> implements Iterable<T> {
    LinkedList<T> head, tail;

    /**
     *  Add a new object at the end of the Queue,
     *
     * @param  data,  is the data to be inserted in the Queue.
     */
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

    public void delete(T data) {
        // add new object to end of Queue
        LinkedList<T> head = new LinkedList<>(data, null);

        if (head == null)  // initial condition
            this.head = this.tail = tail;
        else {  // nodes in queue
            this.tail.setNextNode(tail); // current tail points to new tail
            this.tail = tail;  // update tail
        }
    }

    /**
     *  Returns the head object.
     *
     * @return  this.head, the head object in Queue.
     */
    public LinkedList<T> getHead() {
        return this.head;
    }

    /**
     *  Returns the tail object.
     *
     * @return  this.tail, the last object in Queue
     */
    public LinkedList<T> getTail() {
        return this.tail;
    }

    /**
     *  Returns the iterator object.
     *
     * @return  this, instance of object
     */
    public Iterator<T> iterator() {
        return new QueueIterator<>(this);
    }
}

/**
 * Queue Iterator
 *
 * 1. "has a" current reference in Queue
 * 2. supports iterable required methods for next that returns a data object
 */
class QueueIterator<T> implements Iterator<T> {
    LinkedList<T> current;  // current element in iteration

    // QueueIterator is intended to the head of the list for iteration
    public QueueIterator(Queue<T> q) {
        current = q.getHead();
    }

    // hasNext informs if next element exists
    public boolean hasNext() {
        return current != null;
    }

    // next returns data object and advances to next position in queue
    public T next() {
        T data = current.getData();
        current = current.getNext();
        return data;
    }
}

/**
 * Queue Manager
 * 1. "has a" Queue
 * 2. support management of Queue tasks (aka: titling, adding a list, printing)
 */
class QueueManager<T> {
    // queue data
    private final String name; // name of queue
    private int count = 0; // number of objects in queue
    public final Queue<T> queue = new Queue<>(); // queue object

    /**
     *  Queue constructor
     *  Title with empty queue
     */
    public QueueManager(String name) {
        this.name = name;
    }

    /**
     *  Queue constructor
     *  Title with series of Arrays of Objects
     */
    public QueueManager(String name, T[]... seriesOfObjects) {
        this.name = name;
        this.addList(seriesOfObjects);
    }

    /**
     * Add a list of objects to queue
     */
    public void addList(T[]... seriesOfObjects) {
        for (T[] objects: seriesOfObjects)
            for (T data : objects) {
                this.queue.add(data);
                this.count++;
            }
    }

    /**
     * Print any array objects from queue
     */
    public void printQueue() {
        System.out.println(this.name + " count: " + count);
        System.out.print(this.name + " data: ");
        for (T data : queue)
            System.out.print(data + " ");
        System.out.println();
    }
}

/**
 * Driver Class
 * Tests queue with string, integers, and mixes of Classes and types
 */
class QueueTester {
    public static void main(String[] args)
    {
        // Create iterable Queue of Words
        Object[] words = new String[] { "seven", "slimy", "snakes", "sallying", "slowly", "slithered", "southward"};
        QueueManager qWords = new QueueManager("Words", words );
        qWords.printQueue();

        // Create iterable Queue of Integers
        Object[] numbers = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        QueueManager qNums = new QueueManager("Integers", numbers );
        qNums.printQueue();



        // Create iterable Queue of Mixed types of data

    }
    /**
     *  Implementation of a Double Linked List;  forward and backward links point to adjacent Nodes.
     *
     */

    public class LinkedList<T>
    {
        private T data;
        private LinkedList<T> prevNode, nextNode;

        /**
         *  Constructs a new element
         *
         * @param  data, data of object
         * @param  node, previous node
         */
        public LinkedList(T data, LinkedList<T> node)
        {
            this.setData(data);
            this.setPrevNode(node);
            this.setNextNode(null);
        }

        /**
         *  Clone an object,
         *
         * @param  node  object to clone
         */
        public LinkedList(LinkedList<T> node)
        {
            this.setData(node.data);
            this.setPrevNode(node.prevNode);
            this.setNextNode(node.nextNode);
        }

        /**
         *  Setter for T data in DoubleLinkedNode object
         *
         * @param  data, update data of object
         */
        public void setData(T data)
        {
            this.data = data;
        }

        /**
         *  Returns T data for this element
         *
         * @return  data associated with object
         */
        public T getData()
        {
            return this.data;
        }

        /**
         *  Setter for prevNode in DoubleLinkedNode object
         *
         * @param node, prevNode to current Object
         */
        public void setPrevNode(LinkedList<T> node)
        {
            this.prevNode = node;
        }

        /**
         *  Setter for nextNode in DoubleLinkedNode object
         *
         * @param node, nextNode to current Object
         */
        public void setNextNode(LinkedList<T> node)
        {
            this.nextNode = node;
        }


        /**
         *  Returns reference to previous object in list
         *
         * @return  the previous object in the list
         */
        public LinkedList<T> getPrevious()
        {
            return this.prevNode;
        }

        /**
         *  Returns reference to next object in list
         *
         * @return  the next object in the list
         */
        public LinkedList<T> getNext()
        {
            return this.nextNode;
        }

    }
