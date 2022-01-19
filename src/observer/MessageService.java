package observer;

public class MessageService extends GenericService {
    @Override
    public void notifyObservers(String gegenstand, StatusInformation stat) {
        for (Observer observer :
                super.getObservers()) {
            observer.update(gegenstand, stat);
        }
    }
}
