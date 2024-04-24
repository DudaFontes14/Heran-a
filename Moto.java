package pasta2;

public class Moto extends Veiculo {
    private boolean temMarcha;
    private int cilindradas;
    
public Moto(String placa, String marca, String modelo, int ano, boolean temMarcha, int cilindradas) { 
        super(placa, marca, modelo, ano);        
        this.temMarcha = temMarcha;        
        this.cilindradas = cilindradas;  
} 
public void pardida() { 
    System.out.println("\nA moto ligou!!" + "\n" );    
}    
    public String toString() {       
        return "MOTO \n"               
         + "\nPlaca: " + this.getPlaca()
         + "\n"               
         + "\nMarca: " + this.getMarca()  
         + "\n"                
         + "\nModelo: " + this.getModelo()
         + "\n"   
         + "\nAno: "+ this.getAno()  
         + "\n"              
         + "\nPortas: " + this.cilindradas
         + "\n"                  
         + "\nPossui marcha? " + (this.temMarcha == true ? " Possui" : "Não Possui");   
        }


}
