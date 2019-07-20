package array;

import java.util.Scanner;

public class ArrayFact {
	int n;	
	private int[] elements = new int[10];
	private int[] factorials = new int[10];
	Scanner scan = new Scanner(System.in);	
	
	public void input()
	{
		System.out.println("Enter a limit--->");
		n=scan.nextInt();		
	}
	
	public void result()
	{
		int result=1;
		for(int i=1; i<=n; ++i)
	  {
			result =result*i;
	  }
		System.out.println("the factorial value is"+result);
	}
}
 