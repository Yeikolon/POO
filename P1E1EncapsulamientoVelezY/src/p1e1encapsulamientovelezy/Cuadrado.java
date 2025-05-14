
package p1e1encapsulamientovelezy;
import java.util.ArrayList;

public class Cuadrado extends Figura{
    //Atributo
    private String tamanio;
    private final int consta = 4;
    private static ArrayList<Cuadrado> lista = new ArrayList<>();
    
    //Constructor
    public Cuadrado(String tamanio, double lado, String color){
        super(lado, color);
        this.tamanio = tamanio;
        lista.add(this);
    }
    
    //Setters
    public void setTamanio(){
        System.out.print("Ingrese el tamanio del cuadrado: ");
        while(!entrada.hasNext("[A-Za-z]+")){
            System.out.print("Ingrese caracteres validos: ");
            entrada.next();
        }
        this.tamanio =  entrada.next();
    }
    
    //Getters
    public String getTamanio(){
        return tamanio;
    }
    
    //Metodos varios
    @Override
    public double calcularPerimetro(){
        return getLado() * consta;
    }
    
    @Override
    public double calcularArea(){
        return getLado() * getLado();
    }
    
    @Override
    public String mostrarColor(){
        return "El color del cuadrado es: "+getColor();
    }
    
    public String mostrarTamanio(){
        return "El cuadrado es: "+tamanio;
    }
    
    public static ArrayList<Cuadrado> getLista(){
        return lista;
    }
    
    @Override
    public String toString(){
        return "Lados del cuadrado: "+getLado()+
                "\nEl area del cuadrado es: "+calcularArea()+
                "\nEl perimetro del cuadrado es: "+calcularPerimetro()+
                "\n"+mostrarColor()+
                "\n"+mostrarTamanio();
    }
    
}
