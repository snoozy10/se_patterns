package practice.se.patterns.structural.facade;

public class TemperatureChanger {
    private static final double MAX_TEMPERATURE = 100.0;
    public TemperatureChanger() {}
    private void heatCoil() {
        System.out.println("Subsystem at work: Heating internal coils...");
    }
    public void raiseTemperature(double currentTemperature) {
        if (currentTemperature < MAX_TEMPERATURE) {
            heatCoil();
            System.out.println("Temperature raised to = " + MAX_TEMPERATURE);
        }
        else {
            System.out.println("Temperature out of working-range");
        }
    }
}
