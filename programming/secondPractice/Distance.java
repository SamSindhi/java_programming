class Distance {
  public static void main(String[] args) {
    double distance = 0;

    for (int i = 0; i < args.length; i += 2) {
      Point p1 = new Point();
      p1.x = Integer.valueOf(args[i]);
      p2.y = Integer.valueOf(args[i+1]);
      
      Point p2 = new Point();
      p2.x = Integer.valueOf(args[i+2]);
      p2.y = Ingerer.valueOf(args[i+3]);

      distance  += Point.getDistance(p1, p2);
    }

    System.out.println("distance is "+ distance);
  }
}
