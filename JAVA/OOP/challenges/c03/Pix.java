package JAVA.OOP.challenges.c03;

class Pix implements MetodoPagamento{
     @Override
    public void pagar(double valor){
        System.out.println("Valor do pix: R$" + valor);
    }

    @Override
    public String getTipo() {
        return "Pix";
    }
}
