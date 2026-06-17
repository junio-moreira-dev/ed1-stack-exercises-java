package dev.junio.stack.exercises;

import dev.junio.queue.linkedqueue.LinkedQueue;
import dev.junio.stack.linkedstack.LinkedStack;

public class Exer06PalindromeChecker {

    // Questão 6: Verifica se uma cadeia de caracteres é um palíndromo legítimo
    public static boolean isPalindrome(String word) {
        if (word == null || word.isEmpty()) {
            return false;
        }

        // Cria as duas estruturas dinâmicas solicitadas no enunciado
        LinkedQueue<Character> queue = new LinkedQueue<>();
        LinkedStack<Character> stack = new LinkedStack<>();

        // Converte a palavra para maiúsculas para ignorar diferenças de caixa (ex: "Arara")
        String cleanedWord = word.toUpperCase().replaceAll("\\s+", "");

        // 1. Alimenta simultaneamente a fila e a pilha com os caracteres
        for (int i = 0; i < cleanedWord.length(); i++) {
            char c = cleanedWord.charAt(i);
            queue.push(c);
            stack.push(c);
        }

        // 2. Esvazia de maneira coordenada realizando as comparações
        while (!queue.isEmpty() && !stack.isEmpty()) {
            char charFromFront = queue.pop(); // Ordem original (esquerda -> direita)
            char charFromTop = stack.pop();   // Ordem invertida (direita -> esquerda)

            // Se houver qualquer divergência, a sequência não é um palíndromo
            if (charFromFront != charFromTop) {
                return false;
            }
        }

        return true;
    }
}