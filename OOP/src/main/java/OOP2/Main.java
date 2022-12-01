package OOP2;

public class Main {
    public static void main(String[] args) {

        TV Xiaomi = new TV("Xiaomi","QLED 55","3840 x 2160p",2022,55,2 );
        TV Panasonic = new TV();
        Xiaomi.printBasicData();
        System.out.println();
        Panasonic.printBasicData();



    }
}
