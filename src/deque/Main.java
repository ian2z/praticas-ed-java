package deque;

public class Main {
    static void main() {
        Deque<Integer> deque = new Deque<>();

        deque.addFirst(10);
        deque.addLast(20);
        deque.addFirst(5);
        deque.addLast(30);
        deque.isEmpty();

        System.out.println(deque.length());
        deque.printDeque();

        deque.peekLast();

        deque.removeFirst();
        System.out.println(deque.length());
        deque.printDeque();

        deque.removeLast();
        System.out.println(deque.length());
        deque.printDeque();
    }
}
