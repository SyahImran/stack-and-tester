import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Tester {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<String>();
        while(true) {
            System.out.println("\n-Menu-");
            System.out.println("1. Print");
            System.out.println("2. Size");
            System.out.println("3. Empty");
            System.out.println("4. Get");
            System.out.println("5. Push");
            System.out.println("6. Peek");
            System.out.println("7. Pop");
            System.out.println("8. Exit");
            System.out.print("Enter: ");
            int x = sc.nextInt();
            if (x == 1)
                System.out.println("\nThe data in the stack is: " + stack.toString());
            else if (x == 2) {
                System.out.println("\nThe size of the stack is " + stack.size());
            }
            else if (x == 3) {
                if(stack.empty())
                    System.out.println("\nThe stack is empty");
                else
                    System.out.println("\nThe stack has text");

            }
            else if (x == 4) {
                System.out.print("\nEnter a location: ");
                int y = sc.nextInt();
                if(y > stack.size()-1)
                    System.out.println("Spot " + y + " does not exist");
                else
                    System.out.println("The value at location " + y + " is " + stack.get(y));
            }
            else if (x == 5) {
                System.out.print("\nEnter a value: ");
                String s = sc.nextLine();
                stack.push(s);
            }
            else if (x == 6) {
                System.out.println("\nThe top item is " + stack.peek());
            }
            else if (x == 7) {
                System.out.println("\n" + stack.pop() + " was removed from the stack");
            }
            else if (x == 8) {
                System.out.println("\nGood Bye");
                break;
            }
        }
    }
}
