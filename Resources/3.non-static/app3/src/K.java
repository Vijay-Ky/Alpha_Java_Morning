class K
{
	K()
	{
		this(1000, 2000);
		System.out.println("K()");
	}
	{
		System.out.println("IIB1");
	}
	K(int j)
	{
		System.out.println("K(int)" + i);
	}
	static
	{	
		System.out.println("SIB1");
	}
	K(int i, int j)	
	{
		this(1000);
		System.out.println("K(int,int)" + "i, j: " + i + ", " + j);
		i = 10000;
		j = 20000;
		System.out.println("K(int,int)" + "i, j: " + i + ", " + j);
	}
	static
	{
		System.out.println("SIB2");
	}
	{
		System.out.println("IIB2");
	}
	public static void main(String[] args)
	{
		K k1 = new K();
		System.out.println("-----");
		K k2 = new K(100);
		System.out.println("-----");
		K k3 = new K(100,200);
		System.out.println("-----");
		K k4 = new K(400);
		System.out.println("-----");
	}
}