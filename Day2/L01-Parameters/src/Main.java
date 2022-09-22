public class Main {
    public static void main(String[] args) {
        String message = "Bugün hava çok güzel.";
        String newMessage = getCity();
        System.out.println(newMessage);
        int number = sum(15, 7);
        System.out.println(number);
    }

    public static void add() {
        System.out.println("added!");
    }

    public static void delete() {
        System.out.println("deleted!");
    }

    public static void update() {
        System.out.println("updated!");
    }

    public static int sum(int number1, int number2) {
        return number1 + number2;
    }

    public static String getCity() {
        return "Ankara";
    }
}
