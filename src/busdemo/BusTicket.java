package busdemo;

public class BusTicket {
    public String passenger;
    public int amount;
    public String seatSelection;

    @Override
    public String toString() {
        return "BusTicket{" +
                "passenger='" + passenger + '\'' +
                ", amount=" + amount +
                ", seatSelection='" + seatSelection + '\'' +
                '}';
    }

    public BusTicket(String passenger, int amount, String seatSelection) {
        this.passenger = passenger;
        this.amount = amount;
        this.seatSelection = seatSelection;


    }

    public String BusTicket(String passenger, int amount){
        return passenger+amount+passenger;
    }
}









