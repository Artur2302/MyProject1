import java.util.Locale;
import java.util.Scanner;

public class PasswordValidator {

    private static Scanner scanner = new Scanner(System.in);
    private String username;
    private String currentPassword;
    private boolean valid;
    private String errorMessage;

    public PasswordValidator(String username, String currentPassword) {
        this.username = username;
        this.currentPassword = currentPassword;
    }

    public boolean isValid() {
        return valid;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void closeScanner(){
        scanner.close();
    }

    public static void main(String[] args){
        PasswordValidator validator = login();
        validator.printPasswordRules();
        do {
            String proposedPassword = validator.getProposedPassword();
            validator.changePassword(proposedPassword);
            if (!validator.isValid()) {
                System.out.println(validator.getErrorMessage());
            }
        }while (!validator.isValid()); {
                System.out.println("The proposed password is valid");
                scanner.close();
            }
        }



    public static PasswordValidator login(){
        System.out.println("Enter your username");
        String username = scanner.next();
        System.out.println("Enter your password");
        String password = scanner.next();

        return new PasswordValidator(username, password);
    }


    public void printPasswordRules(){
        System.out.println("Your new password must meet the following requirements:");
        System.out.println("* at least 8 characters long");
        System.out.println("* contain an uppercase letter");
        System.out.println("* contain a special character");
        System.out.println("* not contain the username");
        System.out.println("* not the same as the old password");
        System.out.println();
    }

    public String getProposedPassword() {
        System.out.println("Enter your new password");
        return scanner.nextLine();

    }

    public void changePassword(String newPassword){
        valid = true;
        errorMessage = "";

        if(newPassword.length() < 8){
            valid = false;
            errorMessage += "\n Your password must be at least 8 characters";
        }

        if(newPassword.equals(newPassword.toLowerCase())){
            valid = false;
            errorMessage += "\n Your password must include an uppercase letter";
        }

        if(newPassword.matches("[a-zA-Z0-9 ]*")){
            valid = false;
            errorMessage += "\n Your password must include a special character";
        }

        if(newPassword.toUpperCase().contains(username.toUpperCase())){
            valid = false;
            errorMessage += "\n Your password must not include your username";
        }

        if(newPassword.equals(currentPassword)){
            valid = false;
            errorMessage += "\n Your password must be different from your current password";
        }
    }
















}