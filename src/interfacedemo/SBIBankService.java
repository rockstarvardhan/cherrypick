package interfacedemo;

public class SBIBankService implements RBIBankService{
    @Override
    public String transfer(String fromAccountNumber, String toAccountNumber, int amt) {
        return "transfer from SBIBank";

    }
}
