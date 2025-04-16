import java.util.Scanner;

class Stack {
    private int[] stack;
    private int top;
    private int capacity;
    
    public Stack(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }
    
    public void push(int item) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow! Cannot push " + item);
            return;
        }
        stack[++top] = item;
        System.out.println(item + " pushed to stack.");
    }
    
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1;
        }
        return stack[top--];
    }
    
    public boolean isEmpty() {
        return top == -1;
    }
    
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}

public class StackImplementation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int size = scanner.nextInt();
        
        Stack stack = new Stack(size);
        
        while (true) {
            System.out.println("\n1. Push\n2. Pop\n3. Check if empty\n4. Display stack\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int item = scanner.nextInt();
                    stack.push(item);
                    break;
                case 2:
                    int popped = stack.pop();
                    if (popped != -1) {
                        System.out.println("Popped element: " + popped);
                    }
                    break;
                case 3:
                    System.out.println("Stack is " + (stack.isEmpty() ? "empty." : "not empty."));
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
