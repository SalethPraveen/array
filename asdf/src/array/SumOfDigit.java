package array;

import java.util.Scanner;

public class SumOfDigit {
	private int[] in = new int[5];
	int[] a = new int[5];
	int[] s = new int[5];
	int[] rem= new int[5];
	
	public void input()
	{
		Scanner scan = new Scanner(System.in);
		for(int i =0; i<5; i++)
		{
			System.out.println("Enter a numbers");
			in[i]=scan.nextInt();
			s[i]=in[i];
		}
	}

	public void check()
	{
		for(int i=0; i<5; i++)
		{
		while(in[i]>0)
		{
			rem[i] = in[i]%10;
			in[i]=in[i]/10;
			a[i]=a[i]+rem[i];
		}
		//System.out.println(a[i]);
		//System.out.println(s[i]);
		}
		for(int i =0; i<5; i++)
		{
		if(s[i]%a[i] ==0)

		{
		System.out.println(s[i]+ " is sum of digits are "+ a[i]+ " Its divitable");
		}
		else if (s[i]%a[i] !=0)
		{
		System.out.println(s[i]+ " is sum of digits are "+ a[i]+ " its not divitable");
		}
	}
}
}
