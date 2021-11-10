package Assignment_4_ExceptionHandling;

public class Main {

	public static void main(String[] args) {
		SavingsAccount b=new  SavingsAccount();
		b.deposit(500000);//1200 u must fill in the method then u can get result  
		try {
			b.withdraw(100);//200  if u pass negative value then u can get result okay  //-1
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("InsufficientBalanceException "+e);
		}
		


	}

}
