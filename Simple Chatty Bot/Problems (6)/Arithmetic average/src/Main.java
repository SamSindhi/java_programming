import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rangeA = scanner.nextInt();
        int rangeB = scanner.nextInt();

        int summation = 0;
        int counter = 0;
        for (int i = rangeA; i <= rangeB; i++){
            if (i % 3 == 0){
                summation += i;
                counter++;
            }
        }
        double av = (double) (summation) / (double) counter;
        System.out.println(av);
    }
}