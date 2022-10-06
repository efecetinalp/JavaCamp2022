public class CustomerManager {

    private Customer _customer;
    private ICreditManager _creditManager;

    public CustomerManager(Customer customer, ICreditManager creditManager){
        this._customer = customer;
        this._creditManager = creditManager;
    }

    public void save(){
        System.out.println("Customer is saved with id : " + _customer.getId());
    }

    public void giveCredit(){
        _creditManager.calculate();
        _creditManager.save();
    }
}
