package app12;

class R
{
	int i;
	static void test(R obj) 
	{
		obj.i = 20;
	}
	public static void main(String[] args)
	{
		R r1 = new R();
		r1.i = 10;
		System.out.println("A: " + r1.i);
		//call by reference
		//chages in the dest reflets to the source
		test(r1);
		System.out.println("B: " + r1.i);
	}
}