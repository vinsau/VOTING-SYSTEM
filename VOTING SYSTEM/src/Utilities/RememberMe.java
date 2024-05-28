package Utilities;

import java.util.prefs.Preferences;

public class RememberMe {
    private static final String PREFS_NAME = "voterLoginPrefs";
    private static final String EMAIL_KEY = "email";
    private static final String PASSWORD_KEY = "password";

    public static void saveCredentials(String email, String password) {
        Preferences prefs = Preferences.userRoot().node(PREFS_NAME);
        prefs.put(EMAIL_KEY, email);
        prefs.put(PASSWORD_KEY, password);
    }

    public static String[] loadCredentials() {
        Preferences prefs = Preferences.userRoot().node(PREFS_NAME);
        String email = prefs.get(EMAIL_KEY, "");
        String password = prefs.get(PASSWORD_KEY, "");
        return new String[]{email, password};
    }

    public static void clearCredentials() {
        Preferences prefs = Preferences.userRoot().node(PREFS_NAME);
        prefs.remove(EMAIL_KEY);
        prefs.remove(PASSWORD_KEY);
    }
}
