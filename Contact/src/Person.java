import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private String contactNumber;
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
        } catch (Exception e) {
            System.out.println("Please Check Your Input :" + e);
        }
        return userPressed;
    }

    public static void addContact() {

    }

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

    public String getE_mailAddress() {
        return e_mailAddress;
    }

    public void setE_mailAddress(String e_mailAddress) {
        this.e_mailAddress = e_mailAddress;
    }
}
