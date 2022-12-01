package OOP1;

public class Cars {
    String color;
    String manufacturer;
    String  name;
    int year;
    float topSpeed;
    
    public void printInfo(){
        System.out.println("Produkcja: " + this.manufacturer + "\nModel: " + this.name + "\nKolor: " + this.color +"\nrocznik: "+ this.year +"\nMaksymalna prędkość: "+this.topSpeed);
    }
    
    
}
