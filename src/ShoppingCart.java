import java.util.ArrayList;
public class ShoppingCart {
    ArrayList<Component> components;
    public ShoppingCart() {
        components = new ArrayList<>();
    }
    public void addItem(Component c) {
        components.add(c);
    }
    public double getTotalPrice() {
        double sum = 0.0d;
        for (Component c : components) {
            sum += c.getPrice();
        }
        return sum;
    }
    public String getComponentNames() {
        String componentNames = "";
        for (int i = 0; i < components.size(); i ++) {
            componentNames += components.get(i).getName();
            if (i + 1 != components.size()) componentNames += ", ";
        }
        return componentNames;
    }
    public String toString() {
        return "The cart has " + components.size() + " components with a total price of $" + getTotalPrice();
    }
}
