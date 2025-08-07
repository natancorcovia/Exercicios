package JAVA.IO.Ex01;

import java.io.BufferedReader;
import java.io.FileReader;
// import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Exercicio {

    public static void main(String[] args) {
        String path = "/Users/natan_corcovia/Documents/frases.txt";
        writeFile(path);
        System.out.println("=============================");
        readFile(path);
    }


    public static void writeFile(String path){
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileWriter fw = new FileWriter(path)){
        System.out.println("Digite 3 frases: ");
        String data;
        for(int index = 0; index < 3 ; index++){
            data = reader.readLine();
            fw.write(data + "\n");
            System.out.println("Texto salvo com sucesso!");
        }
        }
        catch(Exception e){
            System.out.println("ERRO: " + e.getMessage());
        }
        
    }

    public static void readFile(String path){
        try(BufferedReader reader = new BufferedReader(new FileReader(path))){
        System.out.println("Suas frases: ");
        String data;
        while ((data = reader.readLine()) != null) {
            System.out.println(data);
        }
        }
        catch(Exception e){
            System.out.println("ERRO: " + e.getMessage());
        }
    }
}