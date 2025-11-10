package deque;

public class Deque<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    //construtor
    public Deque(){
        head = null;
        tail = null;
        size = 0;
    }

    //métodos
    public boolean isEmpty(){
        return size == 0;
    }

    public void addFirst(E element){
        Node<E> newElement = new Node<>(element);
        if (isEmpty()){
            head = tail = newElement;
        }else{
            newElement.next = head;
            head.prev = newElement;
            head = newElement;
        }
        size++;
    }

    public void addLast(E element){
        Node<E> newElement = new Node<>(element);
        if (isEmpty()){
            head = tail = newElement;
        }else{
            tail.next = newElement;
            newElement.prev = tail;
            tail = newElement;
        }
        size++;
    }

    public E removeFirst(){
        if ((isEmpty())) throw new IllegalStateException("Deque empty!");
        E value = head.dado;
        head = head.next;
        if (head != null){
            head.prev = null;
        }else{
            tail = null;
        }
        size--;
        return value;
    }

    public E removeLast(){
        if ((isEmpty())) throw new IllegalStateException("Deque empty!");
        E value = tail.dado;
        tail = tail.prev;
        if (tail != null){
            tail.next = null;
        }else{
            head = null;
        }
        size--;
        return value;
    }

    public E peekLast() {
        if ((isEmpty())) throw new IllegalStateException("Deque empty!");
        return tail.dado;
    }

    public int length(){
        return size;
    }

    public void printDeque(){
        Node<E> current = head;
        System.out.print("[ ");
        while (current != null){
            System.out.print(current.dado + " ");
            current = current.next;
        }
        System.out.println("]");
    }
}
