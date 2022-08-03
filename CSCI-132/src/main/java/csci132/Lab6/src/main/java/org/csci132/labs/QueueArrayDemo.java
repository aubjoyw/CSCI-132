package csci132.Lab6.src.main.java.org.csci132.labs;

/**
 * @author : Adiesha
 * @created : 7/27/2022, Wednesday
 **/
public class QueueArrayDemo {
    public static void main(String[] args) {
        ArrayQueue<Integer> integerQueue = new ArrayQueue<>(10);
        integerQueue.enqueue(3);
        integerQueue.enqueue(5);
        integerQueue.enqueue(87);
        integerQueue.enqueue(82);
        integerQueue.enqueue(74);
        integerQueue.enqueue(2);

        for (Integer a :
                integerQueue) {
            System.out.println(a);
        }
    }
}
