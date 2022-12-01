package OOP1;

public class Main {
    public static void main(String[] args) {
       Cars ford = new Cars();
       ford.manufacturer = "Ford";
       ford.name = "Mustang";
       ford.color = "Red";
       ford.year = 1995;
       ford.topSpeed = 237.5f;

       Cars chevrolet = new Cars();
       chevrolet.manufacturer = "Chervrolet";
       chevrolet.name = "Camaro";
       chevrolet.color = "Yellow";
       chevrolet.year = 1992;
       chevrolet.topSpeed = 239.5f;

       ford.printInfo();
       System.out.println();
       chevrolet.printInfo();


    }
}