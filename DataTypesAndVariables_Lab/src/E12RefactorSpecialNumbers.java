package DataTypesAndVariables_Lab.src;

import java.util.Scanner;

public class E12RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int number2 = 0;
        boolean isSpecialNum = false;
        for (int i = 1; i <= number; i++) {
            number2 = i;
            while (i > 0) {
                sum += i % 10;
                i = i / 10;
            }
            isSpecialNum = (sum == 5) || (sum == 7) || (sum == 11);
            System.out.printf("%d -> %b%n", number2, isSpecialNum);
            sum = 0;
            i = number2;

        }
    }

}
