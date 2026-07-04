public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book System");

        AddressBook addressBook = new AddressBook();

        addressBook.addContact();
        addressBook.addContact();

        addressBook.displayContact();
    }
}