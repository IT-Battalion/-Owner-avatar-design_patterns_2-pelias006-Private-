package observer;

/**
 * Simuliert einen Ablauf der am Observer-Pattern beteiligten Klassen
 *
 * @author Lisa Vittori
 */
public class Simulation {
    public static void main(String[] args) {
        Fruehwarnungen fws = new Fruehwarnungen();
        Benachrichtigung b1 = new Benachrichtigung("bbeispiel");
        Benachrichtigung b2 = new Benachrichtigung("mmuster");

        fws.attach(b1);
        fws.addFruehwarnung("bbeispiel", "D"); // eine Benachrichtigung sollte automatisch geschickt werden
        fws.addFruehwarnung("mmuster", "RK"); // keine Benachrichtigung

        fws.attach(b2);
        fws.addFruehwarnung("bbeispiel", "AM"); // eine Benachrichtigung sollte automatisch geschickt werden
        fws.addFruehwarnung("mmuster", "BSPK"); // eine Benachrichtigung sollte automatisch geschickt werden
        fws.deleteFruehwarnung("bbeispiel", "AM"); // eine Benachrichtigung sollte automatisch geschickt werden
        fws.deleteFruehwarnung("mmuster", "BSPK"); // eine Benachrichtigung sollte automatisch geschickt werden

        fws.detach(b1);
        fws.deleteFruehwarnung("bbeispiel", "D"); // keine Benachrichtigung
        fws.deleteFruehwarnung("mmuster", "RK"); // eine Benachrichtigung sollte automatisch geschickt werden

        fws.detach(b2);
        fws.addFruehwarnung("bbeispiel", "E"); // keine Benachrichtigung
        fws.addFruehwarnung("mmuster", "NW2"); // keine Benachrichtigung
    }
}
