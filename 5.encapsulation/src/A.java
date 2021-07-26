class A
{
	private String name;
	private String idNum;
	private int age;

	public void setName(String myName)
	{
		this.name = myName;
	}

	public void setIdNum(String myIdNum)
	{
		this.idNum = myIdNum;
	}

	public void setAge(int myAge)
	{
		this.age = myAge;
	}

	public String getName()
	{
		return this.name;
	}

	public String getIdNum()
	{
		return this.idNum;
	}

	public int getAge()
	{
		return this.age;
	}
}
class MyDriver 
{
	public static void main(String[] arg)
	{
		A a1 = new A();
		System.out.println("My name: " + a1.getName());
		System.out.println("My Id : " + a1.getIdNum());
		System.out.println("My Age : " + a1.getAge());
		a1.setName("shalini");
		a1.setIdNum("1999");
		a1.setAge(43);
		System.out.println("My name: " + a1.getName());
		System.out.println("My Id : " + a1.getIdNum());
		System.out.println("My Age : " +  a1.getAge());
	}
}