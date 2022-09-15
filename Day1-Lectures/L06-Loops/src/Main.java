public class Main {
    public static void main(String[] args) {
        // for loop
        for (int i=1; i<=10; i++) {   //or i--
            System.out.println("for loop : " + i);
        }

        // while loop
        int j = 0;
        while (j<10){
            System.out.println("while loop : " + j);
            j++;
        }

        // do-while loop
        int k = 1;
        do {
            System.out.println("do-while loop : " + k);
            k+=2;
        } while (k<10);

    }
}
