package observator;

public interface IObserver<T> {
    void update(T observable);
}
