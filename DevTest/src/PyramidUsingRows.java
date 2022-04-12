import java.util.Scanner;

public class PyramidUsingRows {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int num = 1;
        int spaces = rows + 4 - 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = spaces; j >= 1; j--) {
                System.out.print(' ');
            }
            for (int k = 1; k <= i; k++) {
                System.out.printf("%d ", num++);
            }
            System.out.println();
            spaces--;
        }
    }
}
