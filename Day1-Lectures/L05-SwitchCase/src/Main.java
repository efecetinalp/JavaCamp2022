public class Main {
    public static void main(String[] args) {

        char grade = 'A';

        switch (grade){
            case 'A':
                System.out.println("perfect :success");
                break;
            case 'B':
                System.out.println("very good :success");
                break;
            case 'C':
                System.out.println("good :success");
                break;
            case 'D':
                System.out.println("not bad :success");
                break;
            case 'F':
                System.out.println("unfortunately :failed");
                break;
            default:
                System.out.println("unexpected grade entered");
        }

    }
}
