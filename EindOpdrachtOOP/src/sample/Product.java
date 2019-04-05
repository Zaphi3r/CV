package sample;

import java.time.LocalDate;

public abstract class Product implements Goed{

    private String type;
    private double nieuwprijs;
    private int bouwjaar;

    private int ditJaar = LocalDate.now().getYear();
    private int vorigJaar = LocalDate.now().getYear()-1;




    public Product(String tp, double pr, int jr){
        this.type = tp;
        this.nieuwprijs = pr;
        this.bouwjaar = jr;
    }
    public String getType(){
    return type;
    }
    public int getBouwjaar(){
        return bouwjaar;
    }

    public double getNieuwprijs(){
        return nieuwprijs;
    }

    public int getDitJaar(){
        return ditJaar;
    }


    public int getVorigJaar(){
        return vorigJaar;
    }
}
