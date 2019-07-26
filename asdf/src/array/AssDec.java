package array;

import java.util.Scanner;

public class AssDec {
	private int[] in = new int[5];
	private int[] ass = new int[5];
	private int[] dec = new int[5];
	
	public void input()
	{
		Scanner scan = new Scanner(System.in);
		for(int i =0; i<5; i++)
		{
			System.out.println("Enter a numbers");
			in[i]=scan.nextInt();
			ass[i]=in[i];
			dec[i]=in[i];
		}
	}
	public void assen()
	{
		System.out.println("Acending order is");
		System.out.println("=================");
		for(int i=0; i<5; i++)
		{
			for(int j=i+1; j<5; j++)
			{
				if(ass[i]>ass[j])
				{
					int temp = ass[i];
					ass[i]=ass[j];
					ass[j]=temp;
				}
			}
		}
		
		for(int i =0; i<5; i++)
		{
			System.out.println(ass[i]+",");
		}
	}
	public void dec()
	{
		System.out.println("dcending order is");
		System.out.println("=================");
		for(int i=0; i<5; i++)
		{
			for(int j=i+1; j<5; j++)
			{
				if(dec[i]<dec[j])
				{
					int temp = dec[i];
					dec[i]=dec[j];
					dec[j]=temp;
				}
			}
		}
		
		for(int i =0; i<5; i++)
		{
			System.out.print(dec[i]+",");
		}
	}

}
