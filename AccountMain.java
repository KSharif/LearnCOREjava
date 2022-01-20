public class AccountMain {

    public static void main(String[] args) {

    Account account1 = new Account();
    account1.insertAccountDetails(11,"kazi", 200);
    account1.accountInformation();

    account1.deposit(1000);
    account1.withdraw(500);
    //account1.accountInformation();
    account1.checkBalance();

    account1.withdraw(5000000);
    account1.checkBalance();


    }
}
