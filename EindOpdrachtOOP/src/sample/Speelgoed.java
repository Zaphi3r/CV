package sample;

public class Speelgoed extends Product {

    private int minimumLeeftijd;

    public Speelgoed(String type, double nieuwprijs, int bouwjaar, int minimumLeeftijd){
        super(type,nieuwprijs,bouwjaar);
        this.minimumLeeftijd = minimumLeeftijd;

    }

    public int getMinimumLeeftijd(){
        return minimumLeeftijd;
    }

    public double huidigeWaarde() {
        if (getBouwjaar() == getDitJaar())
            return getNieuwprijs();
        if (getBouwjaar() == getVorigJaar())
            return getNieuwprijs() * 0.95;
        if (getBouwjaar() == getVorigJaar() - 1)
            return getNieuwprijs() * 0.9;
        if (getBouwjaar() == getVorigJaar() - 2)
            return getNieuwprijs() * 0.85;
        if (getBouwjaar() == getVorigJaar() - 3)
            return getNieuwprijs() * 0.80;
        if (getBouwjaar() == getVorigJaar() - 4)
            return getNieuwprijs() * 0.75;
        if (getBouwjaar() == getVorigJaar() - 5)
            return getNieuwprijs() * 0.7;
        if (getBouwjaar() == getVorigJaar() - 6)
            return getNieuwprijs() * 0.65;
        if (getBouwjaar() == getVorigJaar() - 7)
            return getNieuwprijs() * 0.60;
        if (getBouwjaar() == getVorigJaar() - 8)
            return getNieuwprijs() * 0.55;
        if (getBouwjaar() == getVorigJaar() - 9)
            return getNieuwprijs() * 0.50;
        if (getBouwjaar() == getVorigJaar() - 10)
            return getNieuwprijs() * 0.45;

        else return getNieuwprijs();
    }

    @Override
    public String toString(){
        return getType() + "\nBouwjaar: " + getBouwjaar() + "\nMinimum leeftijd: " + getMinimumLeeftijd() + "\nPrijs: €" + huidigeWaarde() + "\n\n";
    }

}
