import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private String contactNumber;
    private String anotherContactNumber;
    private String anotherE_mailAddress;
    private String e_mailAddress;

    public static int welcomeContactScreen() {
        int userPressed = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("\t\tWelcome to Rakesh's Contact List App\n" +
                "Press 1 to add a new contact\n" +
                "Press 2 to view all contacts\n" +
                "Press 3 to search for a contact\n" +
                "Press 4 to delete a contact\n" +
                "Press 5 to exit program \n");
        try {
            userPressed = scan.nextInt();
            if (userPressed == 1) {


            } else if (userPressed == 2) {

            } else if (userPressed == 3) {

            } else if (userPressed == 4) {

            } else if (userPressed == 5) {

            }
        } catch (Exception e) {
            System.out.println("Please Check Your Input :" + e);
        }
        return userPressed;
    }

    public String getFirstName() {
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.next();
        firstName = "First Name: " + temp;
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
            else anotherContactNumber = null;
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
            else anotherE_mailAddress = null;
        } while (option.equalsIgnoreCase("y"));
        return anotherE_mailAddress;
    }

    public void setAnotherE_mailAddress(String anotherE_mailAddress) {
        this.anotherE_mailAddress = anotherE_mailAddress;
    }

    public String getLastName() {
        Scanner scanner = new Scanner(System.in);
        lastName = "Last Name: " + scanner.next();
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContactNumber() {
        Scanner scanner = new Scanner(System.in);
        contactNumber = "Contact Number: " + scanner.next();
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getE_mailAddress() {
        Scanner scanner = new Scanner(System.in);
        contactNumber = "Email Address: " + scanner.next();
        return e_mailAddress;
    }

    public void setE_mailAddress(String e_mailAddress) {
        this.e_mailAddress = e_mailAddress;
    }

    public void addContact() {
        System.out.println("You have chosen to add a new contact: \n" +
                "Please enter the name of the Person");
        getFirstName();
        getLastName();
        getContactNumber();
        getAnotherContactNumber();
        getAnotherE_mailAddress();
    }
}