import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterCounter {

    public static void main(String[] args) {
        String inputString = "Hiii My Name Is Vishal 12345 @$%^&****() I Am from Pune";

        int alphabetCount = countAlphabets(inputString);
        int digitCount = countDigits(inputString);
        int specialCharCount = countSpecialCharacters(inputString);

        System.out.println("Alphabets: " + alphabetCount);
        System.out.println("Digits: " + digitCount);
        System.out.println("Special Characters: " + specialCharCount);
    }

    public static int countAlphabets(String inputString) {
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        Matcher matcher = pattern.matcher(inputString);

        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    public static int countDigits(String inputString) {
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(inputString);

        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    public static int countSpecialCharacters(String inputString) {
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9\\s]");
        Matcher matcher = pattern.matcher(inputString);

        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
