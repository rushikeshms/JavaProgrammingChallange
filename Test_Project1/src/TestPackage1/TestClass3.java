package TestPackage1;

import java.util.Scanner;

public class TestClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, count=0;
		System.out.println("Enter the number");
		Scanner sc= new Scanner(System.in);
		n= sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		System.out.println("The number is Prime number");
		
		else
		System.out.println("The number is not Prime number");
		
	}

}
