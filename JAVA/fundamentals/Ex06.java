package JAVA.fundamentals;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        float valorDoProduto = scanner.nextFloat();
        
        System.out.println();
        float porcentagemDeDesconto = scanner.nextFloat();
        
        if(porcentagemDeDesconto < 0 || porcentagemDeDesconto > 100){
          System.out.println("Desconto invalido.");
        } else {
          float valorFinal = valorDoProduto - (valorDoProduto * porcentagemDeDesconto / 100);
            DecimalFormat df = new DecimalFormat("0.00");
            System.out.println(df.format(valorFinal));
        }
        scanner.close();
    }
}