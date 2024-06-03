public class person {
    // Instance variables
    String name;
    int age;
    String address;

    // Constructor to initialize the Person object
    public person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Method to display person's details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    // Method to change the address
    public void changeAddress(String newAddress) {
        address = newAddress;
    }
}


