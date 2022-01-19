package observer;

/**
 * This Interface is used to define which method a casual
 * Service should have.
 * @author Patrick Elias
 * @version 19.01.2022
 */
public interface Service {
    /**
     * Attaches a Observer to the current observers.
     * @param observer The Observer which should be attached.
     */
    void attach(Observer observer);

    /**
     * Detaches a Observer from the current observers.
     * @param observer The Observer which should be detached.
     */
    void detach(Observer observer);

    /**
     * Notifies all observers about changed informations.
     */
    void notifyObservers(String gegenstand, StatusInformation stat);
}
