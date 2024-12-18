//Program to take input from user:

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner MyVariable = new Scanner(System.in);

        System.out.println("enter a");

        int a = MyVariable.nextInt();
        System.out.println("enter b");

        int b = MyVariable.nextInt();

        System.out.println("Sum of two numbers :" + (a + b));

    }
};
