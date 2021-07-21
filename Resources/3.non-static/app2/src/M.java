class M
{
	M(int i)
	{
		System.out.println("M(int)");
	}
	M(double i)
	{
		System.out.println("M(double)");
	}
	public static void main(String[]args)
	{
		M m1 = new M(10);
		System.out.println("-----");
		M m2 = new M(100.0);
		System.out.println("-----");
	}
}