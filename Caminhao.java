package pasta2;

public class Caminhao extends Veiculo {
    private int qntRodas;
    private String cpdMaxima;
    public Caminhao(String placa, String marca, String modelo, int ano, int qntRodas, String cpdMaxima) { 
        super(placa, marca, modelo, ano);        
        this.qntRodas = qntRodas;        
        this.cpdMaxima = cpdMaxima;  
}
public void ligar() { 
    System.out.println("\nO caminhão ligou!!" + "\n" );    
}
public String toString() {       
    return "CAMINHÃO \n" 
     + "\n"               
     + "Placa: "+ this.getPlaca() +"\n"
     + "\n"               
     + "Marca: "+ this.getMarca() +"\n" 
     + "\n"                
     + "Modelo: "+ this.getModelo() +"\n"
     + "\n"  
     + "Ano: "+this.getAno()+"\n" 
     + "\n"               
     + "Quantidade de rodas: " + this.qntRodas + "\n"
     + "\n"                 
     + "Capacidade màxima: " + this.cpdMaxima; 
    }


}
