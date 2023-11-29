package project4.application;

import project4.entities.Circle;
import project4.entities.Rectangle;
import project4.entities.Shape;
import project4.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShapeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle (r/c)");
            char resp = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED)");
            Color color = Color.valueOf(sc.next());
            if (resp == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.println("Height: ");
                double height = sc.nextDouble();
                list.add(new Rectangle(color, width, height));
            } else if (resp == 'c') {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color, radius));
            } else {
                System.out.println("Incorrect answer!!");
            }


        }
        System.out.println();
        System.out.println("SHAPE AREAS:");
        for (Shape sh :
                list) {
            System.out.printf("%.2f%n", sh.area());
        }


        sc.close();
    }
}
