import java.util.Scanner;

public class palindrome_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char stack[] = new char[str.length()];
        int top = -1;

        for (int i = 0; i < str.length(); i++)
            stack[++top] = str.charAt(i);

        boolean palindrome = true;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != stack[top--]) {
                palindrome = false;
                break;
            }
        }

        if (palindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}
