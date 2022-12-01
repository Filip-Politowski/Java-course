package OOP4;

public class Main {
    public static void main(String[] args) {


        Wallet wallet = new Wallet(3000);

        for (int i = 1; i <= 6; i++) {
            System.out.println("Miesiąc: " + i);
            wallet.addMoney(5000);
            wallet.removeMoney(2000);
            wallet.removeMoney(1000);
        }
        wallet.printAmount();

        Wallet wallet1 = new Wallet();
        wallet1.money = 2000;
        wallet1.addMoney(3000);
        wallet1.printAmount();


    }
}
