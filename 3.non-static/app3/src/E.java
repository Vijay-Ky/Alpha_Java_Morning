class Dog
{
	{
		System.out.println("Hello dog");
	}
	Dog(int i)
	{
		System.out.println("Dog(int)");
	}
	Dog()
	{
		System.out.println("Dog()");
	}
	public static void main(String[]args)
	{
		Dog e1 = new Dog(90);
		System.out.println("-----");
		Dog e2 = new Dog(30);
		System.out.println("-----");
	}
	{
		System.out.println("Good dog");
	}
}