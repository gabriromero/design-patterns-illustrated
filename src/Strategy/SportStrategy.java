package Strategy;

public class SportStrategy implements DrivingModeStrategy{

    @Override
    public double carConsumption(int speed, int temperature) {
        if(speed < 50) return speed / 13.0 + Math.abs(temperature) / 20.0;
        return speed / 8.0 + Math.abs(temperature) / 10.0;
    }

}
