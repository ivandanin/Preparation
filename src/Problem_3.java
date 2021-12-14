import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--) {
            sb.append(chars[i]);
        }

        System.out.println(sb);
    }
}
