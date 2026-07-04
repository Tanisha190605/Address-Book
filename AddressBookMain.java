public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book System");

        AddressBook addressBook = new AddressBook();

        // UC2
        addressBook.addContact();

        // UC3
        addressBook.editContact();

        // UC4
        addressBook.deleteContact();

        // Display updated contact
        addressBook.displayContact();
    }
}