package pasta1;
import pasta2.*;

public class Principal {
    public static void main(String[] args) {                     
        Carro carro2 = new Carro("fff3030", "Honda", "Civic", 2014, 4, true);
        System.out.println(carro2);
        carro2.drift();
        Moto motoca = new Moto("gfv75d5", "Yamaha", "Factory", 2016, true, 180);
        System.out.println(motoca);       
        motoca.pardida();
        Caminhao caminhao = new Caminhao("e67m5v", "Volkswagen", "Robust", 2017, 6, "125kg");       
        System.out.println(caminhao);
        caminhao.ligar();
 
    } 

}


