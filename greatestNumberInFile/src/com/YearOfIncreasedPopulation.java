package com;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class YearOfIncreasedPopulation {

    public static void yoIP() {
        String fileLocation = "/Users/andrei/Downloads/dataset_91069.txt";
        File file = new File(fileLocation);


        double previousPop = 0;
        double dif = 0;
        double maxRatio = 0;
        int maxYear = 0;
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.startsWith("year")) {
                    continue;
                }

                String[] content = line.split("\t");
                int year = Integer.parseInt(content[0]);
                double population = Double.parseDouble(content[1].replace(",", ""));
                if (previousPop != population && previousPop != 0) {
                     dif = population - previousPop;
                     if (dif > maxRatio) {
                         maxRatio = dif;
                         maxYear = year;
                     }
                }
                previousPop = population;
            }
            System.out.println(maxYear + ": " + maxRatio);
        } catch (IOException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
}
