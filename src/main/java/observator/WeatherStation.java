package observator;

import lombok.Getter;

@Getter
public class WeatherStation extends Observable<WeatherStation> {
    private int temperature;

    public WeatherStation(){
        observable = this;
    }

    public void setTemperature(int temperature){
        this.temperature = temperature;
        notifyObservers();
    }
}
