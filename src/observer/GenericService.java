package observer;

import java.util.ArrayList;
import java.util.List;

public class GenericService implements Service {
    private final List<Observer> observers;

    public GenericService() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers(String gegenstand, StatusInformation stat) {
    }

    public List<Observer> getObservers() {
        return observers;
    }
}
