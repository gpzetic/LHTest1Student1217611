import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Component {
    private String name;
    private String manufacturer;
    private double price;
    public Component(String name, String manufacturer, double price) {
        setName(name);
        setManufacturer(manufacturer);
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 3) {
            this.name = name;
        }
        else {
            throw new IllegalArgumentException("Name too short");
        }
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        List<String> validManufacturers = Arrays.asList("3Com","Acer","Arctic","AMD", "Asus","Apple Inc.","Bose","Cooler Master", "Hitachi", "Intel", "Logitech", "Marvell", "Nvidia", "Qualcomm", "Samsung","Tyan","Fujitsu","MSI","Seagate","Toshiba", "Western Digital", "XTREEM");
        if (validManufacturers.contains(manufacturer)) {
            this.manufacturer = manufacturer;
        }
        else throw new IllegalArgumentException("Manufacturer not in list of valid manufacturers");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0 && price <= 10000) {
            this.price = price;
        }
        else {
            if (price < 0) throw new IllegalArgumentException("Price too low");
            else throw new IllegalArgumentException("Price too high");
        }
    }
    private double roundPrice(double price) {
        return Math.round(price * 100.00d) / 100.00d;
    }
    public String toString() {
        return name + "-" + manufacturer + ", price: $" + roundPrice(price);
        
    }
}
