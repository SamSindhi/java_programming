import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; ; i++){
            int number = scanner.nextInt();
            String type = number % 2 == 0 ? "even" : "odd";
            if (number == 0) {
                break;
            }
            System.out.println(type);
        }
    }
}