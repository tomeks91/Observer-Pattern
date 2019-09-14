package observator;

public class PrettyPrintDisplay implements IObserver<WeatherStation>, IDisplay{

    @Override
    public void update(WeatherStation observable) {
        display(observable);
    }

    @Override
    public void display(WeatherStation weatherStation) {
        System.out.println("Temperature is now "+weatherStation.getTemperature());
    }
}
