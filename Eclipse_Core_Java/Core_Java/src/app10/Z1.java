package app10;

class Z1
{
     static int i = test1();
     static String j = test2();
     static boolean k = test3();
     
     static int test1()
     {
		System.out.println("from test1");
		return 10;
     }
     static String test2()
     {
		System.out.println("from test2");
		return "abc";
     }
     static boolean test3()
     {
		System.out.println("from test3");
		return false;
     }
     public static void main(String[]args)
     {
		System.out.println("main begin");
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println("main end");
     }
}
