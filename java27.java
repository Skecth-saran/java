class Restaurant {
    private ArrayList<String> menuItems;
    private ArrayList<Double> prices;
    private ArrayList<Integer> ratings;

    public Restaurant() {
        this.menuItems = new ArrayList<String>();
        this.prices = new ArrayList<Double>();
        this.ratings = new ArrayList<Integer>();
    }

    public void addItem(String item, double price) {
        this.menuItems.add(item);
        this.prices.add(price);
        this.ratings.add(0);
    }

    public void removeItem(String item) {
        int index = this.menuItems.indexOf(item);
        if (index >= 0) {
            this.menuItems.remove(index);
            this.prices.remove(index);
            this.ratings.remove(index);
        }
    }

    public void addRating(String item, int rating) {
        int index = this.menuItems.indexOf(item);
        if (index >= 0) {
            int currentRating = this.ratings.get(index);
            this.ratings.set(index, currentRating + rating);
        }
    }

    public double getAverageRating(String item) {
        int index = this.menuItems.indexOf(item);
        if (index >= 0) {
            int totalRating = this.ratings.get(index);
            int numRatings = totalRating > 0 ? this.ratings.size() : 1;
            return (double) totalRating / numRatings;
        } else {
            return 0.0;
        }
    }

    public void displayMenu() {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(menuItems.get(i) + ": $" + prices.get(i));
        }
    }

    public double calculateAverageRating() {
        double totalRating = 0;
        int numRatings = 0;
        for (int i = 0; i < ratings.size(); i++) {
            totalRating += ratings.get(i);
            numRatings++;
        }
        return numRatings > 0 ? totalRating / numRatings : 0.0;
    }
}

public class Restaurant_rating {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        restaurant.addItem("Burger", 8.99);
        restaurant.addItem("Pizza", 10.99);
        restaurant.addItem("Salad", 6.00);
        System.out.println("Menu:");
        restaurant.displayMenu();
        restaurant.addRating("Burger", 4);
        restaurant.addRating("Burger", 5);
        restaurant.addRating("Pizza", 3);
        restaurant.addRating("Salad", 2);
        System.out.println("Average rating: " + restaurant.calculateAverageRating());
        System.out.println("Remove 'Pizza' from the above menu.");
        restaurant.removeItem("Pizza");
        System.out.println("\nUpdated menu:");
        restaurant.displayMenu();
    }
}
