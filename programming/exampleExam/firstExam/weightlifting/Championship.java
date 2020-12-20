package weightlifting;
import java.util.ArrayList;
import java.lang.NumberFormatException;
import java.util.Iterator;
import java.io.*;

public class Championship {
  private ArrayList<WeightLifter> weightLifters = new ArrayList<>();
  
  public Championship(String filename) {
    File input = new File(filename);

    try (BufferedReader br = new BufferedReader(new FileReader(input))) {
      String line = "";
      while((line = br.readLine()) != null) {
        String[] words = line.split(": ");
        if(words.length != 2) {
          continue;
        } else {
            int i = 0;
            boolean isValid = true;
            while (i != words[0].length()) {
              if(Character.isDigit(words[0].charAt(i))) {
                isValid = false;
                break;
              }
              i++;
            }
            if(isValid){
              try {
                int weight = Integer.parseInt(words[1]);
                String name = words[0];
                weightLifters.add(WeightLifter.make(name, weight));
              } catch (NumberFormatException e) {

              }
            }
        }
      }
      }catch(IOException e) {

      }
  }

  public int numberOfWeightLifters() {
    return this.weightLifters.size();
  }

  public String show() {
    Iterator<WeightLifter> it = weightLifters.iterator();
    String showStr = "";
    while(it.hasNext()) {
      showStr += it.next().show();
      showStr += "\n";
    }
    return showStr;
  }

  public ArrayList<WeightLifter> strongerThan(WeightLifter weightLifter){
    ArrayList<WeightLifter> stronger = new ArrayList<>();

    for(WeightLifter w : weightLifters){
      if(w.getWeight() > weightLifter.getWeight()) {
        stronger.add(w);
      }
    }

    return stronger;
  }

  public double average() {
    int avg = 0;
    if(weightLifters.size() == 0) {
      return -1;
    }
    for (WeightLifter w : weightLifters) {
      avg += w.weight;
    }
    return (avg / weightLifters.size());
  }

  public WeightLifter round(){
    int minWeight = 301;
    WeightLifter weightLifter = null;
    for(WeightLifter w : weightLifters) {
      if(w.getWeight() < minWeight) {
        minWeight = w.getWeight();
        weightLifter = w;
      }
    }
    weightLifters.remove(w);
    return weightLifter;
  }

  public ArrayList<WeightLifter> championship(){
    ArrayList<WeightLifter> fromLastToFirst = new ArrayList<>();
    
    while(this.weightLifters.size() > 0) {
       fromLastToFirst.add(this.round());
    }
    return fromLastToFirst;
  }
}
