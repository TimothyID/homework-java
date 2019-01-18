package com.company;
import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("1 for C to F, 2 for F to C: ");
        int n = reader.nextInt();
        clearScreen();

        if(n == 1){
            System.out.println("Enter C: ");
            float c = reader.nextFloat();
            clearScreen();

            float f = c * 9 / 5 + 32;

            System.out.println("Fahrenheit :" + f);
        }

        if(n == 2){
            System.out.println("Enter F: ");
            float f = reader.nextFloat();
            clearScreen();

            float c = (f - 32) * 5 / 9;

            System.out.println("Celsius :" + c);
        }

        reader.close();
    }
}
