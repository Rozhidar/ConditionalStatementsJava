import java.util.Scanner;

public class PasswordGuess {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userPassword = scanner.nextLine();
        String passwordToCheck =  "s3cr3t!P@ssw0rd";

        if (userPassword.equals(passwordToCheck)) {
            System.out.println("Welcome");

        } else {
            System.out.println( "Wrong password!");
        }

    }
}
