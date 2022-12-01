package OOP7;

class RectangleOverLoading {
    float side1, side2;

   public RectangleOverLoading() {
        this(10.0f);
    }

    public RectangleOverLoading(float v) {
        side1 = side2 = v;
    }

    public RectangleOverLoading(float side1, float side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

}
