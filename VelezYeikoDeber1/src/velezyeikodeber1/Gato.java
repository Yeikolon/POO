package velezyeikodeber1;

public class Gato extends Animal{
    //Atributos
    private String color;
    
    //Constructor
    public Gato(String nombre, int aniosVividos, String color){
        super(nombre, aniosVividos);
        this.color = color;
    }
    
    //Setters
    public void setColor(){
        System.out.print("Ingrese el color del gato: ");
        while(!entrada.hasNext("[a-zA-Z]+")){
            System.out.print("Ingrese caracteres validos: ");
            entrada.next();
        }
        this.color = entrada.next();
    }
    
    //Getters
    public String getColor(){
        return color;
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
    
    public void ronronear(){
        System.out.println(getNombre()+" esta ronroneando.");
    }
    
    public void Identificar(){
        System.out.println(getNombre()+" es de color "+color);
    }
}
