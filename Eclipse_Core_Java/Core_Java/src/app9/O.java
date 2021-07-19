package app9;

class O 
{
	public static void main(String[] args) 
	{
		test1();
		System.out.println(test2() + test2());
		System.out.println(test1());
	}
	static int test1()
	{
		System.out.println("from(test1())");
		return 10;
	}
	static int test2()
	{
		System.out.println("from test2");
		return 20;
	}
}
