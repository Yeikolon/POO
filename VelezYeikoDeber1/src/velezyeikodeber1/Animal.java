
package velezyeikodeber1;
import java.util.Scanner;

public class Animal {
    //Atributos
    private String nombre;
    private int aniosVividos;
    protected Scanner entrada = new Scanner(System.in);
    protected boolean valido = false;
    
    //Constructor
    public Animal(String nombre, int aniosVividos){
        this.nombre = nombre;
        this.aniosVividos = aniosVividos;
    }
    
    //Setters
    public void setNombre(){
            System.out.print("Ingrese el nombre: ");
            while(!entrada.hasNext("[A-Za-z]+")){
                System.out.print("Ingrese caracteres validos: ");
                entrada.next();
            }
            this.nombre = entrada.next();
    }
    
    public void setAniosVividos(){
        System.out.print("Ingrese los anios: ");
        while(!valido){
            if(entrada.hasNextInt()){
                int aniosVividos = entrada.nextInt();
                if(aniosVividos >= 0 && aniosVividos < 20){
                    this.aniosVividos = aniosVividos;
                    valido = true;
                }else{
                    System.out.print("Ingrese una edad valida: ");
                }
            }else{
                System.out.print("Ingrese unicamente numeros: ");
                entrada.next();
            }
        }
    }
    
    //Getters
    public String getNombre(){
        return nombre;
    }

    public int getAniosVividos(){
        return aniosVividos;
    }
    
    //Metodos
    public void comer(){
        
    }
    
    public void jugar(){
        
    }
    
    public void dormir(){
        
    }
}
