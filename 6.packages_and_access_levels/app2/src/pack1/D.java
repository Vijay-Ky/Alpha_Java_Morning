package pack1;
class D 
{
	private void test()
	{
		System.out.println("from test()");
	}

	public void test2()
	{
		D d1 = new D();
		d1.test();
	}
}
class E
{
	public static void main(String[] args) 
	{
		D d1 = new D();
		d1.test2();
		System.out.println("done");
	}
}
