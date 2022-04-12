import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractNumbers {
    public static void main(String[] args) {
        double sum = 0;

        String input = "2 beers or not 12.3 beers.";
        Pattern pattern = Pattern.compile("[0-9]+\\.?[0-9]?");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            sum += Double.parseDouble(matcher.group());
        }
            System.out.println(sum);
    }
}
