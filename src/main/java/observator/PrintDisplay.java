package observator;

public class PrintDisplay implements IObserver<WeatherStation>, IDisplay{

    @Override
    public void display(WeatherStation weatherStation) {
        System.out.println("Temperatura wynosi obecnie "+weatherStation.getTemperature()+" stopni.");
    }

    @Override
    public void update(Observable<WeatherStation> observable) {
        display(observable.getObservable());
    }
}
