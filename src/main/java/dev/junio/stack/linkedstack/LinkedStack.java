package dev.junio.stack.linkedstack;

import dev.junio.stack.Stack;

public class LinkedStack<T> implements Stack<T> {
    protected Node<T> top; // Representa o topo da pilha (antigo head)
    protected int size = 0;

    private final String STACK_EMPTY = "Stack is empty.";

    protected static class Node<T> {
        public T element;
        public Node<T> next;

        public Node(T element) {
            this.element = element;
            this.next = null;
        }
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void push(T element) {
        Node<T> newNode = new Node<>(element);
        newNode.next = top; // O novo nó aponta para o antigo topo
        top = newNode;      // O topo passa a ser o novo nó
        size++;
    }

    @Override
    public T pop() {
        if (size == 0) {
            throw new RuntimeException(STACK_EMPTY);
        }

        T removed = top.element;
        top = top.next; // O topo avança para o próximo nó de baixo
        size--;

        return removed;
    }

    @Override
    public T peek() {
        if (size == 0) {
            return null;
        }
        return top.element;
    }

    @Override
    public void clear() {
        Node<T> current = top;
        while (current != null) {
            Node<T> nextNode = current.next;
            current.element = null;
            current.next = null;
            current = nextNode;
        }
        top = null;
        size = 0;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");
        Node<T> current = top;

        while (current != null) {
            builder.append(current.element);
            if (current.next != null) {
                builder.append(", ");
            }
            current = current.next;
        }

        builder.append("] (Topo à esquerda)");
        return builder.toString();
    }

    public void display() {
        System.out.print("Pilha Dinâmica (Topo -> Base): [");
        Node<T> current = top;
        while (current != null) {
            System.out.print(current.element);
            if (current.next != null) {
                System.out.print(", ");
            }
            current = current.next;
        }
        System.out.println("]");
    }
}
