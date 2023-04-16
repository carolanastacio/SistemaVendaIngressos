import java.util.Scanner;

public class SistemaIngressos {

    public static void main(String[] args) {
        Evento evento1 = new Evento("Show Zé Felipe ", "25/08/2022", 350.0, 150);
        Evento evento2 = new Evento("Show João Gomes", "15/10/2022",500.0, 3);
        
        
        Ingresso ingressoPista1 = new IngressoPista("Luan", "383.855.180-02", evento2);
        Ingresso ingressoVip1 = new IngressoVIP("Ana", "091.691.950-13", evento1);
        Ingresso ingressoCamarote1 = new IngressoCamarote("Stefania ", "633.543.530-66", evento2);
        Ingresso ingressoPista2 = new IngressoPista("Wilian", "026.469.910-61", evento2);
        Ingresso ingressoVip2 = new IngressoPista("Thiago", "759.423.200-39", evento1);
        Ingresso ingressoCamarote2 = new IngressoCamarote("Priscila", "809.280.760-40", evento2);
        
        
        ingressoPista1.imprimirValor();
        ingressoPista1.mostrarResumo();        
        evento2.venderIngresso(ingressoPista1);
        
        ingressoVip1.imprimirValor();
        ingressoVip1.mostrarResumo();
        evento1.venderIngresso(ingressoVip1);
        
        ingressoCamarote1.imprimirValor();
        ingressoCamarote1.mostrarResumo();
        evento2.venderIngresso(ingressoCamarote1);
        
        ingressoPista2.imprimirValor();
        ingressoPista2.mostrarResumo();        
        evento2.venderIngresso(ingressoPista2);
        
        ingressoVip2.imprimirValor();
        ingressoVip2.mostrarResumo();
        evento1.venderIngresso(ingressoVip2);
        
        ingressoCamarote2.imprimirValor();
        ingressoCamarote2.mostrarResumo();
        evento2.venderIngresso(ingressoCamarote2);
        
        
        System.out.println("\n");
        System.out.println(" --------- INGRESSOS VENDIDOS ------------- ");
        System.out.println(" ===== Show Zé Felipe - Muriaé/MG ======");
        evento1.quantidadeIngressoVendido();
        System.out.println("---------------------------------------------");
        System.out.println(" ==== Show João Gomes - Leopoldina/MG ======");
        evento2.quantidadeIngressoVendido();
        System.out.println("\n");
        
    }
}
