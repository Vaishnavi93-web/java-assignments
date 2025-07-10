public class VowelConsonantSwitch {
    public static void main(String[] args) {
        char ch = 'E'; 
        ch = Character.toLowerCase(ch); 

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vowel.");
                break;
            default:
                if (ch >= 'a' && ch <= 'z') {
                    System.out.println(ch + " is a consonant.");
                } else {
                    System.out.println(ch + " is not a letter.");
                }
        }
    }
}
