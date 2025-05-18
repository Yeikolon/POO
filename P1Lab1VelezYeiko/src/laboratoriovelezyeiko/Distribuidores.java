package laboratoriovelezyeiko;
import java.util.ArrayList;

public class Distribuidores extends Empleado{
    private String[] name = new String[2];
    private int count = 0;
    private final float fuel = (float)60.48;
    private static ArrayList<Distribuidores> listaDistribuidores = new ArrayList<>();
    
    public Distribuidores(String name[], float cost, int amount){
        super(cost, amount);
        this.name = name;
        listaDistribuidores.add(this);
    }

    public void setName() {
        while(true){
            try{
                String palabra = entry.nextLine().trim();
                if(palabra.isEmpty()){
                    throw new IllegalArgumentException("No ingrese un nombre vacio: ");
                }
                if(!palabra.matches("[a-zA-Z]+")) {
                    throw new IllegalArgumentException("Por favor ingrese un nombre valido (solo letras): ");
                }
                this.name[count] = palabra;
                count++;
                break;
            }catch(IllegalArgumentException e){
                System.out.print(e.getMessage());
            }
        }
    }
    
    public static ArrayList<Distribuidores> getListaDistribuidores(){
        return listaDistribuidores;
    }
    
    /*public String toString(){
        return "Empleados distribuidores: "
                +"\n"+getName()+
                ;
    }*/
    
    public String[] getName(){
        return name;
    }
    
    public float getDiesel(){
        return fuel;
    }
    
    public float sueldo(){
        cost = 100;
        return cost * toDistributed();
    }
    
}
