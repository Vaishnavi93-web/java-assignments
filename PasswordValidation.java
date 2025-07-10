public class PasswordValidation {
    public static void main(String[] args) {
        String password = "mypassword"; 

        if (password.length() >= 8) {
            System.out.println("Valid password");
        } else {
            System.out.println("Password too short");
        }
    }
}
