package com.sdajava.IdealNumbers;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] matrix = new int[1000];
        int id;
        int sum = 0;

        System.out.println("Podaj liczbę: ");
        Scanner in = new Scanner(System.in);

        id = in.nextInt();

        for (int i = 1; i <= id; i++) {

            if (id % i == 0) {
                matrix[i] = i;
                System.out.print(matrix[i] + "\t");
                sum = sum + matrix[i];
            }
        }


        System.out.println("\nSuma dzielników to: " + sum);

        if (id == sum) {
            System.out.println("To liczba doskonała!!!");
        }
        System.out.println("To nie jest liczba doskonała!!!");

    }

}
