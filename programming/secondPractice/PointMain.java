

class PointMain {
	public static void main(String [] args) {
		Point point = new Point();
		point.x = 3;
		point.y = 3;
		point.move(1,1);

		System.out.println(point.x + " "+ point.y);
		
		point.mirror(3, 5);
		System.out.println(point.x + " " + point.y);
		
		Point origin = new Point();
		origin.x = origin.y = 0;
		point.mirror(origin);
		System.out.println(point.x + " " + point.y);

		System.out.println("the distance is: " + point.distance(origin));
	}
}
