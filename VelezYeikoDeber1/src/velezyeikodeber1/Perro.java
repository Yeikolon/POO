
package velezyeikodeber1;

public class Perro extends Animal{
    //Atributos
    private String razaPerro;
    
    //Constructor
    public Perro(String nombre, int aniosVividos, String razaPerro){
        super(nombre, aniosVividos);
        this.razaPerro = razaPerro;
    }
    
    //Setters 
    public void setRaza(){
        System.out.print("Ingrese la raza del perro: ");
        while(!entrada.hasNext("[A-Za-z]+")){
            System.out.print("Ingrese caracteres validos: ");
            entrada.next();
        }
        this.razaPerro = entrada.next();
    }
    
    //Getters
    public String getRazaPerro(){
        return razaPerro;
    }
    
    //Metodos
    @Override
    public void comer(){
        System.out.println(getNombre()+" esta comiendo");
    }
    
    @Override
    public void jugar(){
        System.out.println(getNombre()+" con "+getAniosVividos()+" anios esta jugando");
    }
    
    @Override
    public void dormir(){
        System.out.println(getNombre()+" esta durmiendo");
    }
    
    public void Ladrar(){
        System.out.println(getNombre()+" esta ladrando.");
    }
    
    public void identificar(){
        System.out.println(getNombre()+" es de la raza: "+razaPerro);
    }
    
}
