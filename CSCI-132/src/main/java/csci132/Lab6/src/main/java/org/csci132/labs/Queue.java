package csci132.Lab6.src.main.java.org.csci132.labs;

/**
 * @author : Adiesha
 * @created : 7/23/2022, Saturday
 **/
public interface Queue<E> extends Iterable<E>{
    /**
     * Returns the number of elements in the queue.
     */
    int size();

    /**
     * Tests whether the queue is empty.
     */
    boolean isEmpty();

    /**
     * Inserts an element at the rear of the queue.
     */
    void enqueue(E e);

    /**
     * Returns, but does not remove, the first element of the queue (null if empty).
     */
    E first();

    /**
     * Removes and returns the first element of the queue (null if empty).
     */
    E dequeue();



}