public class Main {
    public static void main(String[] args) {
        findNumbers();
        findNumbers();
        findNumbers();
        findNumbers();
    }

    //use camelCase in function names
    public static void findNumbers(){
        int[] numbers = new int[]{1,2,5,7,9,0};
        int search = 5;
        boolean isFound = false;

        for (int number : numbers) {
            if (number == search) {
                isFound = true;
                break;
            }
        }

        if (isFound){
            sendMessage("Number is available: " + search);
        } else {
            sendMessage("Number is not available: " + search);
        }
    }

    public static void sendMessage(String message){
        System.out.println(message);
    }

}
