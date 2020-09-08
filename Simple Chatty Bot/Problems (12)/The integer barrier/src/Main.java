import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int value = 5000;
        while (value != 0){
            value = scanner.nextInt();
            sum += value;
            if (sum >= 1000){
                sum -= 1000;
                break;
            }
        }
        System.out.println(sum);
    }
}