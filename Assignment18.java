import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        // Create a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");
        list.add("Grapes");

        System.out.println("Original LinkedList:");
        System.out.println(list);

        // Accessing an element using get()
        System.out.println("\nElement at index 2: " + list.get(2));

        // Accessing the first element
        System.out.println("First element: " + list.getFirst());

        // Accessing the last element
        System.out.println("Last element: " + list.getLast());

        // Removing an element by index
        list.remove(1);

        System.out.println("\nAfter removing element at index 1:");
        System.out.println(list);

        // Removing an element by value
        list.remove("Orange");

        System.out.println("\nAfter removing Orange:");
        System.out.println(list);

        // Removing the first element
        list.removeFirst();

        System.out.println("\nAfter removing first element:");
        System.out.println(list);

        // Removing the last element
        list.removeLast();

        System.out.println("\nAfter removing last element:");
        System.out.println(list);
    }
}
