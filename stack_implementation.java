class Stack {
    int arr[] = new int[5];
    int top = -1;

    void push(int x) {
        if (top == 4)
            System.out.println("Stack Overflow");
        else
            arr[++top] = x;
    }

    void pop() {
        if (top == -1)
            System.out.println("Stack Underflow");
        else
            System.out.println(arr[top--] + " removed");
    }

    void peek() {
        if (top == -1)
            System.out.println("Empty");
        else
            System.out.println("Top: " + arr[top]);
    }

    void display() {
        for (int i = top; i >= 0; i--)
            System.out.println(arr[i]);
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();
        s.peek();
        s.pop();
        s.display();
    }
}