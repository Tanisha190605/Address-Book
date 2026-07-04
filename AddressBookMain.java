import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book System");

        Scanner sc = new Scanner(System.in);

        AddressBook addressBook = new AddressBook();

        System.out.print("Enter First Name: ");
        addressBook.person.firstName = sc.nextLine();

        System.out.print("Enter Last Name: ");
        addressBook.person.lastName = sc.nextLine();

        System.out.print("Enter Address: ");
        addressBook.person.address = sc.nextLine();

        System.out.print("Enter City: ");
        addressBook.person.city = sc.nextLine();

        System.out.print("Enter State: ");
        addressBook.person.state = sc.nextLine();

        System.out.print("Enter Zip: ");
        addressBook.person.zip = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        addressBook.person.phoneNumber = sc.nextLine();

        System.out.print("Enter Email: ");
        addressBook.person.email = sc.nextLine();

        System.out.println("\nContact Added Successfully!");

        System.out.println("First Name: " + addressBook.person.firstName);
        System.out.println("Last Name: " + addressBook.person.lastName);
        System.out.println("Address: " + addressBook.person.address);
        System.out.println("City: " + addressBook.person.city);
        System.out.println("State: " + addressBook.person.state);
        System.out.println("Zip: " + addressBook.person.zip);
        System.out.println("Phone: " + addressBook.person.phoneNumber);
        System.out.println("Email: " + addressBook.person.email);

        sc.close();
    }
}