package dev.junio.stack.exercises;

public class Exer05RemoveElementTest {
    public static void main(String[] args) {
        testeRemoverElementoMeio();
    }

    public static void testeRemoverElementoMeio() {
        System.out.println("\n--- [Questão 5] Teste Remoção por Chave com Estrutura Preservada ---");
        Exer05RemoveElement<String> pilha = new Exer05RemoveElement<>();

        pilha.push("Elemento 1");
        pilha.push("Elemento TARGET");
        pilha.push("Elemento 3");

        System.out.println("Estado inicial da pilha: " + pilha);

        // Remove o elemento do meio sem quebrar a ordem dos outros
        pilha.removeElement("Elemento TARGET");

        System.out.println("Estado final da pilha (Esperado [Elemento 3, Elemento 1]): " + pilha);
    }
}