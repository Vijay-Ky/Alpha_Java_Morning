package app6;

class W
{
	public static void main(String[] args)
	{
		
		for(int i = 0; i < 2; i++)
		{
			System.out.println("outer loop begin:i value: " + i);
			for(int j = 0; j < 5; j++)
			{
				System.out.println("inner loop begin:j value: " + j);
				if(j > 2)
				{
					break;
				}
				System.out.println("inner loop end:j value: " + j);
			}
			System.out.println("outer loop end:i value: " + i);
		}
		System.out.println("main end");
	}
}