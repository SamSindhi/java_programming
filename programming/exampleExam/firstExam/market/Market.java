package market;

import java.util.ArrayList;
import java.io.*;
import java.lang.NumberFormatException;
import java.util.Iterator;

public class Market {
  private ArrayList<Fruit> fruits = new ArrayList<>();

  private boolean validateString(String str) {
    int i = 0;
    while(i < str.length()) {
      if(Character.isDigit(str.charAt(i))) {
        return false;
      }
      i++;
    }

    return true;
  }

  public Market(String filename) {
    try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
      String line = "";
      while((line = br.readLine()) != null) {
        String[] words = line.split(", ");
        if(words.length == 2 && validateString(words[0])) {
          try {
            int price = Integer.parseInt(words[1]);
            String name = words[0];
            if(price > 0 && price < 5000 && (price % 5 == 0 || price % 10 == 0) ) {
              this.fruits.add(Fruit.make(name, price));
            }
          } catch (NumberFormatException e) {}
         }
      }
    } catch (IOException e) {}
  }

  public int numberOfFruits() {
    return this.fruits.size();
  }

  public String show() {
    String str = "";
    int i = 0;
    for(Fruit f : fruits) {
      str += f.show();
      i++;
      if(fruits.size() != i) {
        str += "\n";
      }
    }
    return str;
  }

  public ArrayList<Fruit> cheaperThan(Fruit fruit){
    ArrayList<Fruit> cheaperThan = new ArrayList<>();

    for(Fruit f : fruits) {
      if(f.getPrice() < fruit.getPrice()) {
        cheaperThan.add(f);
      }
    }

    return cheaperThan;
  }

  public int average(){
    if(fruits.size() == 0){
      return -1;
    }

    int sum = 0;
    for(Fruit f : fruits) {
      sum += f.getPrice();
    }

    return (sum / fruits.size());
  }

  public Fruit buyCheapestFruit() {
    Fruit cheapest = null;

    for(Fruit f : fruits) {
      if(f.cheaperThan(cheapest)) {
        cheapest = f;
      }
    }
    fruits.remove(cheapest);
    return cheapest;
  }

  public ArrayList<Fruit> sale() {
    ArrayList<Fruit> saleList = new ArrayList<>();
    while(this.fruits.size() > 0) {
      saleList.add(this.buyCheapestFruit());
    } 
    return saleList;
  }
}
