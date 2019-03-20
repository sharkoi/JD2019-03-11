package by.it.khlystunova.jd01_05;

import static java.lang.Math.*;

public class TaskB {
    public static void main(String[] args) {
        step1();

    }

    private static void step1() {
        double y = 0;
        for (double a = 0; a <= 2 ;) {
            for (int x = 1; x <= 6; x++) {
                y = y + pow(7,a) - cos(x);
            }
            System.out.printf("%-5.2f  %-3g",a,y);
            System.out.println();
            a+=0.2;
        }
    }
}

