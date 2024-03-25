package practice.se.patterns.structural.facade;

import java.util.Random;

public class TemperatureSensor {
    private boolean isOn;
    public TemperatureSensor() {
        this.isOn = false;
    }
    private void turnOn() {
        if(!isOn) {
            this.isOn = true;
        }
    }
    private void turnOff() {
        if(isOn) {
            this.isOn = false;
        }
    }
    private double senseTemperature() {
        System.out.println("Subsystem at work: Sensing temperature...");
        //rangeMin + (rangeMax - rangeMin) * random.nextDouble();
        return 0.5 + (100 - 0.5) * (new Random()).nextDouble();
    }
    public double getTemperature() {
        this.turnOn();
        double sensedTemperature = senseTemperature();
        System.out.println("Sensed temperature = " + sensedTemperature);
        this.turnOff();
        return sensedTemperature;
    }
}
