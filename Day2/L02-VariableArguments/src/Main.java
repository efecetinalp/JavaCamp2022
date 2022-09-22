public class Main {
    public static void main(String[] args) {
        int sum = sum2(2, 3, 4, 7, 12, 15);
        System.out.println(sum);
    }

    public static int sum2(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
}
