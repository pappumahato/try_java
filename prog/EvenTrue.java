class EvenTrue 
{
	boolean isEven(int n)
	{
		if(n%2==0)
			return true;
		else
			return false;
	}

	void display(boolean x,int y)
	{
		if(x==true)
			System.out.println(y+" is Even Number");
		else
			System.out.println(y+" is Odd Number");
	}


	public static void main(String[] args) 
	{
		EvenTrue e = new EvenTrue();
		int n1=34;
		boolean a = e.isEven(n1);
		e.display(a,n1);

		int n2=75;
		boolean b = e.isEven(n2);
		e.display(b,n2);

		int n3=82;
		boolean c = e.isEven(n3);
		e.display(c,n3);

		int n4=67;
		boolean d = e.isEven(n4);
		e.display(d,n4);
	}
}
