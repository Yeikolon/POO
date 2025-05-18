package laboratoriovelezyeiko;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu { 

    public void mostrarMenu(){
        Empleado employee = new Empleado(0, 11);

        String distributorsNames[] = {"", ""};
        Distribuidores distributor = new Distribuidores(distributorsNames, 0, employee.getAmount());

        String[] enPlanta = new String[employee.toPlant()];
        for (int i = 0; i < employee.toPlant(); i++) {
            enPlanta[i] = "Vacante";
        }
        EmpleadosEnPlanta plant = new EmpleadosEnPlanta(enPlanta, 0, employee.getAmount());
        MateriaPrima material = new MateriaPrima(0, 0, employee.getAmount());
        int opc = 5;
        Scanner entry = new Scanner(System.in);
        
        System.out.println("Yeiko Velez");
        System.out.println("------------------------------");
        System.out.println("Informacion general de la planta de agua 'Fountain'");
        System.out.print("Ingrese la cantidad de empleados totales (siempre 2 a distribuir): ");
        employee.setAmountEmployees();

        System.out.println("------------------------------");
        System.out.println("Empleados distribuidores");
        System.out.println("Ingrese los nombres a continuacion");
        for (int i = 0; i < 2; i++) {
            System.out.print("Nombre del empleado " + (i + 1) + ": ");
            distributor.setName();
        }
        System.out.println("------------------------------");
        System.out.println("Empleados en planta");
        System.out.println("Ingrese los nombres a continuacion");
        for (int i = 0; i < employee.toPlant(); i++) {
            System.out.print("Nombre del empleado " + (i + 1) + ": ");
            plant.setName();
        }
        System.out.println("------------------------------");
        System.out.print("Ingrese los botellones que se vendieron en el mes: ");
        material.ventas();
        
        plant.contador();
        
        
        do{
            System.out.println("---------------------------");
            System.out.println("Seleccione una opcion");
            System.out.println("1. Ver empleados");
            System.out.println("2. Ver gastos");
            System.out.println("3. Ver ganancias");
            System.out.println("4. Ver balance");
            System.out.println("5. Finalizar");
            while(true){
                try{
                    int input = entry.nextInt();
                    if(input >= 1 && input <= 5){
                        opc = input;
                        break;
                    }else{
                        System.out.print("Por favor ingrese un numero en el rango(1-5): ");
                    }
                }catch(InputMismatchException e){
                    System.out.print("Por favor ingrese solo numeros: ");
                    entry.next();
                } 
            }
            switch(opc){
                case 1:
                    ArrayList<EmpleadosEnPlanta> listaEmpPlan= EmpleadosEnPlanta.getlistaEmpleadosEnPlanta();
                    System.out.println("--------------------------");
                    for(EmpleadosEnPlanta emp : listaEmpPlan){
                        System.out.print("Empleados en planta: ");
                        System.out.println(Arrays.toString(plant.getName()));
                        System.out.print("Empleados distribuidores: ");
                        System.out.println(Arrays.toString(distributor.getName()));
                        System.out.println("Empleados totales: "+employee.getAmount());
                    }
                    break;
                case 2:
                    ArrayList<MateriaPrima> listaMat = MateriaPrima.getListaMateriaPrima();
                    System.out.println("--------------------------");
                    for(MateriaPrima mat : listaMat){
                        System.out.println("Gastos en salarios:");
                        System.out.println("Empleados distribuidores: $"+distributor.sueldo()+" dolares");
                        System.out.println("Empleados en planta: $"+plant.sueldo()+" dolares");
                        System.out.println("Gasto en diesel: $"+distributor.getDiesel()+" dolares");
                        System.out.println("Gasto en el tanquero: $"+material.getCost2());
                        System.out.println("Gasto en tapas, etiquetas y materiales varios: $"+material.getCostMateria());
                    }
                    break;
                case 3:
                    System.out.println("--------------------------");
                    System.out.println("Este mes se recaudaron: $"+material.getVentas()+" dolares");
                    break;
                case 4:
                    System.out.println("--------------------------");
                    
                    System.out.println("Balance del mes");
                    float gasto = (material.getCostMateria()+material.getCost2()+distributor.getDiesel()+
                                    distributor.sueldo()+plant.sueldo());
                    float balance = material.getVentas() - gasto;
                    if(material.getVentas() < gasto){
                        System.out.println(balance);
                    }else{
                        System.out.println("+"+balance);
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
            }
        }while(opc != 5);
    }
}
