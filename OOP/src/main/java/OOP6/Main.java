package OOP6;

public class Main {
    public static void main(String[] args) {

        CarFactory carFactory = new CarFactory();

        Car car1 = carFactory.buildCar();
        car1.yearOfProduction = "1995";

        car1.printInfo();
        car1.changeColor("Orange");
        System.out.println("Kolor po zmianie: " + car1.getColor());

        Car car2 = carFactory.buildCar();
        car2.changeColor("Gold");
        System.out.println("Kolor po zmianie: " + car2.getColor());


    }
}
