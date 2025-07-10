import java.util.Scanner;

public class PositiveNumberInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.print("Enter a positive number: ");
            num = sc.nextInt();
        } while (num <= 0);

        System.out.println("You entered: " + num);
        sc.close();
    }
}
