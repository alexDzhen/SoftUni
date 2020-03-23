package stack_iterator;

import java.util.Iterator;
import java.util.function.Consumer;

public class StackIterator<E> implements Iterable<E> {
    private Node<E> top;

    @Override
    public Iterator<E> iterator() {
        return new StackIt<>(this.top);
    }

    private static class StackIt<E> implements Iterator<E> {
        private Node<E> current;

        StackIt(Node<E> current) {
            this.current = current;
        }

        @Override
        public boolean hasNext() {
            return this.current != null;
        }

        @Override
        public E next() {
            E element = this.current.element;
            this.current = this.current.prev;
            return element;
        }
    }


    @Override
    public void forEach(Consumer<? super E> action) {
        for (E e : this) {
            action.accept(e);
        }
    }

    private static class Node<E> {
        E element;
        Node prev;

        Node(E element) {
            this.element = element;
        }
    }

    public StackIterator() {
    }

    public void push(E element) {
        Node<E> newNode = new Node<>(element);
        newNode.prev = this.top;
        this.top = newNode;
    }

    public E pop() {
        if (this.top == null) {
            throw new IndexOutOfBoundsException("No elements");
        }
        E element = this.top.element;
        Node<E> prev = this.top.prev;
        this.top.prev = null;
        this.top = prev;
        return element;
    }
}
