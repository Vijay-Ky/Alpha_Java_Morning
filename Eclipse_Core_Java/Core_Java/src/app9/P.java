package app9;

public class P {

	public static void main(String[] args) {
		System.out.println("from main");
		if(true)
		{
			return;
		}
		test1();
		test2();
		System.out.println("-----------------");
		System.out.println(test2());
		return;
	}
	
	public static void test1()
	{
		System.out.println("from test1");
		return;
	}
	public static char test2()
	{
		System.out.println("from test2");
		return 'A';
	}

}
