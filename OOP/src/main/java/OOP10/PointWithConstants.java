package OOP10;

public class PointWithConstants {
    int x, y;
    final int width = 12;
    final int height;

    PointWithConstants() {
        height = 20;
    }

    PointWithConstants(int posX, int posY) {
        this();
        x = posX;
        y = posY;
    }

    public void changePosition(final int newX ,final int newY){
        x = newX;
        y = newY;
    }


}
