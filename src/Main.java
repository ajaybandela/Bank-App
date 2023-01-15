import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name,password,balance to create an account");

        // Create User
        String name=sc.next();
        String password=sc.next();
        double balance= sc.nextDouble();
        SBIuser user=new SBIuser(name,balance,password);

        // Add Amount
        String message=user.addMoney(100000);
        System.out.println(message);

        // withDraw Money

        System.out.println("Enter amount you want to withdraw");
        int amount= sc.nextInt();
        System.out.println("Enter Your password");
        String pass=sc.next();
        System.out.println(user.withdrawMoney(amount,pass));
        System.out.println(user.checkBalance());

        // rate of Interest
        System.out.println(user.calculateInterest(10));

        System.out.println("This is a change");
        System.out.println("This is a change");

    }
}