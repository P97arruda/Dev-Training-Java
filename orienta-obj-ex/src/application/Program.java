package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectagle;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectagle rect = new Rectagle();

        System.out.println("Enter rectangle with and height: ");
        rect.width = sc.nextDouble();
        rect.height = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", rect.area());
        System.out.printf("PERIMETER  = %.2f%n", rect.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());

    }

}
