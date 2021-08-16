package app16;

class A1
{
}
class A2 extends A
{
}
class A3 extends A2
{
}
class D extends C
{
}
class E extends D
{
}
class F
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		Object obj = new Object();
		E e1 = (E) obj;
		System.out.println("main end");
	}
}
