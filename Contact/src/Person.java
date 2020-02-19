import java.io.Serializable;
/*
author : Rakesh Yadav

 */

class Person implements Serializable {

    private String firstName;
    private String lastName;
    private String contactNumber;
    private String anotherContactNumber;
    private String e_mailAddress;
    private String anotherE_mailAddress;
    private Person next;

    // create instance of Person and set next to 'null'
    public Person() {
        next = null;
    }

    // getter and setter methods of firstName , lastName , contactNumber , anotherContactNumber , emailAddress and anotherE_mailAddress
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAnotherContactNumber() {
        return anotherContactNumber;
    }

    public void setAnotherContactNumber(String anotherContactNumber) {
        this.anotherContactNumber = anotherContactNumber;
    }

    public String getE_mailAddress() {
        return e_mailAddress;
    }

    public void setE_mailAddress(String e_mailAddress) {
        this.e_mailAddress = e_mailAddress;
    }

    public String getAnotherE_mailAddress() {
        return anotherE_mailAddress;
    }

    public void setAnotherE_mailAddress(String anotherE_mailAddress) {
        this.anotherE_mailAddress = anotherE_mailAddress;
    }

    public Person getNext() {
        return next;
    }

    public void setNext(Person next) {
        this.next = next;
    }

    // toString method @Override
    public String toString() {
        return "First Name: " + firstName + "Last Name: " + lastName + "Contact Number: " + contactNumber + " " + anotherContactNumber + "Email Address: " + e_mailAddress + " " + getAnotherE_mailAddress();
    }
}
