public class Main {
    public static void main(String[] args) {
        //find prime number
        int number = 29;
        boolean isPrime = true;

        if (number == 1) {
            System.out.println(number + "is not prime number");
            return;
        }

        if (number < 1) {
            System.out.println("number is invalid");
        }

        for (int i=2; i<number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime){
            System.out.println(number + " is prime number");
        }
    }
}
