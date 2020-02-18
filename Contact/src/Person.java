import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private String contactNumber;
    private String anotherContactNumber;
    private String anotherE_mailAddress;
    private String e_mailAddress;

    public String getFirstName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(firstName = "First Name: ");
        String temp = scanner.next();
        firstName += temp;
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAnotherContactNumber() {
        String option;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Would you like to add another contact number? (y/n): ");
            option = scanner.next();
            if (option.equalsIgnoreCase("y"))
                anotherContactNumber = getContactNumber();
            else {
                anotherContactNumber = null;
                break;
            }
        } while (option.equalsIgnoreCase("y"));
        return anotherContactNumber;
    }

    public void setAnotherContactNumber(String anotherContactNumber) {
        this.anotherContactNumber = anotherContactNumber;
    }

    public String getAnotherE_mailAddress() {
        String option;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Would you like to add email address? (y/n): ");
            option = scanner.next();
            if (option.equalsIgnoreCase("y"))
                anotherContactNumber = getE_mailAddress();
            else {
                anotherE_mailAddress = null;
                break;
            }
        } while (option.equalsIgnoreCase("y"));
        return anotherE_mailAddress;
    }

    public void setAnotherE_mailAddress(String anotherE_mailAddress) {
        this.anotherE_mailAddress = anotherE_mailAddress;
    }

    public String getLastName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(lastName = "Last Name: ");
        String temp = scanner.next();
        lastName += temp;
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContactNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(contactNumber = "Contact Number: ");
        String temp = scanner.next();
        contactNumber += temp;
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getE_mailAddress() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(e_mailAddress = "Email Address: ");
        String temp = scanner.next();
        e_mailAddress += temp;
        return e_mailAddress;
    }

    public void setE_mailAddress(String e_mailAddress) {
        this.e_mailAddress = e_mailAddress;
    }
}