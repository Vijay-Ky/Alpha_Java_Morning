class V 
{
	//recursive constructor invocation
	V()
	{
		this();
		System.out.println("V()");
	}
}