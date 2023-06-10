class Details {
    private int length, width, height, radius;
    private double volume;

    Details(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.volume = length * width * height;
    }

    Details(int length) {
        this.length = length;
        this.volume = length * length * length;
    }

    Details(int radius, int height) {
        this.radius = radius;
        this.height = height;
        this.volume = 3.14 * (radius * radius) * height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double totalVolume() {
        return volume;
    }
}

public class Volume {
    public static void main(String[] args) {
        Details cube = new Details(40);
        Details cylinder = new Details(15, 30);
        Details cuboid = new Details(40, 20, 30);
        System.out.println("The Volume of the Cube is " + cube.totalVolume() + " cubic units");
        System.out.println("The Volume of the Cuboid is " + cuboid.totalVolume() + " cubic units");
        System.out.println("The Volume of the Cylinder is " + cylinder.totalVolume() + " cubic units");
    }
}