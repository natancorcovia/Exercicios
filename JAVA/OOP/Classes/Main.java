package JAVA.OOP.Classes;

public class Main{
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.titulo = "Dom Casmurro";
        livro1.autor = "Machado de Assis";
        livro1.anoPublicado = 1899;

        Livro livro2 = new Livro();
        livro2.titulo = "1984";
        livro2.autor = "George Orwell";
        livro2.anoPublicado = 1949;

        livro1.detalhesDoLivro();
        System.out.println();
        livro2.detalhesDoLivro();
    }
}