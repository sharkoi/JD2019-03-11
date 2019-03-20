package by.it.narushevich.jd01_02;

import java.util.*;

public class TaskC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        step1(n);

    }

    static int[][] step1(int n) {
        int [][] mas=new int[n][n];
        int min = -n;
        int max = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mas[i][j]=min+(int)(Math.random()*(max-min) + 1);
                System.out.print(mas[i][j] + " ");
                //if ((mas[i][j]==n)||(mas[i][j]==-n)) return mas;
                }
            System.out.println();
        }
        return mas;
    }





}