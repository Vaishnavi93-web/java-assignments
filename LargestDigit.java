public class LargestDigit {
    public static void main(String[] args) {
        int num = 48392; 
        int largest = 0;

        do {
            int digit = num % 10;
            if (digit > largest) {
                largest = digit;
            }
            num /= 10;
        } while (num > 0);

        System.out.println("Largest digit is: " + largest);
    }
}
