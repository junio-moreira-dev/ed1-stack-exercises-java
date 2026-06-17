package dev.junio.stack.exercises;

public class Exer02DynamicArrayStackTest {
    public static void main(String[] args) {
        testeRedimensionamentoAutomatico();
    }

    public static void testeRedimensionamentoAutomatico() {
        System.out.println("\n--- [Pilha Estática Dinâmica] Teste de Redimensionamento Manual ---");

        // Instancia a pilha com uma capacidade inicial bem pequena (apenas 2 elementos)
        Exer02DynamicArrayStack<String> pilha = new Exer02DynamicArrayStack<>(2);

        pilha.push("Primeiro (A)");
        pilha.push("Segundo (B)");

        System.out.println("Tamanho atual (esperado 2): " + pilha.size());
        System.out.print("Estado da pilha antes de estourar a capacidade: ");
        pilha.display();

        System.out.println("\nInserindo o terceiro elemento (deve dobrar a capacidade automaticamente):");
        pilha.push("Terceiro (C)"); // Dispara o ensureCapacity() interno

        System.out.println("\nTamanho atual após redimensionamento (esperado 3): " + pilha.size());
        System.out.println("Topo atual (esperado Terceiro (C)): " + pilha.peek());

        System.out.print("Estado final da pilha na memória: ");
        pilha.display();
    }
}