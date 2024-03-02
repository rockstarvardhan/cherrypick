package rbi;

public class AxisBank extends RBIBank{


    int personAmount4=5000;
    int personAmount5=4000;
    int personAmount6=3000;
    int amountAdd=personAmount4+personAmount5+personAmount6;

    public AxisBank(int sbiBalance, int hdfcBalance, int personAmount4, int personAmount5) {
        super(sbiBalance, hdfcBalance);
        this.personAmount4 = personAmount4;
        this.personAmount5 = personAmount5;
    }

    public AxisBank(int sbiBalance, int hdfcBalance) {
        super(sbiBalance, hdfcBalance);

    }
}

