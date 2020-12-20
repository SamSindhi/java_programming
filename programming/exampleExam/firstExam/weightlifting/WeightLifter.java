package weightlifting;

import java.lang.NumberFormatException;

public class WeightLifter {
  String name;
  int weight;
  private static WeightLifter strongestWeightLifter = null;

  private WeightLifter(String name, int weight) {
    this.weight = weight;
    this.name = name;
  }

  public static WeightLifter make(String name, int weight) {
    try{
      int i = 0;
      while(i < name.length()) {
        if(Character.isDigit(name.charAt(i))) {
          return null;
        }
        i++;
      }
      if(weight > 300 || weight < 0) {
        return null;
      }
      if(strongestWeightLifter == null || strongestWeightLifter.weight < weight) {
        strongestWeightLifter = new WeightLifter(name, weight);
      }
      return new WeightLifter(name, weight);
    } catch (NumberFormatException e) {
      return null;
    }
  }

  public int getWeight() {
    return this.weight;
  }
  public String getName() {
    return this.name;
  }

  public boolean strongerThan(WeightLifter w) {
    return this.weight > w.weight;
  }

  public String show() {
    if(this.name == null) {
      return "null";
    }
    return this.name + " - " + this.weight + "kg"; 
  }

  public static WeightLifter getStrongestWeightLifter() {
    return strongestWeightLifter;
  }
}
