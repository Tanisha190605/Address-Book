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
    }
}
