package OOP11;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck("Czerwony");
        System.out.println("Przyśpieszenie max: " + truck.acceleration);//Nie da sie już zmienić bo to stała
        System.out.println("Prędkość max: " + truck.topSpeed);//to samo co powyżej
        truck.printInfo();
    }
}
