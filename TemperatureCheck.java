public class TemperatureCheck {
    public static void main(String[] args) {
        int temp = 28; 

        if (temp > 30) {
            System.out.println("Hot");
        } else if (temp >= 20) {
            System.out.println("Warm");
        } else {
            System.out.println("Cold");
        }
    }
}
