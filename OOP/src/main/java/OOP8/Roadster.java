package OOP8;

public class Roadster {

    float topSpeed, acceleration, crazyTopSpeed, crazyAcceleration;
    boolean crazyMode;

    Roadster(float topSpeed, float acceleration) {
      this.crazyMode = false;
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
    }

    Roadster(float topSpeed, float acceleration, float crazyTopSpeed, float crazyAcceleration) {
        this.crazyMode = true;
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
        this.crazyTopSpeed = crazyTopSpeed;
        this.crazyAcceleration = crazyAcceleration;
    }

    public float getTopSpeed() {
        return this.topSpeed;
    }

    public float getTopSpeed(boolean crazyMode) {
        this.crazyMode = crazyMode;
        if (crazyMode == true) {
            return this.crazyTopSpeed;
        } else return this.topSpeed;
    }

    public float getAcceleration() {
        return this.acceleration;
    }

    public float getAcceleration(boolean crazyMode) {
        this.crazyMode = crazyMode;
        if (crazyMode == true) {
            return this.crazyAcceleration;
        } else return this.acceleration;
    }

}
