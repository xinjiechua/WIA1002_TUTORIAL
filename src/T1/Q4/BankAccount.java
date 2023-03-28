package T1.Q4;

public class BankAccount implements Account{
    private int balance;

    public BankAccount(int balance){
        this.balance = balance;
    }

    @Override
    public int deposit(int depositamt){
        return balance += depositamt;
    }

    @Override
    public boolean withdraw(int withdrawamt){
        if(withdrawamt <= balance){
            balance -= withdrawamt;
            return true;
        } else {
            return false;
        }
    }
}