package laboratoriovelezyeiko;

import java.util.InputMismatchException;

public class Validacion {
    
    public boolean empleadosCantidad(int input){  
        if(input >= 6 && input <= 10){
            return true;
        }else{
            System.out.print("Por favor ingrese una cantidad valida(6-10): ");
            return false;
        }
    }
    
    
}

