package ingressos;

public class CamaroteInferior extends Vip {

    protected String númeroassento;
    protected String sala;

    public CamaroteInferior(String númeroassento, String sala, double valoradd, double valorTotal, double valor) {
        super(valoradd, valorTotal, valor);
        this.númeroassento = númeroassento;
        this.sala = sala;
    }

    public String getNúmeroassento() {
        return númeroassento;
    }

    public void setNúmeroassento(String númeroassento) {
        this.númeroassento = númeroassento;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "CamaroteInferior{" + "O seu assento é: " + númeroassento + ", na sala: " + sala + '}';

    }

}
