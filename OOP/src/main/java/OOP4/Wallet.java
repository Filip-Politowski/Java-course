package OOP4;

public class Wallet {
    float money;

    Wallet() {
        this.money = 2000;
    }

    Wallet(float amount) {
        this.money = amount;
    }

    public void addMoney(float amount) {
        this.money += amount;
    }

    public void removeMoney(float amount) {
        this.money -= amount;
    }

    public void printAmount() {
        System.out.println("Aktualna wartośc portfela: " + this.money);
    }


}
