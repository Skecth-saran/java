import java.util.*;

public class Array_list {
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Yellow");
        c1.add("White");
        c1.add("Black");
        System.out.println("Array list before Swap:");
        for (String a : c1) {
            System.out.println(a);
        }
        Collections.swap(c1, 0, 2);
        System.out.println("Array list after swap:");
        for (String b : c1) {
            System.out.println(b);
        }
    }
}