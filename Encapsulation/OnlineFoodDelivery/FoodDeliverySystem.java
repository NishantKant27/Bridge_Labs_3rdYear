package OnlineFoodDelivery;
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        setItemName(itemName);
        setPrice(price);
        setQuantity(quantity);
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        if (itemName == null || itemName.trim().isEmpty()) {
            this.itemName = "Unknown Item";
        } else {
            this.itemName = itemName;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            this.price = 0;
        } else {
            this.price = price;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0) {
            this.quantity = 1;
        } else {
            this.quantity = quantity;
        }
    }

    public void getItemDetails() {
        System.out.println("Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity);
    }

    public abstract double calculateTotalPrice();
}

interface Discountable {
    void applyDiscount(double percentage);
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    private double discount;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) - discount;
    }

    @Override
    public void applyDiscount(double percentage) {
        discount = (getPrice() * getQuantity()) * (percentage / 100);
    }

    @Override
    public String getDiscountDetails() {
        return "Discount on Veg Item: " + discount;
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private double discount;
    private double extraCharge = 50;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + extraCharge - discount;
    }

    @Override
    public void applyDiscount(double percentage) {
        discount = (getPrice() * getQuantity()) * (percentage / 100);
    }

    @Override
    public String getDiscountDetails() {
        return "Discount on Non-Veg Item: " + discount;
    }
}

public class FoodDeliverySystem {
    public static void processOrder(FoodItem[] order) {
        for (FoodItem item : order) {
            item.getItemDetails();
            double total = item.calculateTotalPrice();
            System.out.println("Total Price: " + total);
            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                System.out.println(d.getDiscountDetails());
            }
            System.out.println("----------------------");
        }
    }

    public static void main(String[] args) {
        FoodItem f1 = new VegItem("Paneer Curry", 200, 2);
        FoodItem f2 = new NonVegItem("Chicken Biryani", 300, 1);

        if (f1 instanceof Discountable) {
            ((Discountable) f1).applyDiscount(10);
        }
        if (f2 instanceof Discountable) {
            ((Discountable) f2).applyDiscount(5);
        }

        FoodItem[] order = { f1, f2 };
        processOrder(order);
    }
}

