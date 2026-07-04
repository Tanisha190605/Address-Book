public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book program in Java");
        Contact person = new Contact();
        person.firstName = "Tanisha";
        person.lastName = "Gupta";
        person.address = "123 Main Street";
        person.city = "Bulandshahr";
        person.state = "Uttar Pradesh";
        person.zip = "203131";
        person.phoneNumber = "9876543210";
        person.email = "tanisha.gupta@example.com";

        System.out.println("Contact Details:");
        System.out.println("Name: " + person.firstName + " " + person.lastName);
        System.out.println("Address: " + person.address);
        System.out.println("City: " + person.city);
        System.out.println("State: " + person.state);
        System.out.println("Zip: " + person.zip);
        System.out.println("Phone: " + person.phoneNumber);
        System.out.println("Email: " + person.email);   
    }
}
