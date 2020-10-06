package daus2;

public class JocDaus {

    Dau dau1;
    Dau dau2;
    Dau dau3;

    public JocDaus(){

        dau1 = new Dau();
        dau2= new Dau();
        dau3 = new Dau();

    }


    public boolean jugar() {
        dau1.tirar();
        dau2.tirar();
        dau3.tirar();
        System.out.println(" dau1 "+ dau1.getNum()+" dau2 "+ dau2.getNum()+" dau3 "+dau3.getNum());
        if ((dau1.getNum() == dau2.getNum()) && (dau2.getNum() == dau3.getNum()) && (dau1.getNum() == dau3.getNum())) return true;
        else {
            return false;
        }
    }

}
