package interfacelatestdemo;

public class SBILoginTest {
    public static void main(String [] args) {
        BankLoginService loginService = new SBIBankLoginProcess(null);
        boolean loginStatus = loginService.login("1144411","1234");
        if(loginStatus) {
            System.out.println("login successfull");
        } else {
            System.out.println("login failed");


        }

    }

    }
