public class Main {
    public static void main(String[] args) {
        CreditManager creditManager = new CreditManager();
        creditManager.save();
        creditManager.save();
    }
}

public class CreditManager{
    public void calculate(){
        System.out.println("calculated");
    }

    public void save(){
        System.out.println("loan saved");
    }
}

