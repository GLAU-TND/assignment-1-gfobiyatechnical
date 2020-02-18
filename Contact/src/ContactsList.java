import java.util.Formatter;

class ContactsList extends Person {
    private Formatter contactList;

    public void openFile() {
        try {
            contactList = new Formatter("Contact_List.txt");
        } catch (Exception e) {
            System.out.println("An Error Occurred i.e.," + e);
        }
    }

    public void addRecord() {
        contactList.format("%s %s %s %s %s", getFirstName(), getLastName(), getContactNumber(), getAnotherContactNumber(), getAnotherE_mailAddress());
    }

    public void closeFile() {
        contactList.close();
    }
}