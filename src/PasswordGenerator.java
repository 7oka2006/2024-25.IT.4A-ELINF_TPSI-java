import java.util.Random;

public class PasswordGenerator {
    public String generate(int password_length) {
        Random random = new Random();
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < password_length; i++) {
            char letter = (char) ('A' + random.nextInt(26)); 
            password.append(letter);
        }
        return password.toString();
    }
}