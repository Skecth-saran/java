class main {

    static <N> void genericDisplay(N element) {
        System.out.println(element.getClass().getName() + " = " + element);
    }

    public static void main(String[] args) {
        genericDisplay(12);
        genericDisplay("Saran");
        genericDisplay(1.2);
    }
}