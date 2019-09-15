package com.example.demo;

import observator.*;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Start {

    @EventListener(ApplicationReadyEvent.class)
    public  void runExample(){
        Observable<WeatherStation> weatherStation = new WeatherStation();
        IObserver<WeatherStation> printDisplay = new PrintDisplay();
        IObserver<WeatherStation> prettyPrintDisplay = new PrettyPrintDisplay();
        weatherStation.add(printDisplay);
        weatherStation.add(prettyPrintDisplay);
        weatherStation.notifyObservers();
        weatherStation.getObservable().setTemperature(14);

    }
}
