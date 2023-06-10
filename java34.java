class Round {
    private int radius;

    public Round(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public float getArea() {
        return (float) (Math.PI * radius * radius);
    }

    public float getcircumference() {
        return (float) (2 * Math.PI * radius);
    }
}

public class Circle_calculation {
    public static void main(String[] args) {
        Round round = new Round(5);
        System.out.println("The area of circle with radius " + round.getRadius() + " is " + round.getArea());
        System.out.println(
                "The circumference of circle with radius " + round.getRadius() + " is " + round.getcircumference());
    }
}