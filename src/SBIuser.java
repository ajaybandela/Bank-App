import java.util.Objects;
import java.util.UUID;

public class SBIuser implements BankInterface{
    private String name;
    private String accountNo;
    private double balance;
    private String password;
    private static double rateOfInterest;




    public SBIuser(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;


        // Bank is Intializing
        this.rateOfInterest=6.5;
        this.accountNo=String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static double getRateOfInterest() {
        return rateOfInterest;
    }

    public static void setRateOfInterest(double rateOfInterest) {
        SBIuser.rateOfInterest = rateOfInterest;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public String withdrawMoney(int amount,String enterPassword) {
        if(Objects.equals(password,enterPassword)){
            if(amount>balance){
                return "Sorry bro! Insufficient Funds";
            }else{
                balance=balance-amount;
                return "Your amount was SuccessFully dibited "+amount;
            }
        }else{
            return "Please enter correct Password";
        }
    }

    @Override
    public String addMoney(int amount) {
         balance=balance+amount;
         return "Your new balance is: "+balance;
    }

    @Override
    public double calculateInterest(int years) {
        return (balance*years*rateOfInterest)/100;
    }
}
