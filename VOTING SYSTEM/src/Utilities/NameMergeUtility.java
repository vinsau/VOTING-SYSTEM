
package Utilities;


public class NameMergeUtility {
    public static String getFullName(String surname, String firstName, String middleName) {
        
        StringBuilder fullName = new StringBuilder();

        // Append the surname if it is not null or empty
        if (surname != null && !surname.trim().isEmpty()) {
            fullName.append(surname.trim());
        }

        // Append a space if the surname was added and first name is not null or empty
        if (fullName.length() > 0 && firstName != null && !firstName.trim().isEmpty()) {
            fullName.append(" ");
        }

        // Append the first name if it is not null or empty
        if (firstName != null && !firstName.trim().isEmpty()) {
            fullName.append(firstName.trim());
        }

        // Append a space if the first name was added and middle name is not null or empty
        if (fullName.length() > 0 && middleName != null && !middleName.trim().isEmpty()) {
            fullName.append(" ");
        }

        // Append the middle name if it is not null or empty
        if (middleName != null && !middleName.trim().isEmpty()) {
            fullName.append(middleName.trim());
        }

        // Return the constructed full name
        return fullName.toString();
    }

    public static void main(String[] args) {
        String surname = "Doe";
        String firstName = "John";
        String middleName = "Michael";

        String fullName = getFullName(surname, firstName, middleName);
        System.out.println("Full Name: " + fullName); 
    }
}

