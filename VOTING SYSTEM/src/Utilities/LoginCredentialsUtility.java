package Utilities;

import java.util.regex.Pattern;

public class LoginCredentialsUtility {

    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    private static final String PASSWORD_REGEX = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$";

    public static boolean isValidCredentials(String email, String password) {
        if (email == null || email.isEmpty()) {
            return false;
        }

        if (password == null || password.isEmpty()) {
            return false;
        }

        Pattern emailPattern = Pattern.compile(EMAIL_REGEX);
        if (!emailPattern.matcher(email).matches()) {
            return false;
        }

        Pattern passwordPattern = Pattern.compile(PASSWORD_REGEX);
        if (!passwordPattern.matcher(password).matches()) {
            return false;
        }

        return true;
    }
}
