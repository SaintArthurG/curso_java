package project6.application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
//    public static void main(String[] args) {
//        method1();
//        System.out.println("End of program");
//    }
//    public static void method1(){
//        System.out.println("++++METHOD1 START++++");
//        method2();
//        System.out.println("++++METHOD1 END++++");
//    }
//    public static void method2(){
//        System.out.println("++++METHOD2 START++++");
//
//        Scanner sc = new Scanner(System.in);
//        try {
//            String[] vect = sc.nextLine().split(" ");
//            int position = sc .nextInt();
//            System.out.println(vect[position]);
//
//        } catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Invalid position!");
//            e.printStackTrace();
//        } catch (InputMismatchException e){
//            System.out.println("Input error");
//        }
//        System.out.println("++++METHOD2 END++++");
//        sc.close();
//    }

    public static void main(String[] args) {
        File file = new File("C:\\Users\\cazoo\\Documents\\lia.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Error opening file: " + e.getMessage());
        }
        finally {
            if (sc != null){
                sc.close();
            }
            System.out.println("Finally block executed");
        }
    }
}
