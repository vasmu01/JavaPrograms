//Wap to convert decimal number to Binary number:

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner conv = new Scanner(System.in);
        System.out.print("Enter a decimal number : ");
        int a = conv.nextInt();
        String b = "";
        while (a > 0) {
            int rem = a % 2;
            b = rem + b;
            a = a / 2;
        }

        System.out.println("Binary conversion of a : " + b);
    }
}
