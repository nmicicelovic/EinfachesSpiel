package model;
import view.GewinnView;
import java.util.Random;

public class GewinnModel {

    private int gesamtPunkte;
    private int spielerZahl;
    private int computerZahl;
    private int rundenErgebnis;

    public GewinnModel() {
        gesamtPunkte = 30;
        spielerZahl = 0;
        computerZahl = 0;
        rundenErgebnis = 0;
    }

    public int getGesamtPunkte() {
        return gesamtPunkte;
    }

    public int getComputerZahl() {
        return computerZahl;
    }

    public int getRundenErgebnis() {
        return rundenErgebnis;
    }

    public void berechneComputerZahl() {
        Random randomZahl;
        randomZahl= new Random();
        this.computerZahl = randomZahl.nextInt(9) + 1;
    }


    public void berechneRunde(int spielerZahl) {
        this.spielerZahl = spielerZahl;
        berechneComputerZahl();

        if(spielerZahl -  getComputerZahl()== 1 || spielerZahl - getComputerZahl() == -1 ){
            gesamtPunkte = gesamtPunkte + 5;
            rundenErgebnis = +5;
        }else if(spielerZahl - getComputerZahl() == 0) {
            gesamtPunkte = gesamtPunkte + 20;
            rundenErgebnis = +20;
        } else if(spielerZahl - getComputerZahl() > 1 || spielerZahl - getComputerZahl() < -1 ) {
            gesamtPunkte = gesamtPunkte -10 ;
            rundenErgebnis = -10;
        }

    }

    public boolean hatGewonnen(){
        if(gesamtPunkte >= 100){
            return true;
        }
        return false;
    }

    public boolean hatVerloren(){
        if(gesamtPunkte <= 0){
            return true;
        }
        return false;
    }
}
