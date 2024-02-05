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
        this.manufacturer = manufacturer;
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
}
