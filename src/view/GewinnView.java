package view;
import javax.swing.*;
import java.awt.*;

public class GewinnView extends JFrame {
    private JLabel rundenErgebnisWertLabel;
    private JLabel gesamtPunkteWertLabel;
    private JTextField spielerEingabeFeld;
    private JTextField computerAnzeigeFeld;
    private JButton nocheinmalButton;

    public GewinnView() {

        setTitle("Zahlen-Gewinnspiel (v1.0)");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        JPanel mainPanel = new JPanel(new GridLayout(4, 2, 10, 10));

        JLabel rundenErgebnisTitelLabel = new JLabel("Rundenergebnis:", SwingConstants.CENTER);
        JLabel gesamtPunkteTitelLabel = new JLabel("Gesamtpunkte:", SwingConstants.CENTER);

        rundenErgebnisWertLabel = new JLabel("Tippe eine Zahl von 1 bis 9", SwingConstants.CENTER);
        rundenErgebnisWertLabel.setOpaque(true);
        rundenErgebnisWertLabel.setBackground(Color.WHITE);

        gesamtPunkteWertLabel = new JLabel("Gesamtpunkte: 30", SwingConstants.CENTER);
        gesamtPunkteWertLabel.setOpaque(true);
        gesamtPunkteWertLabel.setBackground(Color.WHITE);

        JLabel deineZahlLabel = new JLabel("Deine Zahl:", SwingConstants.CENTER);
        JLabel computerLabel = new JLabel("Computer:", SwingConstants.CENTER);

        spielerEingabeFeld = new JTextField();
        computerAnzeigeFeld = new JTextField();
        computerAnzeigeFeld.setBackground(Color.WHITE);
        computerAnzeigeFeld.setEditable(false);

        mainPanel.add(rundenErgebnisTitelLabel);
        mainPanel.add(gesamtPunkteTitelLabel);
        mainPanel.add(rundenErgebnisWertLabel);
        mainPanel.add(gesamtPunkteWertLabel);
        mainPanel.add(deineZahlLabel);
        mainPanel.add(computerLabel);
        mainPanel.add(spielerEingabeFeld);
        mainPanel.add(computerAnzeigeFeld);

        add(mainPanel, BorderLayout.CENTER);

        nocheinmalButton = new JButton("Noch einmal!");
        add(nocheinmalButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    public JLabel getRundenErgebnisWertLabel() { return rundenErgebnisWertLabel; }
    public JLabel getGesamtPunkteWertLabel() { return gesamtPunkteWertLabel; }
    public JTextField getSpielerEingabeFeld() { return spielerEingabeFeld; }
    public JTextField getComputerAnzeigeFeld() { return computerAnzeigeFeld; }
    public JButton getNocheinmalButton() { return nocheinmalButton; }
}