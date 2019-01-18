package com.company;
import java.util.Scanner;

public class Main {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter side 1 of the triangle thingy: ");
        int a = reader.nextInt();
        System.out.println("Enter side 2 of the triangle thingy: ");
        int b = reader.nextInt();
        System.out.println("Enter side 3 of the triangle thingy: ");
        int c = reader.nextInt();
        clearScreen();

        if(a + b < c & a + c > b & b + c > a){
            System.out.println("The triangle exists :)");
        }
        else{
            System.out.println("The triangle does not exist :(");
        }
    }
}
