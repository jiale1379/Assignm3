public class Grocery extends Item implements Discount, Tax{
    private double price;
    private double units;
    private double discount;
    private double tax;

    public Grocery(int ItemCode, String name, double Units, double Price, double Discount, double Tax) {
        super(ItemCode, name);
        units = Units;
        price = Price;
        discount = Discount;
        tax = Tax;

    }

    public double computeTotalPrice() {
        return units * price - (units * price * (discount/100)) + computeTax();
    }

    public void displayGrocery() {
        double subtotal;
        subtotal = units * price;
        System.out.println("ItemCode: "+ itemCode + "\n"
                + "Name: " + Name + "\n"
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
        return (units * price - computeDiscount()) * (tax/100);
    }
}


