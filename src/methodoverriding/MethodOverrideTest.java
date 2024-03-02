package methodoverriding;

public class MethodOverrideTest {
    public static void main(String[] args){

        PhonePayService phonePayService = new PhonePayService();
        phonePayService.transfer("12345","45678",100);
        phonePayService.transfer("12345","45678",100);
        phonePayService.transfer("12345","45678",100);
        System.out.println("to account amount"+phonePayService.toAccountAmt);


        BankAccountService bankAccountService = new BankAccountService();
        bankAccountService.transfer("12345","45678",100);

        BankAccountService bankAccountServiceupcast = new PhonePayService();
        bankAccountServiceupcast.transfer("12345","45678",100);



    }

}
