package dev.junio.stack.exercises;

import dev.junio.stack.arraystack.ArrayStack;

public class Exer02DynamicArrayStack<T> extends ArrayStack<T> {

    public Exer02DynamicArrayStack(int initialSize) {
        super(initialSize); // Chama o construtor da classe mãe (ArrayStack)
    }

    // Método novo pedido pelo enunciado
    @SuppressWarnings("unchecked")
    private void ensureCapacity() {
        // fitsFull() verifica se count == capacity
        if (fitsFull()) {
            this.capacity = this.capacity * 2; // Dobra a capacidade
            T[] newItems = (T[]) new Object[this.capacity];

            // Copia os elementos usando o vetor herdado da classe mãe
            for (int i = 0; i < this.count; i++) {
                newItems[i] = this.items[i];
            }

            this.items = newItems; // Atualiza a referência do vetor herdado
            System.out.println("-> Pilha redimensionada via herança! Nova capacidade: " + this.capacity);
        }
    }

    // Sobrescrita do método push da classe mãe para incluir o redimensionamento
    @Override
    public void push(T element) {
        ensureCapacity(); // Dispara a verificação antes de inserir
        this.items[this.count++] = element; // Insere usando os atributos herdados
    }
}