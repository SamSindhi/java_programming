
public class Line {
  double a = 0;
  double b = 0;
  double c = 0;

 public Line(a, b, c) {
  this.a = a;
  this.b = b;
  this.c = c;
 }

 public boolean contains(Point p) {
    return a * p.x + b * p.y == c;
  }

  public boolean isParallelWith(Line that)  {
    return this.a * that.b == this.b * that.a;
  }

  public boolean isOrthogonalTo(Line that) {
    return ((this.a * that.b) + (this.b * that.a) == 0);
  }
  
}
