package methodoverriding;

public class BankAccountService {

    int fromAccountAmt =1000;
    int toAccountAmt =0;
    String fromAccount = null;
    String toAccount= null;

    boolean login(String username,String password){
        return true;

    }



    public boolean transfer(String fromMobileNumber,String toMobileNumber,int amt){
        System.out.println("from super class BankAccountService");

        if (fromMobileNumber.equals("12345")){
            fromAccount = "111";
        }
        if (toMobileNumber.equals("45678")){
            toAccount= "222";

        }
        return this.bookTransfer(fromAccount,toAccount,amt);

    }
    public boolean bookTransfer(String fromAccount,String toAccount,int amt){
        toAccountAmt =toAccountAmt +amt;
        fromAccountAmt =fromAccountAmt -amt;
        return true;
    }
}
