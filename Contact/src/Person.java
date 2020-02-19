class Person<String> {
    private Node<String> head = null;
    private int size = 0;
    private String firstName;
    private String lastName;
    private String contactNumber;
    private String anotherContactNumber;
    private String anotherE_mailAddress;
    private String e_mailAddress;


    private static class Node<String> {
        private Node<String> next;
        private String firstName;
        private String lastName;
        private String contactNumber;
        private String anotherContactNumber;
        private String anotherE_mailAddress;
        private String e_mailAddress;

        public Node(String firstName, String lastName, String contactNumber, String anotherContactNumber, String anotherE_mailAddress, String e_mailAddress) {

            this.firstName = firstName;
            this.lastName = lastName;
            this.contactNumber = contactNumber;
            this.anotherContactNumber = anotherContactNumber;
            this.anotherE_mailAddress = anotherE_mailAddress;
            this.e_mailAddress = e_mailAddress;
        }

        public Node<String> getNext() {
            return next;
        }

        public void setNext(Node<String> next) {
            this.next = next;
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

        public String getAnotherContactNumber() {
            return anotherContactNumber;
        }

        public void setAnotherContactNumber(String anotherContactNumber) {
            this.anotherContactNumber = anotherContactNumber;
        }

        public String getAnotherE_mailAddress() {
            return anotherE_mailAddress;
        }

        public void setAnotherE_mailAddress(String anotherE_mailAddress) {
            this.anotherE_mailAddress = anotherE_mailAddress;
        }

        public String getE_mailAddress() {
            return e_mailAddress;
        }

        public void setE_mailAddress(String e_mailAddress) {
            this.e_mailAddress = e_mailAddress;
        }
    }

}
