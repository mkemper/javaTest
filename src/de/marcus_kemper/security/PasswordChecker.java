package de.marcus_kemper.security;

public class PasswordChecker {

    String passWord;

    public boolean checkPassword(String passWord) {
        boolean isValid = false;

        if (passWord.length() <= 8) {
            System.out.println("Das Passwort ist zu kurz");
            return isValid;
        } else {
            System.out.println("Alles in Ordnung!");
            isValid = true;
            return isValid;
        }

    }

    public String getPwd() {
        return this.passWord;
    }

    public void setPwd(String text) {
        this.passWord = text;
    }
}