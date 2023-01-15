public interface BankInterface {

    double checkBalance();
    String withdrawMoney(int amount,String enterPassword);


    String addMoney(int amount);

    double calculateInterest(int years);

}
