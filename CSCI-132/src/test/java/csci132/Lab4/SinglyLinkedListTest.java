package csci132.Lab4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author : Adiesha
 * @created : 7/13/2022, Wednesday
 **/
public class SinglyLinkedListTest {

    SinglyLinkedList<Integer> singleLinkedList;

    @Before
    public void setUp() throws Exception {
        singleLinkedList = new SinglyLinkedList<>();

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void size() {
        singleLinkedList.addFirst(10);
        singleLinkedList.addFirst(34);
        singleLinkedList.addFirst(76);
        Assert.assertEquals(3, singleLinkedList.size());

        singleLinkedList.addLast(34);
        singleLinkedList.addLast(54);

        Assert.assertEquals(5, singleLinkedList.size());
        singleLinkedList.removeFirst();
        singleLinkedList.removeFirst();
        singleLinkedList.removeFirst();
        singleLinkedList.removeFirst();
        singleLinkedList.removeFirst();
        Assert.assertEquals(0, singleLinkedList.size());
    }

    @Test
    public void isEmpty() {
        Assert.assertTrue(singleLinkedList.isEmpty());

        singleLinkedList.addLast(56);
        Assert.assertFalse(singleLinkedList.isEmpty());
        singleLinkedList.removeFirst();
        Assert.assertTrue(singleLinkedList.isEmpty());
        singleLinkedList.addFirst(34);
        Assert.assertFalse(singleLinkedList.isEmpty());
    }

    @Test
    public void first() {
        Assert.assertNull(singleLinkedList.first());
        singleLinkedList.addFirst(10);
        singleLinkedList.addFirst(12);
        Assert.assertEquals((Integer) 12, singleLinkedList.first());
        Assert.assertNotEquals(Integer.valueOf(10), singleLinkedList.first());
        singleLinkedList.removeFirst();
        Assert.assertEquals(Integer.valueOf(10), singleLinkedList.first());
    }

    @Test
    public void last() {
        Assert.assertNull(singleLinkedList.last());
        singleLinkedList.addFirst(10);
        singleLinkedList.addFirst(12);
        Assert.assertEquals((Integer) 10, singleLinkedList.last());
        Assert.assertNotEquals(Integer.valueOf(12), singleLinkedList.last());
        singleLinkedList.removeFirst();
        Assert.assertEquals(Integer.valueOf(10), singleLinkedList.last());
    }

    @Test
    public void addFirst() {
        singleLinkedList.addFirst(23);
        Assert.assertEquals(Integer.valueOf(23), singleLinkedList.first());
        singleLinkedList.addFirst(6);
        singleLinkedList.addFirst(8);
        singleLinkedList.addFirst(976);
        Assert.assertEquals(Integer.valueOf(976), singleLinkedList.first());
    }

    @Test
    public void addLast() {
        singleLinkedList.addLast(23);
        Assert.assertEquals(Integer.valueOf(23), singleLinkedList.last());
        singleLinkedList.addLast(6);
        singleLinkedList.addLast(8);
        singleLinkedList.addLast(976);
        Assert.assertEquals(Integer.valueOf(976), singleLinkedList.last());
    }

    @Test
    public void removeFirst() {
        singleLinkedList.addLast(6);
        singleLinkedList.addLast(9);
        singleLinkedList.addLast(96);
        Assert.assertEquals(Integer.valueOf(6), singleLinkedList.removeFirst());
        Assert.assertEquals(Integer.valueOf(9), singleLinkedList.removeFirst());

    }

    @Test
    public void removeLast() {
        Assert.assertNull(singleLinkedList.removeLast());
        singleLinkedList.addLast(6);
        singleLinkedList.addLast(9);
        singleLinkedList.addLast(96);
        Assert.assertEquals(Integer.valueOf(96), singleLinkedList.removeLast());
        Assert.assertEquals(Integer.valueOf(9), singleLinkedList.removeLast());
        Assert.assertEquals(Integer.valueOf(6), singleLinkedList.removeLast());
        Assert.assertNull(singleLinkedList.removeLast());
    }
}