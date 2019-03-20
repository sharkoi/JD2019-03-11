package by.it.zalesky.jd01_05;

import static java.lang.Math.*

import static java.lang.Math.PI;


public class TaskA {
    public static void main(String[] args) {

        step1();
        step2();
        step3();

    }

    private static void step1(){
        double a = 756.13;
        double x = 0.3;
        double part1 = cos(pow(x * x + PI / 6,  5));
        double part2 = pow (x * pow(a, 3), 2);
        double part3 = log  ((a - 1.12 * x) /4);
        double z = part1 - part2 - part3;
        double z2 = cos (pow (x * x  + PI / 6, 5))
                - sqrt(x * pow((a, 3))
                - log(a - 1.12 * x) / 4);

        System.out.println();
        System.out.println();
    }
}
