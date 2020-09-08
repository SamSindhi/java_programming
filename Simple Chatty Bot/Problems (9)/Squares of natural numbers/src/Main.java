import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int n = 1;
        while(n*n <= value){
            System.out.println(n*n);
            n++;
        }
    }
}