
class Animal {
    String name;


    Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called");
    }


    void display() {
        System.out.println("Animal name: " + name);
    }
}


class Dog extends Animal {
    String breed;


    Dog(String name, String breed) {

        super(name);
        this.breed = breed;
        System.out.println("Dog constructor called");
    }


    void display() {

        super.display();
        System.out.println("Dog breed: " + breed);
    }

    void showDetails() {

        System.out.println("Using super to access superclass field: " + super.name);
    }
}


