package dev.junio.stack.exercises;

import dev.junio.stack.linkedstack.LinkedStack;

public class Exer04LinkedStackPush<T> extends LinkedStack<T> {

    // Questão 4: Sobrescreve o push demonstrando o encadeamento invertido O(1)
    @Override
    public void push(T element) {
        // 1. Cria o novo nó usando a classe interna herdada da mãe
        Node<T> newNode = new Node<>(element);

        // 2. O novo nó aponta para quem era o topo antigo (acessado via protected)
        newNode.next = this.top;

        // 3. O ponteiro top assume o novo nó como o topo atual
        this.top = newNode;

        this.size++;
    }
}