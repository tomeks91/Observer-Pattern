package observator;

public interface IObserver<T> {
    void update(Observable<T> observable);
}
