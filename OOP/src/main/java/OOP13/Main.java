package OOP13;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
         Item item = Item.getItem();
         item.printID();
        }
        Item.printNumItems();
    }
}
