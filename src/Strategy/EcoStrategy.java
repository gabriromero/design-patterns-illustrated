package Strategy;

public class EcoStrategy implements DrivingModeStrategy {

    @Override
    public double carConsumption(int speed, int temperature) {
        if(speed < 50) return speed / 16.0 + Math.abs(temperature) / 30.0;
        return speed / 12.0 + Math.abs(temperature) / 20.0;
    }

}
