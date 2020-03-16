package classes_Interfaces;

public class Account {
	
	private String number;
	private double balance;
	private String custName;
	private String custPhoneNumber;
	private String custEmailAddress;
	
	public void deposit(int deposit) {
		this.balance = this.balance + deposit;
		
		System.out.println("Deposit of "+deposit+" made. Total balance is "+this.balance);
	}
	
	public void withdrawl(double withdrawlAmount){
		
		if(this.balance-withdrawlAmount <= 0) {
			System.out.println("The balance is "+this.balance+". Withdrawl cannot bw processed");
		}
		else{
			this.balance = this.balance - withdrawlAmount;
			System.out.println("Withdrwal of amount "+withdrawlAmount+" processed. Hence the remaining balance is "+this.balance);		
		}
	}
	
	public void setCustomerName(String Customer) {
		this.custName = Customer;
	}
	
	public String getCustomerName() {
		
		System.out.println("The name of the customer is "+ this.custName);
		return this.custName;
	}
	
	public void setCustomerPhoneNo(String custPhoneNumber) {
		this.custPhoneNumber = custPhoneNumber;
	}
	
	public String getCustomerPhoneNo() {
		System.out.println("The Phone Number of the customer is "+ this.custPhoneNumber);
		return this.custPhoneNumber;
	}
	
	public void setcustEmailAddress(String customerEmailAddress) {
		this.custEmailAddress = customerEmailAddress;
	}
	
	public String getcustEmailAddress() {
		System.out.println("The Email address of the customer is "+ this.custEmailAddress);
		return this.custEmailAddress;
	}
}
