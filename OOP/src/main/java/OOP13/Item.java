package OOP13;

public class Item {
    static int numItems = 0;
    static int ID;

    Item(int id) {
        ID = id;
    }

    public static int getNextId() {
        return Item.numItems++;
    }

    public static Item getItem() {
        int id = Item.getNextId();
        Item item = new Item(id);
        return  item;
    }

    static void printNumItems() {
        System.out.println("NumItems: " + Item.numItems);
    }

    public void printID() {
        System.out.println("Item ID: " + this.ID);
    }


}
