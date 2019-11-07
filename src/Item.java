public class Item {
    int itemCode;
    String Name;
    public Item(int code, String n) {
        itemCode = code;
        Name = n;
    }
    public void display(){
        System.out.println("Item Code: "+itemCode + "\n" + "Name: " + Name );
    }
}
