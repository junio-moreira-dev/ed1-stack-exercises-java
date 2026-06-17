package dev.junio.stack.exercises;

public class Exer04LinkedStackPushTest {
    public static void main(String[] args) {
        testePushEncadeamentoInvertido();
    }

    public static void testePushEncadeamentoInvertido() {
        System.out.println("\n--- [Questão 4] Teste Inversão Crítica de Encadeamento ---");
        Exer04LinkedStackPush<String> pilha = new Exer04LinkedStackPush<>();

        System.out.println("Inserindo elementos: Livro A, Livro B, Livro C...");
        pilha.push("Livro A");
        pilha.push("Livro B");
        pilha.push("Livro C"); // Último a entrar, deve ser o topo atual

        System.out.println("Tamanho atual (Esperado 3): " + pilha.size());

        System.out.print("Visualização da estrutura na memória: ");
        pilha.display(); // Deve mostrar [Livro C, Livro B, Livro A]

        System.out.println("\nRemovendo do topo (Esperado Livro C): " + pilha.pop());
        System.out.println("Novo topo após remoção (Esperado Livro B): " + pilha.pop());
    }
}