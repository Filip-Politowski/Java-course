package OOP9;

public class Main {
    public static void main(String[] args) {

        Radio oldRadio = new Radio(1995);
        Radio newRadio = new Radio();
        newRadio.getRadio();
        oldRadio.changeStation("Muzo FM");
        newRadio.changeStation("oki chyba wszystko czaje ;)");
        newRadio.printRadioInfo(newRadio);
        oldRadio.printRadioInfo(oldRadio);

    }
}
