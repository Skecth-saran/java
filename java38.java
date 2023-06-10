class M_Details {
    private String brand;
    private String model;
    private double price;
    private int warrenty;

    public M_Details(String brand, String model, double price, int warrenty) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.warrenty = warrenty;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getWarrenty() {
        return warrenty;
    }

    public void setWarrenty(int warrenty) {
        this.warrenty = warrenty;
    }
}

public class Mobile {
    public static void main(String[] args) {
        M_Details md1 = new M_Details("Vivo", "V9 Pro", 16500.50, 3);
        M_Details md2 = new M_Details("Redmi", "9 Pro", 14500.50, 2);
        System.out.println("Price of " + md1.getBrand() + " " + md1.getModel() + " is " + md1.getPrice()
                + " and has warrenty for " + md1.getWarrenty() + " years.");
        System.out.println("Price of " + md2.getBrand() + " " + md2.getModel() + " is " + md2.getPrice()
                + " and has warrenty for " + md2.getWarrenty() + " years.");
        md1.setWarrenty(2);
        md2.setBrand("IQ");
        md2.setModel("Z6");
        md2.setPrice(16750.75);
        md2.setWarrenty(2);
        System.out.println("**AFTER UPDATION**");
        System.out.println("Price of " + md1.getBrand() + " " + md1.getModel() + " is " + md1.getPrice()
                + " and has warrenty for " + md1.getWarrenty() + " years.");
        System.out.println("Price of " + md2.getBrand() + " " + md2.getModel() + " is " + md2.getPrice()
                + " and has warrenty for " + md2.getWarrenty() + " years.");
    }
}
