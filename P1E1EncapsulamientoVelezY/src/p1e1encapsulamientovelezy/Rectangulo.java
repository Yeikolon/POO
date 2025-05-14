
package p1e1encapsulamientovelezy;
import java.util.ArrayList;

public class Rectangulo extends Figura{
    //Atributos
    private double altura;
    private final int constDos = 2;
    private static ArrayList<Rectangulo> lista = new ArrayList<>();
    private String observacion;
    
    //Constructor
    public Rectangulo(double altura, double lado, String color, String observacion) {
        super(lado, color);
        this.altura = altura;
        this.observacion = observacion;
        lista.add(this);
    }
   
    //Metodos setters    
    public void setAltura(){
        valido = false;
        //Yeiko Velez
        System.out.print("Ingrese la altura del rectangulo: ");
        while(!valido){
            if(entrada.hasNextDouble()){
                double altura = entrada.nextDouble();
                if(altura > 0 && altura < 100){
                    compararBaseAltura(getLado(), altura);
                    if(valido){
                        this.altura = altura;
                    }
                }else{
                    System.out.print("Ingrese un valor de altura valido: ");
                }
            }else{
                System.out.print("Ingrese unicamente numeros: ");
                entrada.next();
            }
        }
    }
    
    //Metodos getters
    public double getAltura(){
        return altura;
    }
    
    public static ArrayList<Rectangulo> getLista(){
        return lista;
    }
    
    //Metodos
    @Override
    public void compararBaseAltura(double base, double altura){
            if(altura > base){
                observacion = "La altura es mayor a la base";
                valido = true;
            }else if (altura < base){
                observacion = "La altura es menor a la base";
                valido = true;
            }else{
                System.out.println("Error: la base y la altura no pueden ser iguales");
            }
            //lista.add();
    }
    
    @Override
    public String toString(){
        return "Altura del rectangulo: "+getAltura()+
               "\nBase del rectangulo: "+getLado()+
                "\nArea del rectangulo: "+calcularArea()+
                "\nPerimetro del rectangulo: "+calcularPerimetro()+
                "\nObservacion: "+observacion+
                "\n"+mostrarColor();
    }
    
    @Override
    public double calcularArea(){
        return getLado()*altura;
    }
    
    @Override
    public double calcularPerimetro(){
        return constDos * (getLado() + altura);
    }
    
    @Override
    public String mostrarColor(){
        return "El color del rectangulo es: "+getColor();
    }
}
