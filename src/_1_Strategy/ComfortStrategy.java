package _1_Strategy;

public class ComfortStrategy implements DrivingModeStrategy {
    @Override
    public double carConsumption(int speed, int temperature){
        return speed / 15.0 + Math.abs(temperature) / 25.0;
    }
}
