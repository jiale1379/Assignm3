public class Clothing extends Item implements Discount, Tax {
    private String brand;
    private double price;
    private double units;
    private double discount;
    final double taxp=8.5;

    public Clothing(int ItemCode, String name, double Units, double Price, String Brand, double Discount) {
        super(ItemCode, name);
        units = Units;
        price = Price;
        brand = Brand;
        discount = Discount;
    }

    public double computeTotalPrice() {
        return units * price - (units * price * (discount/100)) + computeTax();
    }

    public void displayClothing() {
        double subtotal;
        subtotal = units * price;
        System.out.println("ItemCode: "+ itemCode + "\n"
                + "Name: " + Name + "\n"
                + "Brand: " + brand + "\n"
                + "Unit Price: $" + price + "\n"
                + "Units: " + units + "\n"
                + "Subtotal: $" + subtotal + "\n"
                + "Savings: -$" + computeDiscount() + "\n"
                + "Tax Amount: +$" + computeTax() + "\n"
                + "Final Price: $" + computeTotalPrice() + "\n");
    }

    public double computeDiscount() {
        return units * price * (discount/100);
    }

    public double computeTax() {
        return (units * price - computeDiscount()) * (taxp/100);
    }
}
