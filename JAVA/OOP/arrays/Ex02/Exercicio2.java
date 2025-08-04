package JAVA.OOP.arrays.Ex02;

// Crie um programa que some todos os valores do array {1, 2, 3, 4, 5} e exiba o resultado no final.

public class Exercicio2 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        int soma = 0;
        int index;
        for (index = 0; index < numeros.length; index++){
            soma += numeros[index];
        }

        System.out.println("Soma dos números deste array: " + soma);
    }
}
