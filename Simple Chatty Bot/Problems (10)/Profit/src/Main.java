import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextDouble();
        float percent = scanner.nextFloat();
        double wantedMoney = scanner.nextDouble();

        percent /= 100;
        int counter = 0;
        while(money < wantedMoney){
            money += money * percent;
            counter++;
        }

        System.out.print(counter);

    }
}