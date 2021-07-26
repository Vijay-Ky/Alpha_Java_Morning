class D 
{
	static int count;
	int i;
	D()
	{
		count++;
		i++;
	}
	public static void main(String[] args) 
	{
		D obj1 = new D();
		System.out.println("a: " + count);
		System.out.println("a: " + obj1.i);
		D obj2 = new D();
		System.out.println("b: " + count);
		System.out.println("b: " + obj2.i);
		D obj3 = new D();
		System.out.println("c: " + count);
		System.out.println("c: " + obj3.i);
		D obj4 = new D();
		System.out.println("d: " + count);
		System.out.println("d: " + obj4.i);
		D obj5 = new D();
		System.out.println("e: " + count);
		System.out.println("e: " + obj5.i);

		System.out.println("---------------------------------------------");
		
		System.out.println("f: " + obj1.count);
		System.out.println("f: " + obj1.i);
		System.out.println("g: " + obj2.count);
		System.out.println("g: " + obj2.i);
		System.out.println("h: " + obj3.count);
		System.out.println("h: " + obj3.i);
		System.out.println("i: " + obj4.count);
		System.out.println("i: " + obj4.i);
		System.out.println("j: " + obj5.count);
		System.out.println("j: " + obj5.i);
	}
}
