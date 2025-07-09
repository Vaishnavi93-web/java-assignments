public class VowelCheck {
    public static void main(String[] args) {
        char ch = 'e'; 

        String vowels = "aeiouAEIOU";

        if (vowels.indexOf(ch) != -1) {
            System.out.println("Vowel");
        } else {
            System.out.println("Not a vowel");
        }
    }
}
