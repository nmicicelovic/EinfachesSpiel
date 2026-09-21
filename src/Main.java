import model.GewinnModel;
import view.GewinnView;

public class Main {
    public static void main(String[] args) {
        GewinnModel model = new GewinnModel();

        model.berechneRunde(5);

        System.out.println("Computerzahl: " + model.getComputerZahl());
        System.out.println("Rundenergebnis: " + model.getRundenErgebnis());
        System.out.println("Gesamtpunkte: " + model.getGesamtPunkte());

        GewinnView view = new GewinnView();
    }
}