public class LeapYearSwitch {
    public static void main(String[] args) {
        int year = 2024; 

        switch ((year % 4 == 0) ? (year % 100 == 0 ? (year % 400 == 0 ? 1 : 0) : 1) : 0) {
            case 1:
                System.out.println(year + " is a leap year.");
                break;
            default:
                System.out.println(year + " is not a leap year.");
        }
    }
}
