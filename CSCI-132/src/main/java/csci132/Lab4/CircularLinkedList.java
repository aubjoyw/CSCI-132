package csci132.Lab4;

/**
 * @author : Adiesha
 * @created : 7/12/2022, Tuesday
 **/
public class CircularLinkedList<T> implements LinkedListInterface<T> {

    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E e, Node<E> next) {
            element = e;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

    private Node<T> tail;
    private int size;

    public CircularLinkedList() {

    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public T first() {
        if (isEmpty())
            return null;
        return tail.getNext().getElement();
    }

    @Override
    public T last() {
        if (isEmpty())
            return null;
        return tail.getElement();
    }

    @Override
    public void addFirst(T element) {
        if (isEmpty()) {
            tail = new Node<>(element, null);
            tail.setNext(tail);
        } else {
            Node<T> newest = new Node<>(element, tail.getNext());
            tail.setNext(newest);
        }
        size++;
    }

    @Override
    public void addLast(T element) {
        addFirst(element);
        tail = tail.getNext();
    }

    @Override
    public T removeFirst() {
        if (isEmpty())
            return null;
        Node<T> head = tail.getNext();
        if (head == tail)
            tail = null;
        else
            tail.setNext(head.getNext());
        size--;
        return head.getElement();
    }

    public void rotate() {
        if (tail != null)
            tail = tail.getNext();
    }

    @Override
    public String toString() {
        if (isEmpty()){
            return null;
        }
        String string = "START->";
        System.out.println("CircularLinkedList: ->");
        string = (string + tail.getElement() + "->");
        Node<T> current = tail;
        for (int i = 0; i < size; i++){
            Node<T> next = current.getNext();
            string = (string + next.getElement() + "->");
            current = next;
        }
        string = (string + "END");
        return string;
    }
}
