package ingressos;

public class Ingresso {

    protected double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void imprimeValor() {
        System.out.println("O valor do ingresso é: R$ " + valor);
    }
}
