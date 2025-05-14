
package p1e1encapsulamientovelezy;
import java.util.Scanner;
import java.util.ArrayList;
//SUPERCLASE
public class Figura {
    private double lado;
    private String color;
    public boolean valido = false;
    public Scanner entrada = new Scanner(System.in);
   // protected ArrayList< > lista = new ArrayList<>();
    
    public Figura(double lado, String color){
        this.lado = lado;
        this.color = color;
    }

    public void setLado(){
        System.out.print("Ingrese el valor de la base/lado: ");
        while(!valido){
            if(entrada.hasNextDouble()){
                double lado = entrada.nextDouble();
                if(lado > 0 && lado < 100){
                    this.lado = lado;
                    valido = true;
                }else{
                    System.out.print("Ingrese un valor de lado valido: ");
                }
            }else{
                System.out.print("Ingrese unicamente numeros: ");
                entrada.next();
            }
        }
    }
    
    public void setColor(){
        System.out.print("Ingrese el color de la figura: ");
        while(!entrada.hasNext("[a-zA-z]+")){
            System.out.println("Ingrese caracteres validos: ");
            entrada.next();
        }  
        this.color = entrada.next();
    }
    
    
    public void compararBaseAltura(double base, double altura){
        
    }
    
    public double getLado() {
        return lado;
    }
    
    public String getColor() {
        return color;
    }

    public double calcularArea(){
        return 0;
    }
    
    public double calcularPerimetro(){
        return 0;
    }
    
    public String mostrarColor(){
        return "";
    }
}
