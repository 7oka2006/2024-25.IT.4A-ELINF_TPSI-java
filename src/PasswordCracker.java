public class PasswordCracker {
    private PasswordGenerator passwordGenerator;
    private PasswordProtectedFile fileToCrack;
    private int password_length;

    public PasswordCracker(PasswordProtectedFile file, int password_length) {
        this.password_length = password_length;
        this.passwordGenerator = new PasswordGenerator();
        this.fileToCrack = file;
    }

    public String crack_it() {
        String guess;
        do {
            guess = passwordGenerator.generate(password_length);
        } while (!fileToCrack.open(guess));
        return guess;
    }
}
