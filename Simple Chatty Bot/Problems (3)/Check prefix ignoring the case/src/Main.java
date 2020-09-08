import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String j = "j";
        boolean isJ = str.toLowerCase().startsWith(j);
        System.out.print(isJ);
    }
}