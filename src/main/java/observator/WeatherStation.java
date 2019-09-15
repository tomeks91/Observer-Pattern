package observator;

import lombok.Getter;

@Getter
public class WeatherStation extends Observable<WeatherStation> {
    private int temperature;

    public void setTemperature(int temperature){
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public WeatherStation getObservable() {
        return this;
    }
}
