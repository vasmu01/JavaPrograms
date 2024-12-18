//Program to unlock door:

import java.util.Scanner;

public class doorlock {
    public static void main(String[] args) {
        Scanner Lock = new Scanner(System.in);
        int a = 0000;
        System.out.println("Enter door password");

        int b = Lock.nextInt();

        if (b == a)
            System.out.println("Correct password");
        else
            System.out.println("InCorrect password");

    }

}