class PrintableAndReversablePoint extends ReversablePoint { 
  public PrintableAndReversablePoint(int x, int y) {
    super(x, y);
  }

  public void print() {
    System.out.println("(" + this.getX() + "," + this.getY() + ")");
  }
}
