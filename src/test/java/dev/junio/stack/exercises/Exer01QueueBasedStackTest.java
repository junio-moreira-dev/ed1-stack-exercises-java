package dev.junio.stack.exercises;

public class Exer01QueueBasedStackTest {
    public static void main(String[] args) {
        testesFilaComoPilha();
        testePilhaVazia();
    }

    public static void testesFilaComoPilha() {
        System.out.println("\n--- [Pilha com Duas Filas] Testes Iniciais (push, size, peek e pop) ---");
        Exer01QueueBasedStack<Integer> pilha = new Exer01QueueBasedStack<>();

        pilha.push(10);
        System.out.println("Tamanho esperado (1): " + pilha.size());
        System.out.println("Topo atual (esperado 10): " + pilha.peek());

        pilha.push(20);
        pilha.push(30);
        System.out.println("Tamanho esperado (3): " + pilha.size());
        System.out.println("Topo atual após novos pushes (esperado 30): " + pilha.peek());

        System.out.println("\n******* Removendo elementos (LIFO) *******");
        System.out.println("Elemento removido (esperado 30): " + pilha.pop());
        System.out.println("Novo topo após o pop (esperado 20): " + pilha.peek());
        System.out.println("Tamanho restante (esperado 2): " + pilha.size());
    }

    public static void testePilhaVazia() {
        System.out.println("\n--- [Pilha com Duas Filas] Teste de Limite (Pilha Vazia) ---");
        Exer01QueueBasedStack<Integer> pilha = new Exer01QueueBasedStack<>();

        System.out.println("Tentando dar pop em uma pilha vazia:");
        pilha.pop(); // Deve imprimir a mensagem de erro configurada: "Erro: Pilha vazia!"
    }
}