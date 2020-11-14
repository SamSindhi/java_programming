import java.util.Arrays;

public class IntListMain {
  public static void main(String[] args) {
    IntList intList = new IntList(5);
    IntList intListTwo = new IntList(10);
    for(int i = 0; i < 5; i++) {
      intList.add(i);
      intListTwo.add(i+10);
    }
    intListTwo.concat(intList);
    System.out.println(Arrays.toString(intListTwo.array));
    System.out.println(intListTwo.toString());
    intListTwo.removeItemsGreaterThan(10);
    System.out.println(Arrays.toString(intListTwo.array));
    System.out.println(intListTwo.toString());
  }
}
