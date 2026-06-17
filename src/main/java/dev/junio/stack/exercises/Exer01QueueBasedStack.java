package dev.junio.stack.exercises;

import dev.junio.queue.Queue;
import dev.junio.queue.linkedqueue.LinkedQueue;
import dev.junio.stack.Stack;

public class Exer01QueueBasedStack<T> implements Stack<T> {
    private Queue<T> q1;
    private Queue<T> q2;

    public Exer01QueueBasedStack() {
        // Inicializa usando as instâncias de fila que você compartilhou
        this.q1 = new LinkedQueue<>();
        this.q2 = new LinkedQueue<>();
    }

    @Override
    public void push(T element) {
        // 1. Insere o elemento na fila auxiliar vazia
        q2.push(element);

        // 2. Transfere tudo de q1 para q2 (o elemento novo fica na frente da fila)
        while (!q1.isEmpty()) {
            q2.push(q1.pop());
        }

        // 3. Inverte as referências das filas
        Queue<T> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            System.out.println("Erro: Pilha vazia!");
            return null;
        }
        // Como o push reposiciona a frente da fila, o topo da pilha é o início de q1
        return q1.pop();
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return q1.peek();
    }

    @Override
    public int size() {
        return q1.size();
    }

    @Override
    public boolean isEmpty() {
        return q1.isEmpty();
    }

    @Override
    public void clear() {
        q1.clear();
        q2.clear();
    }
}