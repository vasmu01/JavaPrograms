import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = num.nextInt();
        for (int i = 1; i <= 10; i++) {

            System.out.println(num1 + "*" + i + "=" + (num1 * i));
            System.out.println();

        }

    }

}
