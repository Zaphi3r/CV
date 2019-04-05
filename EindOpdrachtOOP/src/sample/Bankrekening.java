package sample;



public class Bankrekening {
    private String naam;
    private double budget;



    public Bankrekening(String nm, double bud){
        this.naam = nm;
        this.budget = bud;

    }

    public double getBudget(){
        return budget;
    }

    public void storten(Double x){
        budget += x;

    }

    public void opnemen(Double x){
        budget -= x;

    }


    @Override
    public String toString(){
        return "Naam is: " + naam + "\nBudget is: " + budget;
    }


}
