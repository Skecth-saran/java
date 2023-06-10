public class main {
    void test(int count) {
        if (count == 5) {
            return;
        }
        System.out.println("B4 Test Method---->" + count);
        test(count - 1);
        System.out.println("  After Test Method---->" + count);
    }

    public static void main(String[] args) {
        new main().test(10);
    }

}