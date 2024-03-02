package interfacelatestdemo;

public class SBIBankLoginProcess  implements BankLoginService {

    SBIBankLoginService sbiBankLoginService;

    public SBIBankLoginProcess() {
        this.sbiBankLoginService = new SBIBankLoginService();
    }

    public SBIBankLoginProcess(SBIBankLoginService sbiBankLoginService) {
        this.sbiBankLoginService = new SBIBankLoginService();
    }


    @Override
    public boolean login(String username, String password) {
        String otp = sbiBankLoginService.generateOTP(username);

        boolean validOtp = sbiBankLoginService.validationOTP(otp);
        if (validOtp) {
            System.out.println("valid otp & login is successful");
        } else {
            System.out.println("inavlid otp & login failed");
        }
        return validOtp;
    }
}







