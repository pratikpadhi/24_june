package demo_package;

public class class_five {
	
	int a =10;
	int b=8;
	
	public static void add()
	{
		 class_six obj = new class_six();
			
			System.out.println(obj.a);
			System.out.println(obj.s);
			System.out.println(obj.g);
			System.out.println(obj.y);
		
		System.out.println("this is the add method of the parent class");
	}
	
	public void sub()
	{
		
		System.out.println("This is substract method");
	}

}
