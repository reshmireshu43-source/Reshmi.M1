class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{name='" + name + "', age=" + age + "}";
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{name='" + name + "', age=" + age +
               ", breed='" + breed + "'}";
    }
}

class Cat extends Animal {
    String color;

    Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{name='" + name + "', age=" + age +
               ", color='" + color + "'}";
    }
}

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 5);
        Dog dog = new Dog("Buddy", 3, "Labrador");
        Cat cat = new Cat("Kitty", 2, "White");

        System.out.println(animal);
        System.out.println(dog);
        System.out.println(cat);
    }
}
