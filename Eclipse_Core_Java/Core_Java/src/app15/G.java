package app15;
public class G
{
	public static void main(String []args)
	{
		String []x = new String[4];
		for(int i = 0; i  < x.length; i++)
		{
			System.out.println(x[0]);
		}
		for(String s1 : x)
		{
			System.out.println(s1);
		}
	}
}
