public class LargestOfThree {
    public static void main(String[] args) {
        int a = 35, b = 50, c = 25; 

        if (a >= b && a >= c) {
            System.out.println("Largest number is " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest number is " + b);
        } else {
            System.out.println("Largest number is " + c);
        }
    }
}
