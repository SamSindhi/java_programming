package com;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MaxIntegerInFile {
    public static void maxInt() {
        String fileLocation = "/Users/andrei/Downloads/dataset_91007.txt";
        File file = new File(fileLocation);
        try (Scanner scanner = new Scanner(file)) {
            int greatestNum = (int) (10e-6);
            while (scanner.hasNext()) {
                try {
                    int num = scanner.nextInt();
                    if (num > greatestNum) {
                        greatestNum = num;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Warning: Your text file has strings as well");
                }
            }
            System.out.println(greatestNum);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
