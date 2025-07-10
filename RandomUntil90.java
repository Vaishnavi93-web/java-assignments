import java.util.Random;

public class RandomUntil90 {
    public static void main(String[] args) {
        Random rand = new Random();
        int num;

        do {
            num = rand.nextInt(101); 
            System.out.println("Generated: " + num);
        } while (num <= 90);

        System.out.println("Number greater than 90 generated: " + num);
    }
}
