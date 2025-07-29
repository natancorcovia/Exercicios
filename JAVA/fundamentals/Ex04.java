package JAVA.fundamentals;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Insira seu nome:");
        var name = scanner.next();
        System.out.println("Insira sua altura:");
        var height = scanner.nextFloat();
        System.out.println("Insira seu peso:");
        var weight = scanner.nextInt();
        var imc = weight/(height*height);
        
        System.out.printf("%s, seu IMC é de %s \n", name , imc);

        if (imc <= 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else if (imc < 24.9) {
            System.out.println("Você está no peso ideal.");
        } else if (imc <= 29.9) {
            System.out.println("Você está levemente acima do peso.");
        } else if (imc <= 34.9) {
            System.out.println("Você tem obesidade grau 1.");
        } else if (imc <= 39.9) {
            System.out.println("Você tem obesidade grau 2 (severa).");
        } else if (imc > 40) {
            System.out.println("Você tem obesidade grau 3 (mórbida).");
        }
        scanner.close();

    }
}