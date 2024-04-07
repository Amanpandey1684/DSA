import java.util.Scanner;

class Node {
    String name;
    int marks;
    Node next;

    Node(String name, int marks) {
        this.name = name;
        this.marks = marks;
        this.next = null;
    }
}

public class Stack_assingment {
    Node top;

    Stack_assingment() {
        this.top = null;
    }

    boolean isEmpty() {
        return top == null;
    }

    void push(String name, int marks) {
        Node newNode = new Node(name, marks);
        newNode.next = top;
        top = newNode;
    }

    Node pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        Node curr = top;
        top = top.next;
        curr.next = null;
        return curr;
    }

    void displaystack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        Node last = top;
        while (last != null) {
            System.out.println("Name: " + last.name + ", Marks: " + last.marks);
            last = last.next;
        }
    }

    void printTopThree() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        Stack_assingment tempStack = new Stack_assingment();
        Node current = top;
        while (current != null) {
            tempStack.push(current.name, current.marks);
            current = current.next;
        }
        for (int i = 0; i < 3 && !tempStack.isEmpty(); i++) {
            Node maxNode = tempStack.pop();
            System.out.println("Position " + (i + 1) + ": Name: " + maxNode.name + ", Marks: " + maxNode.marks);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack_assingment stack = new Stack_assingment();

        while (true) {
            System.out.println("\nChoose operation:");
            System.out.println("1. Add a student to Stack");
            System.out.println("2. Remove a Student from the Stack");
            System.out.println("3. Display all students of Stack");
            System.out.println("4. Display the top 3 positions of students");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter student name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter marks:");
                    int marks = scanner.nextInt();
                    stack.push(name, marks);
                    break;
                case 2:
                    Node removedNode = stack.pop();
                    if (removedNode != null) {
                        System.out.println(
                                "Removed Student: Name: " + removedNode.name + ", Marks: " + removedNode.marks);
                    }
                    break;
                case 3:
                    stack.displaystack();
                    break;
                case 4:
                    stack.printTopThree();
                    break;
                case 5:
                default:
                    scanner.close();
                    System.exit(0);
            }
        }
    }
}
