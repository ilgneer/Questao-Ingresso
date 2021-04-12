package ingressos;

public class CamaroteSuperior extends Vip {

    public CamaroteSuperior(double valoradd, double valorTotal, double valor) {
        super(valoradd, valorTotal, valor);
    }

    public void valorIngresso() {
        System.out.println("O valor do seu ingresso é: R$ " + valor);
        System.out.println("");
    }
}
