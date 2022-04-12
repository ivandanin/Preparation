public class MaxNumber {
    public static void main(String[] args) {

    int max = Integer.MIN_VALUE;

    int[] array = {10, 22, 11, -94, 33, 0, 5};

        for (int i : array) {
        if (i > max) {
            max = i;
        }
        }
            System.out.println(max);
    }
}
