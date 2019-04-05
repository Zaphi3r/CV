package sample;

import javafx.scene.control.TextArea;

import java.util.ArrayList;

public class Winkelier {
    private String list = "Gekochte Product:\n";
    private boolean checker = false;


    static Bankrekening bkrn = new Bankrekening("Henk",20000);
    public static ArrayList<Goed> objects = new ArrayList<>();

    public double getBudget() {
        return bkrn.getBudget();
    }

    public void addToBudget(Double x)throws Exception{
            if(x < 0){
                throw new Exception("U mag alleen positieve getallen gebruiken!");
            }
            else {
                bkrn.storten(x);
                System.out.println(bkrn);
            }

    }

    public void reduceBudget(double x) throws Exception{
                if(x < 0) {
                    throw new Exception("U mag alleen positieve getallen gebruiken!");
                }
                else {
                    bkrn.opnemen(x);
                    System.out.println(bkrn);
                }

    }

    public void schafAan(Goed g){



           try {
               if (bkrn.getBudget() >= g.huidigeWaarde()) {
                   bkrn.opnemen(g.huidigeWaarde());
                   System.out.println(bkrn.getBudget());
                   checker = true;
               } else {


                   throw new Exception("Niet genoeg geld");
               }
           } catch(Exception e) {
               System.out.println(e);

        }
    }

    public void listLoop(TextArea textArea){
        textArea.appendText(list);
         for(Goed o : objects){


         textArea.appendText(o.toString());
        }
    }
    public boolean getChecker(){
        return checker;
    }
    public void setChecker(Boolean input){
        checker = input;
    }
}
