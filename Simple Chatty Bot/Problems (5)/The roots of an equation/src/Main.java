import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int counter = 0;
        for (int i = 0; i <= 1000; i++) {
            boolean isValid = a *i *i *i + b *i *i + c *i + d == 0;
            if (counter > 3) {
                break;
            } else if (isValid && counter <= 3) {
                System.out.println(i);
            }
        }
    }
}