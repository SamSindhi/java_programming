import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] inputValues = new int[size];
        for (int i = 0; i < inputValues.length; i++){
            int arrItem = scanner.nextInt();
            inputValues[i] = arrItem;
        }

        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < inputValues.length; i++){
            if (maxNum < inputValues[i] && (inputValues[i] % 4 == 0)){
                maxNum = inputValues[i];
            }
        }

        System.out.println(maxNum);
    }
}
