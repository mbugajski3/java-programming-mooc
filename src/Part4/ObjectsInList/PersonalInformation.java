package Part4.ObjectsInList;

public class PersonalInformation {

    private String firstName;
    private String lastName;
    private String identificationNumber;

    public PersonalInformation(String firstName, String lastName, String identificationNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identificationNumber = identificationNumber;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getIdentificationNumber() {
        return this.identificationNumber;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}