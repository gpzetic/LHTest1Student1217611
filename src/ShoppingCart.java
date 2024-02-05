import java.util.ArrayList;
public class ShoppingCart {
    ArrayList<Component> components;
    public ShoppingCart() {
        components = new ArrayList<>();
    }
    public void addItem(Component c) {
        components.add(c);
    }
    public double roundPrice(double price) {
        return Math.round(price * 100.00d) / 100.00d;
    }
    public double getTotalPrice() {
        double sum = 0.0d;
        for (Component c : components) {
            sum += c.roundPrice(c.getPrice());
        }
        return roundPrice(sum);
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

    public String getTableSummary() {
        int longestName = getLongest("name");
        int longestManufacturer = getLongest("");
        // print col headers
        String o = "";
        o += addPadding("Name", longestName);
        o += addPadding("Manufacturer", longestManufacturer);
        o += "   Price ($)\n";
        o += "-----------------------------------------\n";
        for (Component c : components) {
            String output = "";
            output += addPadding(c.getName(), longestName);
            output += addPadding(c.getManufacturer(), longestManufacturer);
            output += alignRightPrice(c.getPrice());
            o += output + "\n";
        }
        o += "                             ------------\n";
        o += "\t\t\t\t   total ($)  " + alignRightPrice(getTotalPrice()) + "\n";
        return o;
    }
    private String alignRightPrice(double price) {
        String p = Double.toString(price);
        String output = "";
        int pushAmount = 11 - p.length();
        for (int i = 0; i < pushAmount; i ++) {
            output += " ";
        }
        return output + p;
    }
    private String addPadding(String s, int amount) {
        int toAdd = amount - s.length();
        String output = s;
        if (toAdd > 0) {
            for (int i = 0; i < toAdd; i ++) {
                output += " ";
            }
        }
        return output;
    }
    private int getLongest(String s) {
        int longest = 15;
        for (Component c : components) {
            if (s.equals("name")) {
                if (c.getName().length() > longest) longest = c.getName().length();
            }
            else {
                if (c.getManufacturer().length() > longest) longest = c.getManufacturer().length();
            }
        }
        return longest;
    }
}
