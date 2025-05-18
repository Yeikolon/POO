package laboratoriovelezyeiko;
import java.util.InputMismatchException;

public class Empleado extends PlantaDeAgua{
    private final int two = 2;
    
    public Empleado(float cost, int amount){
        super(cost, amount);
    }
    
    public void setAmountEmployees(){
        while(true){
            try{
            int input = entry.nextInt();
            if(valid.empleadosCantidad(input)){
                setAmount(input);
                break;
            }
            }catch(InputMismatchException e){
                System.out.print("Por favor ingrese solo numeros: ");
                entry.next();
            }
        }
    }
    
    public int toPlant(){
        return getAmount() -two;
    }
    
    public int toDistributed(){
        return two;
    }
}
