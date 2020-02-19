import java.util.Scanner;

public class Main extends Person {
    public static void main(String[] args) {
        Main myObj = new Main();
        myObj.welcomeContactScreen();

    }

    public int welcomeContactScreen() {
        int userPressed = 0;
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("\t\tWelcome to Rakesh's Contact List App\n" +
                    "\t\tPress 1 to add a new contact\n" +
                    "\t\tPress 2 to view all contacts\n" +
                    "\t\tPress 3 to search for a contact\n" +
                    "\t\tPress 4 to delete a contact\n" +
                    "\t\tPress 5 to exit program ");
            userPressed = scan.nextInt();

            if (userPressed == 1) {
                addContact();
            } else if (userPressed == 2) {
                viewContactsList();
            } else if (userPressed == 3) {
                searchIntoContactsList();
            } else if (userPressed == 4) {
                delete_a_contact_from_contacts_list();
            } else if (userPressed == 5) {
                exitProgram();
            } else
                System.out.println("\t\tYou Entered Wrong Choice Please Check\n\tDo You Want To Continue ? (y/n)" + ((scan.next().equalsIgnoreCase("y") ? welcomeContactScreen() : "Good Bye")));
        } catch (Exception e) {
            System.out.println("Please Check Your Input :" + e);
        }
        return userPressed;
    }

    public void addContact() {
        System.out.println("You have chosen to add a new contact: \n" +
                "Please enter the name of the Person");

    }

    public void viewContactsList() {

    }

    public void searchIntoContactsList() {

    }

    public void delete_a_contact_from_contacts_list() {

    }

    public void exitProgram() {

    }
}
