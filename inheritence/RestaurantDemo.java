package inheritence;

// Superclass
class FoodItem {
    private String name;
    private double price;

    public FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Item: " + name + ", Price: " + price);
    }
}

class Starter extends FoodItem {
    public Starter(String name, double price) {
        super(name, price);
    }

    public void category() {
        System.out.println("Category: Starter");
    }
}

class MainCourse extends FoodItem {
    public MainCourse(String name, double price) {
        super(name, price);
    }

    public void category() {
        System.out.println("Category: Main Course");
    }
}

class Dessert extends FoodItem {
    public Dessert(String name, double price) {
        super(name, price);
    }

    public void category() {
        System.out.println("Category: Dessert");
    }
}

public class RestaurantDemo {
    public static void main(String[] args) {
        Starter s = new Starter("Spring Rolls", 120);
        MainCourse m = new MainCourse("Paneer Butter Masala", 250);
        Dessert d = new Dessert("Gulab Jamun", 80);

        s.displayDetails();
        s.category();

        m.displayDetails();
        m.category();

        d.displayDetails();
        d.category();
    }
}
