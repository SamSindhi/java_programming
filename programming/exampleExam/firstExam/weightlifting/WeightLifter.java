package weightlifting;

import java.lang.NumberFormatException;

class WeightLifter {
  String name;
  int weight;
  private static WeightLifter strongestWeightLifter = null;

  private WeightLifter(String name, int weight) {
    if(strongestWeightLifter == null || strongestWeightLifter.weight < weight) {
      strongestWeightLifter.name = name;
      strongestWeightLifter.weight = weight;
    }
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
      }
      return new WeightLifter(name, weight);
    } catch (NumberFormatException e) {
      return null;
    }
  }

  public int getWeight() {
    return this.weight;
  }

  public boolean strongerThan(WeightLifter w) {
    return this.weight > w.weight;
  }

  public String show() {
    return this.name + " - " + this.weight + "kg"; 
  }

  public WeightLifter getStrongestWeightLifter() {
    return strongestWeightLifter;
  }
}
