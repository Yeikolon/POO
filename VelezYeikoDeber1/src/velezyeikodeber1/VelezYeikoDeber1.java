
package velezyeikodeber1;
import java.util.Scanner;

public class VelezYeikoDeber1 {
    public static void main(String[] args){
        Perro perro1 = new Perro("Temporal", 0, "Temporal");
        
        System.out.println("Perro y gato");
        perro1.setNombre();
        System.out.println("-----------------------------------------");
        perro1.setAniosVividos();
        System.out.println("-----------------------------------------");
        perro1.setRaza();
        System.out.println("-----------------------------------------");

        perro1.comer();
        perro1.jugar();
        perro1.dormir();
        perro1.Ladrar();
        perro1.identificar();
                
       
        Gato gato1 = new Gato("Temporal", 0, "Temporal");
        System.out.println("Gato");
        System.out.println("-----------------------------------------");
        gato1.setNombre();
        System.out.println("-----------------------------------------");
        gato1.setAniosVividos();
        System.out.println("-----------------------------------------");
        gato1.setColor();
        System.out.println("-----------------------------------------");
        
        gato1.comer();
        gato1.jugar();
        gato1.dormir();
        gato1.ronronear();
        gato1.Identificar();
    }
    
}
