import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int counter = 0;
        for (int i = 1; i <= number; i++){
            int j = 0;
            while(j != i && counter != number){
                System.out.print(i + " ");
                j++;
                counter++;
            }
        }
    }
}