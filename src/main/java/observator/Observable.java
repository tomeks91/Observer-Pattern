package observator;

import java.util.HashSet;
import java.util.Set;

public abstract class Observable<T> {
    T observable;

    private Set<IObserver<T>> observers = new HashSet<>();

    public void add(IObserver<T> observer) {
        observers.add(observer);
    }

    public void remove(IObserver<T> observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        observers.forEach(observer -> observer.update(observable));
    }

    public T getObservable() {
        return observable;
    }

}
