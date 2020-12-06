public class MainPoint {
  public static void main(String[] args) {
    PrintablePoint printablePoint = new PrintablePoint(2,3);
    printablePoint.print();

    ReversablePoint reversablePoint = new ReversablePoint(1,2);
    reversablePoint.setX(2);
    reversablePoint.setY(3);
    reversablePoint.reverse();
    System.out.println(reversablePoint.getX());

    PrintableAndReversablePoint printableAndReversablePoint = new PrintableAndReversablePoint(4,5);
    printableAndReversablePoint.setX(10);
    printableAndReversablePoint.setY(20);
    printableAndReversablePoint.reverse();
    printableAndReversablePoint.print();
  }
}
