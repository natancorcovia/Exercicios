package JAVA.OOP.abstraction.Ex01;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.mover();
        carro1.parar();

        Bicicleta bike = new Bicicleta();
        bike.mover();
        bike.parar();
    }
}
