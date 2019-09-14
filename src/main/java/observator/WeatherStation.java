package observator;

import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

@Getter
public class WeatherStation implements IObservable<WeatherStation> {
    private int temperature;

    private Set<IObserver> observers = new HashSet<>();

    @Override
    public void add(IObserver<WeatherStation> observer) {
        observers.add(observer);
    }

    @Override
    public void remove(IObserver<WeatherStation> observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(this));
    }

    public void setTemperature(int temperature){
        this.temperature = temperature;
        notifyObservers();
    }
}
