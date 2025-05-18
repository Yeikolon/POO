package laboratoriovelezyeiko;
import java.util.Scanner;

public class PlantaDeAgua {
    protected float cost;
    private int amount;
    protected Scanner entry = new Scanner(System.in);
    protected Validacion valid = new Validacion();
    
    public PlantaDeAgua(float cost, int amount){
        this.cost = cost;
        this.amount = amount;
    }
    
    public void setCost(){
        this.cost = cost;
    }
    
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getCost() {
        return cost;
    }

    public int getAmount() {
        return amount;
    }

}
