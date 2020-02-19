import java.io.Serializable;

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

}
