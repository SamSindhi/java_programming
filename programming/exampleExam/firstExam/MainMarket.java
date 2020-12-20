import market.*;
import java.util.ArrayList;

public class MainMarket {
  public static void main(String[] args) {
    Market market = new Market("./market.txt");
    System.out.println(market.numberOfFruits());
    System.out.println(market.show());
    Fruit banana = Fruit.make("banana", 3000);
    ArrayList<Fruit> f = new ArrayList<>(market.cheaperThan(banana));
    System.out.println("Cheapest:");
    for(Fruit fx: f) {
      System.out.println(fx.show());
    }
    System.out.println(market.average());
    ArrayList<Fruit> orderOfSale = new ArrayList<>(market.sale());
    System.out.println("Sale order: ");
    for(Fruit order : orderOfSale) {
      System.out.println(order.show());
    }
    System.out.println(market.numberOfFruits());
  }
}
