package market;

public class Fruit {
  private String name;
  private int price;
  private static Fruit cheapeastFruit = null;

  private Fruit(String name, int price) {
    this.name = name;
    this.price = price;
  }

  private static boolean validateName(String name) {
    if(name == null || name.length() < 2) {
      return false;
    }
    int i = 0;
    while(i < name.length()) {
      if(Character.isDigit(name.charAt(i))) {
        return false;
      }
      i++;
    }
    return true;
  }

  private static boolean validatePrice(int price) {
    return (price > 0) && (price < 5000) && ((price % 5 == 0) || (price % 10 == 0)) ;
  }

  public static Fruit make(String name, int price) {
    if(!validatePrice(price) || !validateName(name)) {
      return null;
    }
    if(cheapeastFruit == null || cheapeastFruit.getPrice() > price){
      cheapeastFruit = new Fruit(name, price);
    }
    return new Fruit(name, price);
  }

  public int getPrice() {
    return this.price;
  }

  public boolean cheaperThan(Fruit fruit) {
    if(fruit == null) {
      return true;
    }
    return this.price < fruit.price;
  }

  public String show(){
    if(this.price / 1000 >= 1) {
      return this.name + " " + (this.price / 1000) + " " + (this.price % 1000 == 0 ? "000" : this.price) + " HUF";
    }
    return this.name + " " + this.price + " HUF";
  }

  public static Fruit getCheapestFruit() {
    return cheapeastFruit;
  }
}
