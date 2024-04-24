package pasta2;

public class Carro extends Veiculo{   
    private int qtdPortas;    
    private boolean tetoSolar;        
    public Carro(String placa, String marca, String modelo, int ano, int qtdPortas, boolean tetoSolar) {        
    super(placa, marca, modelo, ano);        
    this.qtdPortas = qtdPortas;        
    this.tetoSolar = tetoSolar;    
}    
public void drift() {
System.out.println("\nCantou pneu!! " + "\n" );
}    
public String toString() { 
    return "CARRO \n"
    + "\n"  
    + "Placa: "+ this.getPlaca() 
    + "\n" 
    +"\n" + "Marca: "+ this.getMarca()
    + "\n"   
    +"\n" + "Modelo: "+ this.getModelo() 
    + "\n" 
    +"\n" + "Ano: "+ this.getAno() 
    + "\n" 
    +"\n" + "Quantidade de portas: " + this.qtdPortas 
    + "\n" 
    + "\n"+ "Tem tetoSolar?" + (this.tetoSolar == true ? " Sim" : "Não");

}}


