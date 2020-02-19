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

    }
}
