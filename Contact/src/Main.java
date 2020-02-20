import java.io.Serializable;
import java.util.Scanner;
/*
 *   @Author: Rakesh Yadav
 */

@SuppressWarnings("serial")
public class Main implements Serializable {

    public static void main(String[] args) {
        Main mObj = new Main();
        Person pObj = new Person();
        int userPressed = 0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Welcome to Rakesh's Contact List App\n" +
                    "Press 1 to add a new contact\n" +
                    "Press 2 to view all contacts\n" +
                    "Press 3 to search for a contact\n" +
                    "Press 4 to delete a contact\n" +
                    "Press 5 to exit program ");
            try {
                userPressed = scan.nextInt();
            } catch (Exception e) {
                System.out.println("An Error occurred " + e);
            }
            switch (userPressed) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;

                default:
                    System.out.println("Unknown Entry ..");
            }
        } while (!true);
    }
}