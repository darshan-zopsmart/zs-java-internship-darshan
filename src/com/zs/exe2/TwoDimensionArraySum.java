package com.zs.exe2;

import java.util.Scanner;

public class TwoDimensionArraySum {

    int twoD[][];

    TwoDimensionArraySum() {
    }

    public void inputTwoD() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows of array");
        int rows = scanner.nextInt();
        System.out.println("Enter number of columns of array");
        int cols = scanner.nextInt();

        twoD = new int[rows][cols];
        System.out.println("Enter " + (rows * cols) + " elements");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                twoD[i][j] = scanner.nextInt();
        }
    }

    public int sumTwoD() {
        int sum = 0;
        for (int row[] : twoD)
            for (int value : row)
                sum += value;
        return sum;
    }

    public static void main(String[] args) {
        TwoDimensionArraySum twoDimensionArraySum = new TwoDimensionArraySum();
        twoDimensionArraySum.inputTwoD();
        int sum = twoDimensionArraySum.sumTwoD();
        System.out.println("Sum is " + sum);
    }

}
