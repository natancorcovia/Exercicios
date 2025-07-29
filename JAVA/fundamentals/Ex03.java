// Escreva um código que receba um numero e calcule a tabuada do 1 ao 10 desse numero

package JAVA.fundamentals;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Insira um numero de 1 a 10:");
        var num = scanner.nextInt();
        System.out.println("Tabuada do número " + num + " :");
        for (var index=1 ;index<=10 ;index++ ){
            System.out.println(num + " x " + index + " = " + (num * index));
        };
        scanner.close();

    }
}