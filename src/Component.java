public class Component {
    private String name;
    private String manufacturer;
    private int price;
    public Component(String name, String manufacturer, int price) {
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
