public class SeasonCheck {
    public static void main(String[] args) {
        int month = 4;

        if (month >= 3 && month <= 5) {
            System.out.println("Spring");
        } else if (month >= 6 && month <= 8) {
            System.out.println("Summer");
        } else if (month >= 9 && month <= 11) {
            System.out.println("Autumn");
        } else if (month == 12 || month == 1 || month == 2) {
            System.out.println("Winter");
        } else {
            System.out.println("Invalid month");
        }
    }
}
