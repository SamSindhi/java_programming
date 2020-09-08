package com.Adam;
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {
    public void Gui(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 10));
        panel.setLayout(new GridLayout(0, 1));
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Pidar Detection");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Adam.");
        System.out.println("I was created in 2021.");
        System.out.println("Please, remind me your name.");

        String name = scanner.nextLine();

        System.out.println("What a great name you have, pidor " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int modThree = scanner.nextInt();
        int modFive = scanner.nextInt();
        int modSeven = scanner.nextInt();

        int age = (modThree * 70 + modFive * 21 + modSeven * 15) % 105;

        System.out.println("Your age is " + age + ". And you are pidor");
    }
}