public class Main {
    
    public static void main(String[] args) {
        
        BankAccount myAccount = new BankAccount("Dakota", 1300);

        System.out.println(myAccount.getOwner());

        System.out.println(myAccount.getBalance());

        myAccount.withdraw(50);
        System.out.println(myAccount.getBalance());
        
        myAccount.deposit(500);
        System.out.println(myAccount.getBalance());
    }
}
