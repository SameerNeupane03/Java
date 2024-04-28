interface BankAccount{
    double deposit(double amount);
    double withdraw(double amount);
    void showAccountBalance();
}

class SavingsAccount implements BankAccount{
    private double amount;
    private float interestAmount;
    private static float interestRate = 4.75f;     //interest rate will apply same for all saving accounts so it is static

    public double deposit(double amount){
      this.amount = this.amount + amount;
      return this.amount;
    }

    public double withdraw(double amount){
        if(this.amount < amount){                 //to check whether you have sufficient funds in your account or not
            System.out.println("Insufficient balance");
            return 0;
        }else{
        this.amount = this.amount - amount;
        return this.amount;
        }
    }

    public float interestAmount(){
      this.amount = (float) (this.amount + (this.amount * 4.75) /100);
      return (float) this.amount;
    }

    public void showAccountBalance(){
        interestAmount();
        System.out.println("Your account balance is " + this.amount);
    }
}

class CurrentAccount implements BankAccount{
  private double amount;
  private static float accountHandlingFees = 0.75f;  //interest rate will apply same for all saving accounts so it is static

   public double deposit(double amount){
      this.amount = this.amount + amount;
      return this.amount;
    }

    public double withdraw(double amount){
        if(this.amount < amount){
            System.out.println("Insufficient balance");
            return 0;
        }else{
        this.amount = this.amount - amount;
        return this.amount;
        }
    }

    public float handlingFees(){
        this.amount = (float) (this.amount - (this.amount * accountHandlingFees) / 100);
        return (float) this.amount;
    }

    public void showAccountBalance(){
        handlingFees();
        System.out.println("Your current account balance is " + this.amount);
    }
}


public class Interface {
    public static void main(String[] args){
    BankAccount acc = new SavingsAccount();    //storing the SavingsAccount object address in an interface BankingAccount
    acc.deposit(10800);
    acc.withdraw(5800);
    acc.showAccountBalance();   
    
    System.out.println("\n\n");

    BankAccount currentAcc = new CurrentAccount();  //storing the SavingsAccount object address in an interface BankingAccount
    currentAcc.deposit(2000);
    currentAcc.showAccountBalance();                     
    currentAcc.withdraw(2990);
    }
    
}
