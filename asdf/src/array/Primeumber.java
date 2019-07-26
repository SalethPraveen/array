package array;

import java.util.Scanner;

public class Primeumber {
	
	private int[] prime = new int[5];
	//private int n;
	
	public void input()
	{
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<5;i++)
		{
		System.out.println("Enter a number");
		prime[i]=scan.nextInt();
		}
		scan.close();
	}
	
	public void find()
	{
		
		for(int p=0; p<5; p++)
		{
			int check = 0;
			for(int i =2; i<prime[p]; i++)
			{
				if(prime[p]%i==0)
				{
					check=1;
					break;
				}
			}
			if(check==0)
			{
				System.out.println(prime[p] +" is Prime");
				System.out.println("");
			}
			else
			{
				System.out.println(prime[p] + " is Not-Prime");
				}
			}
		
		}
	
	
	int start, end;
	private int[] prime1 = new int[6];
	public void newinput()
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a starting number");
		start = scan.nextInt();
		System.out.println("Enter a ending number");
		end = scan.nextInt();

	}

	public void check()
	{
		int s = 0;
		for(int p=start; p<end; p++)
		{
			int check = 0;
			for(int i =2; i<p; i++)
			{	
				if(p%i==0)
				{
					check=1;
					break;
				}	
				
			}
		
			if(check==0)
			{
				//System.out.println(p+" is Prime");
				//System.out.println(s);
				
				//System.out.println(p);
				s++;
				prime1[s]= p;
				System.out.println(prime1[s]);
				
			}	//System.out.println("check"+prime[s]);
			
			
		}
			
			/*for(int s1 = 0; s1<5; s1++)
			{
				System.out.println(prime[s1]);
			}*/		
	}
	
}
