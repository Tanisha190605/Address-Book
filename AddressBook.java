import java.util.Scanner;

public class AddressBook {

    Contact person = new Contact();
    Scanner sc = new Scanner(System.in);

    // UC2
    public void addContact() {

        System.out.print("Enter First Name: ");
        person.firstName = sc.nextLine();

        System.out.print("Enter Last Name: ");
        person.lastName = sc.nextLine();

        System.out.print("Enter Address: ");
        person.address = sc.nextLine();

        System.out.print("Enter City: ");
        person.city = sc.nextLine();

        System.out.print("Enter State: ");
        person.state = sc.nextLine();

        System.out.print("Enter Zip: ");
        person.zip = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        person.phoneNumber = sc.nextLine();

        System.out.print("Enter Email: ");
        person.email = sc.nextLine();
    }

    // UC3
    public void editContact() {

        System.out.print("\nEnter First Name to Edit: ");
        String name = sc.nextLine();

        if (person.firstName.equals(name)) {

            System.out.println("Contact Found!");

            System.out.print("Enter New Address: ");
            person.address = sc.nextLine();

            System.out.print("Enter New City: ");
            person.city = sc.nextLine();

            System.out.print("Enter New State: ");
            person.state = sc.nextLine();

            System.out.print("Enter New Zip: ");
            person.zip = sc.nextLine();

            System.out.print("Enter New Phone Number: ");
            person.phoneNumber = sc.nextLine();

            System.out.print("Enter New Email: ");
            person.email = sc.nextLine();

            System.out.println("Contact Updated Successfully!");

        } else {

            System.out.println("Contact Not Found!");

        }
    }
    public void deleteContact() {

    System.out.print("Enter First Name to Delete: ");
    String name = sc.nextLine();

    if (person.firstName.equals(name)) {

        person.firstName = null;
        person.lastName = null;
        person.address = null;
        person.city = null;
        person.state = null;
        person.zip = null;
        person.phoneNumber = null;
        person.email = null;

        System.out.println("Contact Deleted Successfully!");

    } else {

        System.out.println("Contact Not Found!");

    }
}

    public void displayContact() {

        System.out.println("\n----- Contact Details -----");
        System.out.println("First Name : " + person.firstName);
        System.out.println("Last Name : " + person.lastName);
        System.out.println("Address : " + person.address);
        System.out.println("City : " + person.city);
        System.out.println("State : " + person.state);
        System.out.println("Zip : " + person.zip);
        System.out.println("Phone : " + person.phoneNumber);
        System.out.println("Email : " + person.email);
    }
}
