public class Segment {
  double x1 = 0;
  double x2 = 0;
  double y1 = 0;
  double y2 = 0;

  public Segment(x1, y1, x2, y2) {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
  }
  
  public Line line() {
    double a = this.y2 - this.y1;
    double b = this.x2 - this.x1;
    double c = a * (this.x1) + b * (this.x2);

    return new Line(a, b, c);
  }

  public boolean contains(Point p) {
    return (p.x >= this.x1 && p.x <= this.x2 ) && (p.y >= this.y1 && p.y <= this.y2) ? true : false;
  }

  
}
