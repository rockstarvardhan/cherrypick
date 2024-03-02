package rbi;

public class SbiBank extends RBIBank{
    int personAmount1=1000;
    int personAmount2=2000;
    int personAmount3=5000;
    int amountAdd=personAmount1+personAmount2+personAmount3;

    public SbiBank(int sbiBalance, int hdfcBalance, int personAmount1, int personAmount2, int personAmount3) {
        super(sbiBalance, hdfcBalance);
        this.personAmount1 = personAmount1;
        this.personAmount2 = personAmount2;
        this.personAmount3 = personAmount3;
    }

    @Override
    public String toString() {
        return "SbiBank{" +
                "personAmount1=" + personAmount1 +
                ", personAmount2=" + personAmount2 +
                ", personAmount3=" + personAmount3 +
                ", amountAdd=" + amountAdd +
                ", sbiBalance=" + sbiBalance +
                ", hdfcBalance=" + hdfcBalance +

                '}';
    }

    

    public SbiBank(int sbiBalance, int hdfcBalance) {
        super(sbiBalance, hdfcBalance);


    }
}



