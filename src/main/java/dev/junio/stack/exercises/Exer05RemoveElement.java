package dev.junio.stack.exercises;

import dev.junio.stack.linkedstack.LinkedStack;

public class Exer05RemoveElement<T> extends LinkedStack<T> {

    // Questão 5: Remove a primeira ocorrência do elemento alvo usando apenas push e pop [cite: 35, 36]
    public void removeElement(T target) {
        if (isEmpty()) return;

        // Criamos uma pilha auxiliar dinâmica temporária
        LinkedStack<T> tempStack = new LinkedStack<>();
        boolean found = false;

        // 1. Desempilha até achar o elemento ou esvaziar a pilha
        while (!isEmpty()) {
            T current = pop(); // Usa o pop() herdado
            if (current.equals(target)) {
                found = true;
                break; // Encontrou o elemento alvo, interrompe o laço para descartá-lo
            }
            tempStack.push(current); // Guarda os outros elementos temporariamente [cite: 35, 36]
        }

        // 2. Devolve todos os elementos da auxiliar para restabelecer as posições originais
        while (!tempStack.isEmpty()) {
            push(tempStack.pop()); // Inverte de volta mantendo a estabilidade [cite: 35, 36]
        }

        if (found) {
            System.out.println("-> Elemento '" + target + "' removido com sucesso!");
        } else {
            System.out.println("-> Elemento '" + target + "' não foi encontrado na pilha.");
        }
    }
}