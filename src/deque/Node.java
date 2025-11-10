package deque;

public class Node<E> {
    E dado;
    Node<E> next;
    Node<E> prev;

    Node(E dado){
        this.dado = dado;
    }
}