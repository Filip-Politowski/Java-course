package OOP9;

public class Radio {

    int yearProduction;
    int volume;
    String station = "unknown"; // aktualna stacja radiowa

    Radio() {
        this.yearProduction = 2000;
        volume = 100;
    }

    Radio(int yearProduction) {
        this(); // wywołanie konstruktora bezargumentowego
        this.yearProduction = yearProduction;
        this.changeStation("Rock");
    }

    public void changeStation(String newStation) {
        this.station = newStation;
    }

    public Radio getRadio() {
        return this;
    }

    public void printRadioInfo(Radio radio) {
        System.out.println("Radio production Year: " + radio.yearProduction +
                "\nStacja: " + this.station);
    }


}
