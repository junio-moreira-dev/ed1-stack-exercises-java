package dev.junio.stack.exercises;

public class Exer03DualStack {
    private int[] items;
    private int topA; // Controle do topo da Pilha A
    private int topB; // Controle do topo da Pilha B
    private int capacity;

    public Exer03DualStack(int capacity) {
        this.capacity = capacity;
        this.items = new int[capacity];
        this.topA = -1;       // Pilha A inicia no índice -1 (cresce para a direita)
        this.topB = capacity; // Pilha B inicia no índice V (cresce para a esquerda)
    }

    // Verifica se as duas pilhas se chocaram no vetor compartilhado
    public boolean isFull() {
        // Se o próximo índice de A for igual ao índice atual de B, o vetor encheu
        return topA + 1 == topB;
    }

    // Insere um elemento na Pilha A
    public void pushA(int x) {
        if (isFull()) {
            throw new IllegalStateException("Stack Overflow: Pilhas se chocaram!");
        }
        topA++;
        items[topA] = x;
    }

    // Insere um elemento na Pilha B
    public void pushB(int x) {
        if (isFull()) {
            throw new IllegalStateException("Stack Overflow: Pilhas se chocaram!");
        }
        topB--;
        items[topB] = x;
    }

    // Remove e retorna da Pilha A
    public int popA() {
        if (isEmptyA()) {
            throw new IllegalStateException("Stack Underflow: Pilha A vazia!");
        }
        int removed = items[topA];
        items[topA] = 0; // Limpa a posição
        topA--;
        return removed;
    }

    // Remove e retorna da Pilha B
    public int popB() {
        if (isEmptyB()) {
            throw new IllegalStateException("Stack Underflow: Pilha B vazia!");
        }
        int removed = items[topB];
        items[topB] = 0; // Limpa a posição
        topB++;
        return removed;
    }

    public boolean isEmptyA() {
        return topA == -1;
    }

    public boolean isEmptyB() {
        return topB == capacity;
    }

    public int sizeA() {
        return topA + 1;
    }

    public int sizeB() {
        return capacity - topB;
    }

    // Exibe o estado real do vetor na memória
    public void display() {
        System.out.print("Vetor Completo: [");
        for (int i = 0; i < capacity; i++) {
            System.out.print(items[i]);
            if (i < capacity - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}