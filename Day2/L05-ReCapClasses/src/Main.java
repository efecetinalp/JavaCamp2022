public class Main {
    public static void main(String[] args) {
        Math math = new Math();
        int result1 = math.Sum(3, 4);
        System.out.println(result1); //result: 7

        int result2 = math.Substract(8, 1);
        System.out.println(result2); //result: 7

        int result3 = math.Multiply(2, 7);
        System.out.println(result3); //result: 14

        int result4 = math.Divide(5, 5);
        System.out.println(result4); //result: 1
    }
}
