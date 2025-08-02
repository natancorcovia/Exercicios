package JAVA.arrays;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criação do array com 5 posições
        int[] numeros = new int[5];

        int soma = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        // Entrada de dados
        System.out.println("Digite 5 números inteiros:");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();       // Lê o número
            soma += numeros[i];              // Soma os valores

            if (numeros[i] > maior) {
                maior = numeros[i];          // Atualiza o maior
            }

            if (numeros[i] < menor) {
                menor = numeros[i];          // Atualiza o menor
            }
        }

        // Impressão dos números digitados
        System.out.print("\nNúmeros digitados: ");
        for (int n : numeros) {
            System.out.print(n + " ");
        }

        // Cálculo da média
        double media = soma / (double) numeros.length;

        // Exibição dos resultados
        System.out.println("\nSoma: " + soma);
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.printf("Média: %.2f\n", media);

        sc.close();
    }
}
