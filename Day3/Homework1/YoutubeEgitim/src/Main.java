public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setId(1);
        person.setFirstName("David");
        person.setLastName("Brown");
        person.setNationalIdentity("123123213");

        Company company = new Company();
        company.setTaxNumber("232423423");
        company.setCompanyName("Siemens");
        company.setId(2);

//        Customer c1 = new Customer();
//        Customer c2 = new Person();
//        Customer c3 = new Company();

        CustomerManager customerManager = new CustomerManager(company, new TeacherCreditManager());
        customerManager.save();
        customerManager.giveCredit();

        BaseCreditManager baseCreditManager = new AgriculturalCreditManager();

    }
}

