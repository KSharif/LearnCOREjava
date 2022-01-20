public class Account {

    int accountNumber;
    String accountName;
    float accountAmount;


    void insertAccountDetails (int accN0, String accName , float accBalance){
        accountNumber= accN0;
        accountName= accName;
        accountAmount= accBalance;


    }


    void deposit (float accBalance){
        accountAmount= accountAmount+accBalance;
        System.out.println("your balance is \n"+ accountAmount);

    }

    void withdraw(float accBalance) {
        //  accountAmount= accountAmount-accBalance;
        //System.out.println("after withdraw ---> your balance:\n"+ accountAmount);

        if (accountAmount < accBalance) {
            System.out.println("Insufficient balance ");
        } else {
            accountAmount = accountAmount - accBalance;
        }

    }

        void checkBalance(){

                System.out.println("Check balance --> your balance:\n"+ accountAmount);

        }

        void accountInformation(){
        System.out.println("Account number\n "+ accountNumber);
        System.out.println("Account name\n"+ accountName);
        System.out.println("Account balance\n"+ accountAmount);
        }





    }// classs

