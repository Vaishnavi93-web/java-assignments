public class CharTypeCheck {
    public static void main(String[] args) {
        char ch = 'B'; 

        if (!Character.isLetter(ch)) {
            System.out.println("Not a letter");
        } else if ("aeiouAEIOU".indexOf(ch) != -1) {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
