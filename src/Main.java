public class Main {
    public static void main(String[] args) {

        Component c = new Component("ggg", "XTREEM", 9999.993d);
        System.out.println(c.toString());
        ShoppingCart sc = new ShoppingCart();
        sc.addItem(c);
        sc.addItem(c);
        sc.addItem(c);
        System.out.println(sc.getComponentNames());
        System.out.println(sc.getTotalPrice());
    }
}