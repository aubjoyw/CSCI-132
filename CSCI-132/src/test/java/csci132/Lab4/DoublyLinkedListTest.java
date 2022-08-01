package csci132.Lab4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author : Adiesha
 * @created : 7/13/2022, Wednesday
 **/
public class DoublyLinkedListTest {
    DoublyLinkedList<Integer> doublyLinkedList;

    @Before
    public void setUp() throws Exception {
        doublyLinkedList = new DoublyLinkedList<>();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void exists() {
        Assert.assertFalse(doublyLinkedList.exists(12));
        Assert.assertFalse(doublyLinkedList.exists(13));
        Assert.assertFalse(doublyLinkedList.exists(14));
        doublyLinkedList.addFirst(12);
        Assert.assertTrue(doublyLinkedList.exists(12));
        Assert.assertFalse(doublyLinkedList.exists(15));
        doublyLinkedList.addFirst(9192);
        doublyLinkedList.addFirst(256);
        doublyLinkedList.addFirst(132);
        doublyLinkedList.addLast(16);
        Assert.assertTrue(doublyLinkedList.exists(256));
        Assert.assertFalse(doublyLinkedList.exists(99));

    }
}