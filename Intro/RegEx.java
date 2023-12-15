package Intro;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Regular expression patterns
        String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        String kenyanPhoneNumberPattern = "^\\+254\\s[1-9]\\d{8}$";
        String websiteDomainPattern = "^(http(s)?://)?([a-zA-Z0-9]+\\.)+[a-zA-Z]{2,6}(/[a-zA-Z0-9/?#&=]*)?$";

        // Get user input for email
        System.out.print("Enter your email: ");
        String userEmail = scanner.nextLine().trim();

        // Get user input for phone number
        System.out.print("Enter your phone number (+254 XXXXXXXXX format): ");
        String userPhoneNumber = scanner.nextLine().trim();

        // Get user input for website domain
        System.out.print("Enter your website domain: ");
        String userDomain = scanner.nextLine().trim();

        // Validate user inputs
        System.out.println("\nValidating user inputs:");
        System.out.println("Email is valid: " + isValid(userEmail, emailPattern));
        System.out.println("Phone number is valid: " + isValid(userPhoneNumber, kenyanPhoneNumberPattern));
        System.out.println("Website domain is valid: " + isValid(userDomain, websiteDomainPattern));

        scanner.close();
    }

    // Method to check if input matches the pattern
    private static boolean isValid(String input, String regexPattern) {
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}
