public class main {
    public static void main(String[] args) {
        final int a = 20;
        System.out.println("Cannot change in main lets try to access and change in other class");
        keyword obj = new keyword();
        System.out.println("Calling the other class with value as 20 to set");
        obj.setter(30);
    }
}

class keyword {
    final int a = 10;

    void setter(int num) {
        System.out.println("Cannot change the final keyword,the value of final int a is " + a);
    }
}