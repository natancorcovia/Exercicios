// Escreva um código que receba o nome e o ano de nascimento de 
// alguém e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"
package JAVA;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Olá, informe seu nome:");
        String name = scanner.next();
        System.out.println("Informe seu ano de nascimento:");
        int year = scanner.nextInt();
        int age = 2025 - year;
        System.out.printf("Olá %s você tem %s anos \n" , name , age);
        scanner.close();
    }
}
