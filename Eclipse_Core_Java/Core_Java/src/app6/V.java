package app6;

class V
{
	public static void main(String[] args)
	{
		outer:
		for(int i = 0; i < 2; i++)
		{
			System.out.println("loop1 begin");
			inner:
			for(int j = 0; j < 5; j++)
			{
				System.out.println("loop2 begin");
				if(j > 2)
				{
					break outer;
					//continue outer;
				}
				System.out.println("loop2 end");
			}
			System.out.println("loop1 end");
		}
		System.out.println("main end");
	}
}