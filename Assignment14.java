class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    void sound() {
        System.out.println(name + " says: Woof!");
    }
}

class Fox extends Animal {

    Fox(String name) {
        super(name);
    }

    void sound() {
        System.out.println(name + " says: Ring-ding!");
    }
}

class Rabbit extends Animal {

    Rabbit(String name) {
        super(name);
    }

    void sound() {
        System.out.println(name + " says: Squeak!");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {

        Dog dog = new Dog("Buddy");
        Fox fox = new Fox("Foxy");
        Rabbit rabbit = new Rabbit("Snowy");

        dog.eat();
        dog.sound();

        fox.eat();
        fox.sound();

        rabbit.eat();
        rabbit.sound();
    }
}
