package Strategy;

public class Car {
    private DrivingModeStrategy drivingModeStrategy;

    public double carConsumption(int speed, int temperature){
        double consumption = drivingModeStrategy.carConsumption(speed,temperature);
        return  Math.round(consumption * 10.0) / 10.0;
    }

    public void changeDrivingMode(String drivingMode) {
        switch (drivingMode) {
            case "Eco":
                drivingModeStrategy = new EcoStrategy();
                break;
            case "Sport":
                drivingModeStrategy = new SportStrategy();
                break;
            default:
                drivingModeStrategy = new ComfortStrategy();
                break;
        }
    }
}
