package laboratoriovelezyeiko;

import java.util.ArrayList;

public class EmpleadosEnPlanta extends Empleado{
    private String[] name = new String[toPlant()];
    private int count = 0;
    private static ArrayList<EmpleadosEnPlanta> listaEmpleadosEnPlanta = new ArrayList<>();
    
    public EmpleadosEnPlanta(String[] name, float cost, int amount){
        super(cost, amount);
        this.name = name;
        listaEmpleadosEnPlanta.add(this);
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
    
    public static ArrayList<EmpleadosEnPlanta> getlistaEmpleadosEnPlanta(){
        return listaEmpleadosEnPlanta;
    }
    
    public String[] getName(){
        return name;
    }
    
    public int contador(){
        int j = 0;
        for(int i = 0; i < name.length;i++){
            if(name[i] == "Vacante"){
                j++;
            }
        }
        return j;
    }
    
    public float sueldo(){
        this.cost = 200;
        return cost * (getAmount() - contador()-2);
    }
}
