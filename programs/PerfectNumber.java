// Perfect number

import java.util.Scanner;
class PerfectNumber 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=scn.nextInt();
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%2==0)
				sum=sum+i;
		}
		if(sum==n)
			System.out.println(n+" is a Perfect number");
		else
			System.out.println(n+" is not a perfect number");
	}
}

/*
int sum=1;
for(int i=2;i<=n;i++)
{
if(n%2==0);
sum=sum+i;
}
*/
