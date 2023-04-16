public class MainAccount {
        
    // the main Account has 2 field
    public int Balance;
    public int transactionLimit ; 
    
    // the Main Account class has one constructor
    public MainAccount(int Deposit) {
        Balance = Deposit;
    }
        
    // the Account has 2 Methods
    public void Credit(int value) {
        Balance += newValue;
    }
        
    public void Debit(int value) {
        Balance -= value;
    }
        

        
}

public class ChildAccount extends MainAccount {
        
    // the Child Account's transaction limit
    public int transactionLimit;

    //creating the Child Account with Limit
    public childAccount(int borrow, int limit ) {
        super(borrow);
        transactionLimit = limit ;
    }  
    
    public static void main(String[] args){
             System.out.println(" transfer Money by creating Child Accounts ");


    } 
        
      
}