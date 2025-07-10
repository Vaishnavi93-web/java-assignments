public class DiscountCalculator {
    public static void main(String[] args) {
        double amount = 8500;
        double discount;

        if (amount > 10000) {
            discount = 20;
        } else if (amount > 5000) {
            discount = 10;
        } else {
            discount = 0;
        }

        System.out.println("Discount: " + discount + "%");
    }
}
