class BankAccount{
    private double balance;
    private long accNo;
    BankAccount(double amt){
        this.balance=amt;}
    public void depositAmt(double amt){
	balance=balance+amt;
	System.out.println(balance);}
    public void withdrawAmt(double amt){
	if(balance-amt<0){
	    System.out.println("insufficient balance");}
	else{
	    balance=balance-amt;
            System.out.println(balance);}}}

public class TestP1{
    public static void main(String[] args){
	BankAccount acc1=new BankAccount(500);
	acc1.depositAmt(200);
	acc1.withdrawAmt(500);

}}
