package csci132.Lab4;

import java.util.Random;

/**
 * @author : Adiesha
 * @created : 7/13/2022, Wednesday
 **/
public class LinkedListDemo {
    public static void main(String[] args) {
        SinglyLinkedList<Double> snglll = new SinglyLinkedList<>();
        Random random = new Random(1002);
        System.out.println(snglll);
        snglll.addFirst(random.nextDouble());
        System.out.println(snglll);
        snglll.addFirst(random.nextDouble());
        snglll.addFirst(random.nextDouble());
        snglll.addFirst(random.nextDouble());
        snglll.addLast(random.nextDouble());
        snglll.addLast(random.nextDouble());
        snglll.addLast(random.nextDouble());

        System.out.println(snglll.removeLast());
        System.out.println(snglll.removeFirst());
        System.out.println(snglll);


        CircularLinkedList<Integer> circll = new CircularLinkedList<>();
        System.out.println(circll);
        circll.addFirst(random.nextInt());
        System.out.println(circll);
        circll.addFirst(random.nextInt());
        circll.addFirst(random.nextInt());
        circll.addFirst(random.nextInt());
        circll.addLast(random.nextInt());
        circll.addLast(random.nextInt());
        circll.addLast(random.nextInt());
        circll.addLast(random.nextInt());

        System.out.println(circll);

        DoublyLinkedList<Double> doublyLinkedList = new DoublyLinkedList<>();
        doublyLinkedList.addFirst(random.nextDouble());
        doublyLinkedList.addFirst(random.nextDouble());
        doublyLinkedList.addFirst(random.nextDouble());
        doublyLinkedList.addLast(random.nextDouble());
        doublyLinkedList.addLast(random.nextDouble());

        doublyLinkedList.printBackwards();
        System.out.println("---------------");
        System.out.println(doublyLinkedList.exists(45.09));
        doublyLinkedList.addFirst(45.09);
        System.out.println(doublyLinkedList.exists(45.09));
        System.out.println("+++++++++++++++++++");
        System.out.println(doublyLinkedList);

    }
}
