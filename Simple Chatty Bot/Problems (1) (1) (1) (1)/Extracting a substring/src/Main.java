import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int rangeOne = scanner.nextInt();
        int rangeTwo = scanner.nextInt();

        System.out.println(word.substring(rangeOne, rangeTwo + 1));
    }
}