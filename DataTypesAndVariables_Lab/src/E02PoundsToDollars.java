package DataTypesAndVariables_Lab.src;

import java.util.Scanner;

public class E02PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pounds = Double.parseDouble(scanner.nextLine());
        double usd = pounds * 1.36;
        System.out.printf("%.3f", usd);

    }
}