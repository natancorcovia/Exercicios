package JAVA.OOP.arrays.Ex03;

// Dado o array {8, 4, 12, 3, 7}, escreva um programa que encontre e imprima o maior valor.

public class Exercicio3 {
    public static void main(String[] args) {
        int[] numeros = {8, 4, 12, 3, 7};
        int maiorValor = numeros[0];
        for(int index = 1; index < numeros.length; index++){
            if(numeros[index]>maiorValor){
                maiorValor = numeros[index];
            }
        }
        System.out.println("O maior número do array é: " + maiorValor);
    }
}
