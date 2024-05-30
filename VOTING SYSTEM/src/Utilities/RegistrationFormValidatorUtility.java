package Utilities;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.util.regex.Pattern;

public class RegistrationFormValidatorUtility {

    public static boolean validateRegistrationForm(
            JTextField SurnameField, 
            JTextField FirstNameField, 
            JTextField MiddleNameField, 
            JDateChooser DOB, 
            JComboBox<String> GenderBox, 
            JTextField EmailField, 
            JTextField CitizenshipField, 
            JComboBox<String> CivilStatusComboBox, 
            JPasswordField PasswordField, 
            JTextField AddressField, 
            JComboBox<String> SecurityQuestionBox, 
            JTextField SecurityAnswerField) {

        if (areAllFieldsEmpty(
                SurnameField, FirstNameField, MiddleNameField, DOB, GenderBox, 
                EmailField, CitizenshipField, CivilStatusComboBox, PasswordField, 
                AddressField, SecurityQuestionBox, SecurityAnswerField)) {
            showError("All fields are required.");
            return false;
        }

        if (isFieldEmpty(SurnameField, "Surname")) return false;
        if (isFieldEmpty(FirstNameField, "First Name")) return false;
        if (isFieldEmpty(MiddleNameField, "Middle Name")) return false;
        if (DOB.getDate() == null) {
            showError("Date of Birth is required.");
            return false;
        }
        if (isComboBoxEmpty(GenderBox, "Gender")) return false;
        if (isFieldEmpty(EmailField, "Email") || !isValidEmail(EmailField.getText())) {
            showError("Invalid email format.");
            return false;
        }
        if (isFieldEmpty(CitizenshipField, "Citizenship") || containsNumbers(CitizenshipField.getText())) {
            showError("Citizenship should not contain numbers.");
            return false;
        }
        if (isComboBoxEmpty(CivilStatusComboBox, "Civil Status")) return false;
        if (isFieldEmpty(PasswordField, "Password") || !isValidPassword(new String(PasswordField.getPassword()))) {
            showError("Password must be at least 8 characters long, contain at least one uppercase letter, one lowercase letter, and one digit.");
            return false;
        }
        if (isFieldEmpty(AddressField, "Address")) return false;
        if (isComboBoxEmpty(SecurityQuestionBox, "Security Question")) return false;
        if (isFieldEmpty(SecurityAnswerField, "Security Answer")) return false;

        return true;
    }

    private static boolean isFieldEmpty(JTextField field, String fieldName) {
        if (field.getText().trim().isEmpty()) {
            showError(fieldName + " is required.");
            return true;
        }
        return false;
    }

    private static boolean isFieldEmpty(JPasswordField field, String fieldName) {
        if (new String(field.getPassword()).trim().isEmpty()) {
            showError(fieldName + " is required.");
            return true;
        }
        return false;
    }

    private static boolean isComboBoxEmpty(JComboBox<String> comboBox, String fieldName) {
        if (comboBox.getSelectedItem() == null || comboBox.getSelectedItem().toString().equals("Select " + fieldName)) {
            showError(fieldName + " is required.");
            return true;
        }
        return false;
    }

    private static void showError(String message) {
        JOptionPane.showMessageDialog(null, message, "Validation Error", JOptionPane.ERROR_MESSAGE);
    }

    private static boolean areAllFieldsEmpty(
            JTextField SurnameField, 
            JTextField FirstNameField, 
            JTextField MiddleNameField, 
            JDateChooser DOB, 
            JComboBox<String> GenderBox, 
            JTextField EmailField, 
            JTextField CitizenshipField, 
            JComboBox<String> CivilStatusComboBox, 
            JPasswordField PasswordField, 
            JTextField AddressField, 
            JComboBox<String> SecurityQuestionBox, 
            JTextField SecurityAnswerField) {

        return SurnameField.getText().trim().isEmpty() &&
               FirstNameField.getText().trim().isEmpty() &&
               MiddleNameField.getText().trim().isEmpty() &&
               DOB.getDate() == null &&
               (GenderBox.getSelectedItem() == null || GenderBox.getSelectedItem().toString().equals("Select Gender")) &&
               EmailField.getText().trim().isEmpty() &&
               CitizenshipField.getText().trim().isEmpty() &&
               (CivilStatusComboBox.getSelectedItem() == null || CivilStatusComboBox.getSelectedItem().toString().equals("Select Civil Status")) &&
               new String(PasswordField.getPassword()).trim().isEmpty() &&
               AddressField.getText().trim().isEmpty() &&
               (SecurityQuestionBox.getSelectedItem() == null || SecurityQuestionBox.getSelectedItem().toString().equals("Select Security Question")) &&
               SecurityAnswerField.getText().trim().isEmpty();
    }

    private static boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return Pattern.compile(emailRegex).matcher(email).matches();
    }

    private static boolean isValidPassword(String password) {
        String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$";
        return Pattern.compile(passwordRegex).matcher(password).matches();
    }

    private static boolean containsNumbers(String text) {
        return text.matches(".*\\d.*");
    }
}
