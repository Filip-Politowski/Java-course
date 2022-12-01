package OOP2;


public class TV {
    String manufacturer;
    String model;
    String maxResolution = "3840 x 2160 p";
    int yearOfProduction;
    int inches;
    int id;

    public TV(){
        this.manufacturer = "unknown";
        this.model = "unknown";
        this. maxResolution = "unknown";
        this.inches = 0;
        this.id = 0;
        this.yearOfProduction = 0;
    }
    public TV(String manufacturer, String model, String maxResolution, int yearOfProduction, int inches, int id) {
        this.manufacturer = manufacturer;
        this.model = model;
        this. maxResolution = maxResolution;
        this.inches = inches;
        this.id = id;
        this.yearOfProduction = yearOfProduction;
    }


    public void printBasicData()
    {
        System.out.println("Producent: " + this.manufacturer +
                "\nModel: " + this.model +
                "\nRok produkcji: " + this.yearOfProduction +
                "\nIlość cali: " + this.inches +
                "\nRozdzielczość: " + this.maxResolution +
                "\nId: " + id);
    }
}
