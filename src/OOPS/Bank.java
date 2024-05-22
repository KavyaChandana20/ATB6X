package OOPS;

public class Bank
{
    String bankName;
    int balance;
    String IFSC;

    Bank() //DefaultConstructor
    {
        bankName = "SBI";
        IFSC = "SBI001";
        balance= 0;
    }

    Bank(int balance, String bankCode,String bankName)
    {
        this.bankName = bankName;
        this.balance = balance;
        this.IFSC = bankCode;
    }

    Bank(String bankName, String bankCode)
    {
        this.bankName = bankName;
        this.IFSC = bankCode;
    }

    void printDetails() {
        System.out.println("Bank Name -> " + bankName);
        System.out.println("Bank Code -> " + IFSC);
        System.out.println("Bal -> " + balance);
    }
}
