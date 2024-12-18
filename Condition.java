//Program to show the concept of Conditions:

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner Conditions = new Scanner(System.in);
        int a = Conditions.nextInt();
        int b = Conditions.nextInt();
        int c = Conditions.nextInt();

        if (a > b && a > c)
            System.out.println(a + " : A is the greatest number");

        else if (b > a && b > c)
            System.out.println(b + " : B is the greatest number");

        else
            System.out.println(c + " : C is the greatest number");

    }
}
