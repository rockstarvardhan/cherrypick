package interfacedemo;

public class InterfaceDemoTest {
    public static void main(String[] args){
        RBIBankService hdfcBankService = new HDFCBankService();
        RBIBankService sbiBankService = new SBIBankService();
       String hdfcStatus = hdfcBankService.transfer("123","333",10);
        String sbiStatus = sbiBankService.transfer("222","444",20);
        System.out.println(hdfcStatus);
        System.out.println(sbiStatus);


    }
}
