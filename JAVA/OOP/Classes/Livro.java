package JAVA.OOP.Classes;

public class Livro {
    String titulo;
    String autor;
    int anoPublicado;

    void detalhesDoLivro() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + anoPublicado);
    }
}