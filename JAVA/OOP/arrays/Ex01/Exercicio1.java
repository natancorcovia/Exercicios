package JAVA.OOP.arrays.Ex01;

// Crie um array de 5 inteiros, preencha com valores de 1 a 5 e imprima.

public class Exercicio1 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        int index;
        for (index = 0; index < numeros.length; index++){
            System.out.println(numeros[index]);
        }
    }

}
