import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class priorityqueueconversions {
    public static void main(String[] args) {
        PriorityQueue<String> a = new PriorityQueue<>();
        a.add("kite");
        a.add("square");
        a.add("rectangle");
        a.add("rhombus");
        a.add("parellelogram");
        System.out.println("queue:" + a);
        List<String> al = new ArrayList<>(a);
        System.out.println("Arraylist:" + al);
        String str = a.toString();
        System.out.println("converted String:" + str);
    }
}
