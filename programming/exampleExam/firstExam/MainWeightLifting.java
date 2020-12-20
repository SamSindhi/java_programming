import weightlifting.WeightLifter;
import weightlifting.Championship;
import java.util.ArrayList;

public class MainWeightLifting {
  public static void main(String[] args) {
    System.out.println("Test Start");
    WeightLifter andrei = WeightLifter.make("Andrei", 20);
    WeightLifter error = WeightLifter.make("12as", 10);
    WeightLifter andras = WeightLifter.make("Andras", 200);
    WeightLifter errorWeight = WeightLifter.make("Vasili", 310);
    System.out.println(error);
    System.out.println(andrei.show());
    System.out.println(errorWeight);
    System.out.println(andras.getWeight());
    WeightLifter strongest = WeightLifter.getStrongestWeightLifter();
    System.out.println(strongest.show());
    
    Championship championship = new Championship("./championship.txt");
    System.out.println(championship.numberOfWeightLifters());
    System.out.println(championship.show());
    ArrayList<WeightLifter> stronger = championship.strongerThan(andras);
    System.out.println(stronger.size());
    for(WeightLifter s : stronger){
      System.out.println(s.show());
    }
    System.out.println(championship.average());
    ArrayList<WeightLifter> champs = championship.championship();
    for(WeightLifter s : champs) {
      System.out.println(s.show());
    }
  }
}
