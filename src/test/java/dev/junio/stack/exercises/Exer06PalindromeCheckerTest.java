package dev.junio.stack.exercises;

public class Exer06PalindromeCheckerTest {
    public static void main(String[] args) {
        testePalindromosLegitimos();
        testeNaoPalindromos();
    }

    public static void testePalindromosLegitimos() {
        System.out.println("\n--- [Questão 6] Teste de Palíndromos Legítimos ---");

        String palavra1 = "ARARA";
        String palavra2 = "RADAR";

        System.out.println("A palavra '" + palavra1 + "' é palíndromo? (Esperado true): " + Exer06PalindromeChecker.isPalindrome(palavra1));
        System.out.println("A palavra '" + palavra2 + "' é palíndromo? (Esperado true): " + Exer06PalindromeChecker.isPalindrome(palavra2));
    }

    public static void testeNaoPalindromos() {
        System.out.println("\n--- [Questão 6] Teste de Palavras Normais ---");

        String palavra = "ESTRUTURA";
        System.out.println("A palavra '" + palavra + "' é palíndromo? (Esperado false): " + Exer06PalindromeChecker.isPalindrome(palavra));
    }
}