package by.it.pileiko.jd01_04;

import java.util.Scanner;

public class TaskA {
    private static void printMulTable(){
        for (int i = 2; i <10 ; i++) {
            for (int j = 2; j < 10; j++) {

                System.out.printf("%1d*%1d=%-2d ",i,j,i*j);

            }
            System.out.println();
        }

    }

    private static void buildOneDimArray(String line){
        double [] array = InOut.getArray(line);
        double first=array[0];
        double last=array[array.length-1];
        InOut.printArray(array, "V", 5);
        Helper.sort(array);
        InOut.printArray(array, "V", 4);


        // тут использовали другой метод, короче.

        for (int i = 0; i < array.length; i++) {
            if(first==array[i]){
                System.out.printf("Index of first element=%d",i);
                break;

            }

        }

        for (int i = 0; i < array.length; i++) {
            if(last==array[i]){
                System.out.printf("Index of last element=%d",i);
                break;

            }

        }
    }

    public static void main(String[] args) {
        printMulTable();
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        buildOneDimArray(s);
    }

}

