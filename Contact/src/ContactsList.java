/*
 *   @Author: Rakesh Yadav
 */

import java.io.Serializable;

@SuppressWarnings("serial")
public class ContactsList implements Serializable {
    private Person head;
    private int contactLintLength;

    //initialize contactsList
    public ContactsList() {
        head = null;
        contactLintLength = 0;
    }

    // method to add firstName,lastName,contactNumber,anotherContactNumber,emailAddress and anotherEmailAddress in String form
    public void addInContactsLast(String firstName, String lastName, String contactNumber, String anotherContactNumber, String emailAddress, String anotherEmailAddress) {
        Person current = head;
        Person previous = null;
        Person newNode = new Person();

        // set the data
        newNode.setFirstName(firstName);
        newNode.setLastName(lastName);
        newNode.setContactNumber(contactNumber);
        newNode.setAnotherContactNumber(anotherContactNumber);
        newNode.setE_mailAddress(emailAddress);
        newNode.setAnotherE_mailAddress(anotherEmailAddress);

        if (isEmpty()) {
            head = newNode;
            contactLintLength++;
        } else {

        }
    }

    // method to use if the linked list is empty
    public boolean isEmpty() {
        return (contactLintLength == 0);
    }

    // method to printContactsList
    public void printContactsList() {
        // start at the head and check if there's anything there
        Person tempNode = head;
        if (head == null) {
            System.out.println("The list is empty!");
        } else {

            for (int i = 0; i < contactLintLength; i++) {
                System.out.print("Index = " + (i + 1) + " ");
                System.out.println(tempNode);
                tempNode = tempNode.getNext();
            }
        }
        System.out.println();
    }

    // method used to search through the names in the string
    public void searchByFirstName(String firstName) {
        Person current = head;
        boolean empty = true;

        // check to see if the list is empty
        if (isEmpty()) {
            System.out.println("The list is empty!");
        } else {
            for (int i = 0; i < contactLintLength; i++) {
                if (current.getFirstName().toLowerCase().contains(firstName.toLowerCase())) {
                    System.out.print("Index = " + (i + 1) + " ");
                    System.out.println(current);
                    empty = false;
                }
                // go to the next node
                current = current.getNext();
            }
            // if statement to show if there are no matches found
            if (empty) {
                System.out.println("NO RESULTS FOUND!");
            }
        }

    }

}
