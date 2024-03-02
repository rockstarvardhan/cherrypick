package swiggy.model;

import java.util.Date;

public class PaymentRequest {
    private String txId;
    private double amt;
    private Date txDate;

    private String merchantId;
    private boolean merchantDebit;

    public PaymentRequest(double amt, Date txDate) {
        this.amt = amt;
        this.txDate = txDate;
    }

    public PaymentRequest(String txId, double amt, Date txDate, String merchantId, boolean merchantDebit) {
        this.txId = txId;
        this.amt = amt;
        this.txDate = txDate;
        this.merchantId = merchantId;
        this.merchantDebit = merchantDebit;
    }

    public String getTxId() {
        return txId;
    }

    public double getAmt() {
        return amt;
    }

    public Date getTxDate() {
        return txDate;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public boolean isMerchantDebit() {
        return merchantDebit;
    }
}


