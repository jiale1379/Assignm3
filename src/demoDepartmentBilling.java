public class demoDepartmentBilling {
    public static void main (String[] args)
{

    Grocery g1 = new Grocery(11,"Bread",2,1.5,0, 0);
    g1.displayGrocery();

    Grocery g2 = new Grocery(12,"Apple",6,0.75,1, 0);
    g2.displayGrocery();

    Clothing c1 = new Clothing(21,"Jeans",1,35,"Levis",0);
    c1.displayClothing();

    Clothing c2 = new Clothing(22,"Dress Shirt",2,25,"Izod",10);
     c2.displayClothing();

    double totalBill;
     totalBill = g1.computeTotalPrice() + g2.computeTotalPrice() + c1.computeTotalPrice() + c2.computeTotalPrice();
    System.out.println("Total Bill: $" + totalBill);

    }
}


