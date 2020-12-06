class ReversablePoint extends Point implements Reversable {
  private int prev_x, prev_y;

  public ReversablePoint(int x, int y) {
    super(x,y);
    this.prev_x = x;
    this.prev_y = y;
  }
  
  @Override
  public void setX(int x) {
    prev_x = this.getX();
    this.x = x;
  }
  
  @Override
  public void setY(int y) {
    prev_y = this.getY();
    this.y = y;
  }

  public void reverse() {
    this.x = this.prev_x;
    this.y = this.prev_y;
  }
}
