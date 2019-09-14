package observator;

public interface IObservable<T> {
    public void add(IObserver<T> observer);
    public void remove(IObserver<T> observer);
    public void notifyObservers();
}

