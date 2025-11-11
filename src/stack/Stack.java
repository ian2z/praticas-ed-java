package stack;

public class Stack<E> {
    private Node<E> top;
    private int size;

    public Stack(){
        top = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public E peek(){
        if (isEmpty()) throw new IllegalStateException("Stack empty");
        return top.data;
    }

    public void push(E element){
        Node<E> newElement =  new Node<>(element);
        newElement.next = top;
        top = newElement;
        size++;
    }

    public E pop(){
        if (isEmpty()) throw  new IllegalStateException("Stack empty");
        E value = top.data;
        top = top.next;
        size ++;
        return value;
    }

    public void printStack(){
        Node<E> actual = top;
        System.out.print("[ ");
        while (actual != null){
            System.out.print(actual.data + " ");
            actual = actual.next;
        }
        System.out.println("]");
    }
}
