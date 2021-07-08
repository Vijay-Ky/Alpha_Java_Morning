package app6;

class Q
{
	public static void main(String[] args)
	{
		for(int i = 0; i < 4; i++)
		{
			System.out.println("loop begin");
			if(i > 2)
			{
				continue;
			}
			System.out.println("loop end");
		}
		System.out.println("main end");
	}
}
/*
loop begin
loop end
loop begin
loop end
loop begin
loop end
loop begin
main end
*/
