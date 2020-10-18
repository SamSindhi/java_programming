import car.utils.Color;

public class Car{
  String licensePlate;
  Color color;
  int maximalSpeed;
  public static int counter = 0;
  
  public Car (String licensePlate, Color color, int maximalSpeed) {
    this.licensePlate = licensePlate;
    this.color = color;
    this.maximalSpeed = maximalSpeed;
    counter++;
  }
  public Car (){
    this.licensePlate = "AAA-000";
    this.color = Color.BLUE;
    this.maximalSpeed = 120;
    counter++;
  }

  public String toString() {
    return licensePlate + ", " + String.valueOf(color.name()) + ", " + String.valueOf(maximalSpeed);
  }

  public static boolean compareCarsBySpeed (Car car1, Car car2){
    return car1.maximalSpeed > car2.maximalSpeed;
  }
}
