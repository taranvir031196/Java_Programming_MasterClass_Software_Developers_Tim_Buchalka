package classes_Interfaces;

public class Main extends Account{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account();
		
		System.out.println("-------------Summary of the Transaction of the Customer is---------------");
		acc.deposit(1000);
		acc.withdrawl(50);
		
		acc.setCustomerName("Taranvir Singh Saini");
		acc.getCustomerName();
		
		acc.setCustomerPhoneNo("7986189262");
		acc.getCustomerPhoneNo();
		
		acc.setcustEmailAddress("taranvir.554@gmail.com");
		acc.getcustEmailAddress();
		
		System.out.println("-------------Summary of the Transaction of the Customer is---------------");
		Account acc1 = new Account("12348747234824", "Taranvir", 89089458);
		
	}

}
