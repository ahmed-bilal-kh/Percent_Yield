import java.util.Scanner;
public class percentYield 
{
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) 
	{
		double deposit;
		double percentage;
		double CDvalue;
		double maturityPeriod;
		int n=0;
		CDvalue = 0;
		double result;
		double sum;
		
		System.out.print("Enter initial deposit amount: ");
		deposit = keyboard.nextDouble();
		keyboard.nextLine();
		System.out.print("Enter annual percentage yield: ");
		percentage = keyboard.nextDouble();
		keyboard.nextLine();
		System.out.print("Enter maturity period (number of months): ");
		maturityPeriod = keyboard.nextInt();
		
		System.out.printf("%5s%15s\n","Month","CD value");
		
		CDvalue= deposit;
		sum = ((deposit/100) * (percentage/12));
		for(result = 0; result <= (maturityPeriod);) 
		{		  
			++result;
			CDvalue+=sum;
		
			System.out.printf("%3d%17.2f\n",n++,(CDvalue-sum));
		}
	}
}
