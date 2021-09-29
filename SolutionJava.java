import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        int a;
        System.out.print("Enter an Integer number: ");

        Scanner input = new Scanner(System.in);
        a = input.nextInt();

        input.close();

        if (a % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
