// WAP to count the number of digit in the number

import java.util.Scanner;
class CountDigit 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=scn.nextInt();
		int count=0;
		do{
			count++;
			n=n/10;
		}while(n!=0);
		System.out.println(count);
	}
}

//for(;n!=0;n=n/10)
