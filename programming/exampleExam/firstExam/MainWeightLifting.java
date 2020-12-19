import weightlifting.WeightLifter;

class MainWeightLifting {
  public static void main(String[] args) {
    WeightLifter weightLifter = WeightLifter.make("Andrei", 20);
    weightLifter.show();
  }
}
