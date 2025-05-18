package laboratoriovelezyeiko;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class MateriaPrima extends PlantaDeAgua{
    protected final int cost2 = 60;
    private Menu menu = new Menu();
    private int ventas;
    private static ArrayList<MateriaPrima> listaMateriaPrima = new ArrayList<>();
    
    public MateriaPrima(int amount2, float cost, int amount){
        super(cost, amount);
        listaMateriaPrima.add(this);
    }
    
    public int getCost2(){
        return cost2;
    }
    
    public void ventas(){
        while(true){
            try{
                int input = entry.nextInt();
                if(input >= 1 && input <= 5000){
                    this.ventas = input * 2;
                    break;
                }else{
                    System.out.print("Por favor ingrese un numero en el rango(1-5000): ");
                }
            } catch (InputMismatchException e) {
                System.out.print("Por favor ingrese solo numeros: ");
                entry.next();
            }
        }

    }
    
    public static ArrayList<MateriaPrima> getListaMateriaPrima(){
        return listaMateriaPrima;
    }
    
    public int getVentas(){
        return ventas;
    }
    
    public void setAmountMateria(){
        setAmount(ventas);
    }
    
    public float getCostMateria(){
        return (float)0.05 * ventas;
    }
}