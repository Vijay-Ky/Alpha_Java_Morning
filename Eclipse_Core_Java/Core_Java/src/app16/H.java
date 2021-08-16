package app16;

class G11 
{
	static void test()
	{
		System.out.println("test begin");
		int i = 10 / 0;
		System.out.println("test end");
	}
}
class H
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		G11.test();
		System.out.println("main end");
	}
}