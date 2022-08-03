package csci132.Lab6;

import csci132.Lab6.src.main.java.org.csci132.labs.ArrayQueue;
import csci132.Lab6.src.main.java.org.csci132.labs.Queue;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

/**
 * @author : Adiesha
 * @created : 7/27/2022, Wednesday
 **/
public class ArrayQueueTest {

    Queue<Integer> integerQueue = new ArrayQueue<>(10);

    @Test
    public void iterator() {
        integerQueue.enqueue(34);
        integerQueue.enqueue(5);
        integerQueue.enqueue(8);
        integerQueue.enqueue(678);
        integerQueue.enqueue(1);
        integerQueue.enqueue(567);
        integerQueue.enqueue(9);

        Iterator<Integer> iterator = integerQueue.iterator();
        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals(Integer.valueOf(34), iterator.next());
        Assert.assertEquals(Integer.valueOf(5), iterator.next());
        Assert.assertEquals(Integer.valueOf(8), iterator.next());
        Assert.assertEquals(Integer.valueOf(678), iterator.next());
        Assert.assertEquals(Integer.valueOf(1), iterator.next());
        Assert.assertEquals(Integer.valueOf(567), iterator.next());
        Assert.assertEquals(Integer.valueOf(9), iterator.next());
        Assert.assertFalse(iterator.hasNext());
    }
}