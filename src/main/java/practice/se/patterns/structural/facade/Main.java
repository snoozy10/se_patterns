package practice.se.patterns.structural.facade;

public class Main {
    public static void main(String[] args) {
        WaterHeaterFacade waterHeaterFacade = new WaterHeaterFacade();
        waterHeaterFacade.heatWater();
    }
}
