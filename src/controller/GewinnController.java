package controller;
import view.GewinnView;
import model.GewinnModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class GewinnController {

    private GewinnModel model;
    private GewinnView view;

    public GewinnController(GewinnModel model, GewinnView view) {
        this.model = model;
        this.view = view;

        view.getSpielerEingabeFeld().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verarbeiteEingabe();
            }
        });

        view.getNocheinmalButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nocheinaml();
            }
        });

    }

    private void nocheinaml() {
        view.getSpielerEingabeFeld().setText("");
        view.getComputerAnzeigeFeld();
        view.getRundenErgebnisWertLabel().setText("Tippe eine Zahl von bis 1 bis 9");
    }
    private void verarbeiteEingabe() {
        String text = view.getSpielerEingabeFeld().getText();
        try {
            int spielerZahl = Integer.parseInt(text);
            model.berechneRunde(spielerZahl);

            view.getComputerAnzeigeFeld().setText(String.valueOf(model.getComputerZahl()));

            int ergebnis = model.getRundenErgebnis();
            String ergebnisText;
            if (ergebnis == 0) {
                ergebnisText = "" + ergebnis;

            } else {
                ergebnisText = "" + ergebnis;
            }

            if (model.hatGewonnen()) {
                ergebnisText = "Gewonnen!";
            } else if (model.hatVerloren()) {
                ergebnisText = "Verloren";
            }

            view.getRundenErgebnisWertLabel().setText(ergebnisText);
            view.getGesamtPunkteWertLabel().setText("Gesamtpunkte: " + model.getGesamtPunkte());

        } catch (NumberFormatException ex) {
            view.getRundenErgebnisWertLabel().setText("Bitte gültige Zahl eingeben!");
        }
    }


}
