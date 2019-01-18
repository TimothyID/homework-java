package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = reader.nextInt();

        if(year % 4 == 0 & year % 100 != 0 & year % 400 == 0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }


        reader.close();

    }
}
