package project3.application;

import project3.entities.ImportedProduct;
import project3.entities.Product;
import project3.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        System.out.print("Enter the number of products:");
        int N = sc.nextInt();
        for (int i = 1; i <=  N; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Commom, used or imported (c/u/i)?");
            char resp = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if (resp == 'i'){
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                products.add(new ImportedProduct(name, price, customsFee));
            } else if (resp == 'u') {
                System.out.println("Manufacture date (DD/MM/YYYY): ");
                String dateStr = sc.next();
                Date date = sdf.parse(dateStr);
                products.add(new UsedProduct(name, price, date));
            } else {
                products.add(new Product(name, price));
            }
        }
        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product c :
                products) {
            System.out.println(c.priceTag());
        }


        sc.close();
    }
}
