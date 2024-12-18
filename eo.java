import java.util.Scanner;

public class eo {
    public static void main(String[] args) {
        Scanner Num = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = Num.nextInt();

        if (a % 2 == 0) {
            System.out.println(a + ":is  even number");
        } else {
            System.out.println(a + ":is  odd number");

        }

    }
}
