class MethodDemo 
{
	public static void main(String[] args) // calling method
	{
		System.out.println("Main method Start");
		print();//calling statement
		System.out.println("------------------");
		display();//calling statement
		System.out.println("Main method ends");
	}

	static void print() //called method
	{
		System.out.println("Welcome to java world");
		System.out.println("JSPIDER");
		System.out.println("BTM");
	}

	static void display()//called method
	{
		System.out.println("Welcome to testing world");
		System.out.println("QSPIDER");
		System.out.println("BTM");
	}
}
