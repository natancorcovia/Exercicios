// Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela
// fórmula: área=lado X lado

package JAVA.fundamentals;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Insira o tamanho do quadrado:");
        var square = scanner.nextInt();
        var area = square * square;
        System.out.printf("A área do quadrado é de %d \n2" , area);
        scanner.close();
    }
}
