
package p1e1encapsulamientovelezy;
import java.util.Scanner;

public class P1E1EncapsulamientoVelezY {
    public static void main(String[] args){
        Rectangulo rectangulo = new Rectangulo(0, 0, "", "");//Incialize el constructor con datos temporales
        
        System.out.println("Nombre: Yeiko Velez\n \n");
        System.out.println("Calculo del perimetro y el area de un rectangulo");
        
        rectangulo.setLado();
        System.out.println("-----------------------------------------");
        rectangulo.setAltura();
        System.out.println("-----------------------------------------");
        rectangulo.setColor();
       // lista.add(rectangulo);

        System.out.println("-----------------------------------------");
        for(Rectangulo rect : Rectangulo.getLista()){
            System.out.println(rect);
        }
        
        Cuadrado cuadrado = new Cuadrado("", 0, "");
        System.out.println("-----------------------------------------");
        System.out.println("Calculo del area y perimetro de un cuadrado");
        
        cuadrado.setLado();
        System.out.println("-----------------------------------------");
        cuadrado.setColor();
        System.out.println("-----------------------------------------");
        cuadrado.setTamanio();
        System.out.println("-----------------------------------------");
        
        for(Cuadrado cuad : Cuadrado.getLista()){
            System.out.println(cuad);
        }
    }
}
