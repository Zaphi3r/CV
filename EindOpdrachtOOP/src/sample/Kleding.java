package sample;

public class Kleding implements Goed {

    private String soort, kleur;
    private double prijs;

    public Kleding(String soort, String kleur, double prijs){
        this.soort = soort;
        this.kleur = kleur;
        this.prijs = prijs;
    }

    public String getSoort(){
        return soort;
    }

    public String getKleur(){
        return kleur;
    }

    public double getPrijs(){
        return prijs;
    }

    @Override
    public double huidigeWaarde() {
        return prijs;
    }

    @Override
    public String toString(){
        return getSoort() + "\nKleur: " + getKleur() + "\nPrijs: €" + huidigeWaarde()+ "\n\n";
    }

}
