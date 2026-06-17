package dev.junio.stack.exercises;

public class Exer03DualStackTest {
    public static void main(String[] args) {
        testeInsercaoEControle();
        testeCondicaoDeEstouro();
    }

    public static void testeInsercaoEControle() {
        System.out.println("\n--- [Questão 3] Teste Pilha de Duplo Topo Compartilhado ---");
        // Criamos um vetor pequeno com espaço para 5 elementos no total
        Exer03DualStack pilhas = new Exer03DualStack(5);

        System.out.println("Inserindo 10 e 20 na Pilha A...");
        pilhas.pushA(10);
        pilhas.pushA(20);

        System.out.println("Inserindo 99 e 88 na Pilha B...");
        pilhas.pushB(99);
        pilhas.pushB(88);

        System.out.println("Tamanho Pilha A (Esperado 2): " + pilhas.sizeA());
        System.out.println("Tamanho Pilha B (Esperado 2): " + pilhas.sizeB());

        System.out.print("Estado interno do vetor compartilhado: ");
        pilhas.display(); // Deve mostrar os de A na esquerda, zeros no meio, e os de B na direita

        System.out.println("\nRemovendo da Pilha A (Esperado 20): " + pilhas.popA());
        System.out.println("Removendo da Pilha B (Esperado 88): " + pilhas.popB());
    }

    public static void testeCondicaoDeEstouro() {
        System.out.println("\n--- [Questão 3] Teste de Estouro (Stack Overflow) ---");
        Exer03DualStack pilhas = new Exer03DualStack(3);

        System.out.println("Preenchendo o espaço de 3 elementos divididos entre A e B...");
        pilhas.pushA(1);
        pilhas.pushA(2);
        pilhas.pushB(3); // Aqui o vetor completou as 3 vagas

        System.out.print("Vetor completamente cheio: ");
        pilhas.display();

        try {
            System.out.println("Tentando forçar mais uma inserção na Pilha A:");
            pilhas.pushA(4);
        } catch (IllegalStateException e) {
            System.out.println("Capturou o erro esperado com sucesso: " + e.getMessage());
        }
    }
}