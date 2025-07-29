package JAVA.fundamentals;

import java.util.Scanner;

public class Ex05 {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leia o peso em quilos
        System.out.print("Digite o peso (kg): ");
        float peso = scanner.nextFloat();

        // Leia o valor do frete por quilo
        System.out.print("Digite o valor do frete por quilo: ");
        float fretePorQuilo = scanner.nextFloat();

        // Calcule o valor total do frete
        float valorDoFrete = peso * fretePorQuilo;

        // Exiba o valor formatado com duas casas decimais
        System.out.printf("Valor total do frete: R$ %.2f\n", valorDoFrete);

        scanner.close();
    }
}