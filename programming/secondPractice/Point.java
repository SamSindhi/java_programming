

class Point {
	double x = 0;
	double y = 0;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }
	
  public Point(Point that) {
    this.x = that.x;
    this.y = that.y;
  }

	void move(double dx, double dy) { 
		x+=dx;
		y+=dy;	
	}
	
	void mirror(double cx, double cy) {
		x = 2*cx - x;
		y = 2*cy - y;
	}

	void mirror( Point c){
		x = 2*c.x - x;
		y = 2*c.y - y;
	}


  public Point centerOfMass(Point[] arr) {
    double center_x, center_y;
    for (int i = 0; i < arr.length) {
      center_x += arr[i].x;
      center_y += arr[i].y;
    }
    
  }

	double distance(Point that) {
		double dx = x - that.x;
		double dy = y - that.y;
		return Math.sqrt(dx*dx + dy*dy);	
	}
}
