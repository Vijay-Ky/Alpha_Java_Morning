package app2;

class G 
{
	public static void main(String[] args) 
	{
		int i;
		int j = 10 + (i = 4) + (i = 2);
		System.out.println(i);
		System.out.println(j);
	}
}
