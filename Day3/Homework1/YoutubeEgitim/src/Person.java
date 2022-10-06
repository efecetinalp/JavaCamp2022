public class Person extends Customer{
    String NationalIdentity;
    String FirstName;
    String LastName;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getNationalIdentity() {
        return NationalIdentity;
    }
    public void setNationalIdentity(String nationalIdentity) {
        NationalIdentity = nationalIdentity;
    }
}
