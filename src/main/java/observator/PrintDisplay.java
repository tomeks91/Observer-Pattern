package observator;

public class PrintDisplay implements IObserver<WeatherStation>, IDisplay{

    @Override
    public void update(WeatherStation observable) {
        display(observable);
    }

    @Override
    public void display(WeatherStation weatherStation) {
        System.out.println("Temperatura wynosi obecnie "+weatherStation.getTemperature()+" stopni.");
    }
}
