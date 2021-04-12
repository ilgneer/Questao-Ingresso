package ingressos;

public class Vip extends Ingresso {

    protected double valoradd;
    protected double valorTotal;

    public Vip(double valoradd, double valorTotal, double valor) {
        super(valor);
        this.valoradd = valoradd;
        this.valorTotal = valorTotal;
    }

    public double getValoradd() {
        return valoradd;
    }

    public void setValoradd(double valoradd) {
        this.valoradd = valoradd;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void valorTotal() {
        valorTotal = valor + valoradd;
        System.out.println("O valor total do seu ingresso é: R$ " + valorTotal);
    }
}
