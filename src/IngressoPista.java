
public class IngressoPista extends Ingresso{

    public IngressoPista(String nome, String CPF, Evento evento) {
        super(nome, CPF, evento);
    }
    
    
    @Override
     public double calcularValorIngresso(){
        return getEvento().getValorUnico();
    } 
    @Override
    public void imprimirValor(){
        System.out.println("Tipo de Ingresso: Pista\nValor do Ingresso: R$ "+calcularValorIngresso());
    }
    
}
