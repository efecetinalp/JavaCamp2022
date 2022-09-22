public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(); //lost its referance number
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;
        customerManager.add();
        customerManager.remove();
        customerManager.update();
    }
}
