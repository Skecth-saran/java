import java.util.*;

class DeleteElement {
    int p;
    int a[];
    int s;
    int top = -1;

    DeleteElement(int p) {
        a = new int[p];
        s = p;
    }

    void push(int data) {
        if (top == s - 1) {
            System.out.println("Stack full");
        } else {
            top++;
            a[top] = data;
        }
    }

    void pop() {
        if (top != -1) {
            System.out.println("Deleted element is " + a[top]);
            top--;
        }
    }

    void display() {
        System.out.println("The elements in stack");
        for (int i = top; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        DeleteElement d = new DeleteElement(p);
        int data;
        for (int i = 0; i < p; i++) {
            data = sc.nextInt();
            d.push(data);
        }
        d.pop();
        d.display();
    }
}
