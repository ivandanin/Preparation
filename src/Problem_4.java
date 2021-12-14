import java.util.Scanner;

public class Problem_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int times = Integer.parseInt(scanner.nextLine());

        int a = 0;
        int b = 0;
        int c = 1;

        for (int i = 0; i <= times; i++) {
            a = b;
            b = c;
            c = a + b;

            System.out.print(a + " ");
        }
    }
}
