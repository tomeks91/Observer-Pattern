package com.example.demo;

import observator.*;

public class ObserverApplication {

	public static void main(String[] args) {
		Observable<WeatherStation> observable = new WeatherStation();
		IObserver<WeatherStation> printDisplay = new PrintDisplay();
		IObserver<WeatherStation> prettyPrintDisplay = new PrettyPrintDisplay();
		observable.add(printDisplay);
		observable.add(prettyPrintDisplay);
		observable.getObservable().setTemperature(14);
	}

}
