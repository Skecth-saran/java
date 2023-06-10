import java.util.HashSet;
import java.util.Spliterator;
import java.util.function.Consumer;

public class hashsplit {
    public static void main(String[] args) {
        HashSet<String> a = new HashSet<String>();
        a.add("Saran");
        a.add("Poori");
        a.add("Guhan");
        a.add("Karan");
        a.add("Kishore");
        a.add("Sudhar");
        Spliterator<String> spl = a.spliterator();
        System.out.println("Elements in set");
        spl.forEachRemaining((n) -> System.out.println(n));
    }
}