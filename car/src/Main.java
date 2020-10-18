import java.io.FileReader;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.util.ArrayList;
import car.Car;
import car.utils.*;

class Main {
    public static void main(String[] args) {
        String fileName = "./input.txt";
        ArrayList<Car> carList = new ArrayList<Car>(3);
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String strLine = "";
            String[] parsedLine;
            while((strLine = br.readLine()) != null) {
                parsedLine = strLine.split(",");
                carList.add(new Car(parsedLine[0], Color.valueOf(parsedLine[1].trim()), Integer.valueOf(parsedLine[2].trim())));
            }
            for (Car car : carList) {
                System.out.println(car.toString());
            }
            boolean isFirstGreater = Car.compareCarsBySpeed(carList.get(0), carList.get(1));
            System.out.println(isFirstGreater);
            System.out.println(Car.counter);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
