package daus2;

import java.util.Random;

public class Dau {
    private int num;
    Random rand = new Random();

    public int getNum() {
        return this.num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int tirar() {

        this.num = rand.nextInt(6)+1;

        return this.num;
    }

    @Override
    public String toString() {
        return "Dau{" +
                "num=" + num +
                '}';
    }
}


