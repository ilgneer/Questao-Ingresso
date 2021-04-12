package ingressos;

public class Principal {

    public static void main(String[] args) {
        //Vip
        System.out.println("---Vip---");
        Vip v1 = new Vip(100, 0, 200);
        v1.imprimeValor();
        v1.valorTotal();
        System.out.println("");

        //Normal
        System.out.println("---Normal---");
        Normal n1 = new Normal(200);
        n1.tipoIngresso();
        n1.imprimeValor();
        System.out.println("");

        //Camarote Inferior
        System.out.println("---CamaroteInferior---");
        CamaroteInferior ci = new CamaroteInferior("10", "3", 200, 0, 200);
        ci.imprimeValor();
        ci.valorTotal();
        System.out.println(ci.toString());
        System.out.println("");
        
        //Camarote Superior
        System.out.println("---CamaroteSuperior---");
        CamaroteSuperior cs = new CamaroteSuperior(400, 0, 200);
        cs.valorIngresso();
        cs.valorTotal();
        System.out.println("");

    }

}
