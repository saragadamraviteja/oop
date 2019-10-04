public class BankManager{
    int accountNumber;
    double balance;
    public BankManager(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}
public class CheckingAccount extends BankManager {
    double  limit;
    CheckingAccount(double limit) {
        this.limit = limit;
    }
}

public class SavingsAccount extends BankManager {
    public void show() {
        System.out.println("Delivered");
    }
}
public class COD extends BankManager {

}
public class One{
public static void main(String[] args) {
    SavingsAccount b = new SavingsAccount();
    b.show();
}
}
