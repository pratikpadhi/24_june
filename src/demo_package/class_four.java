package demo_package;

public class class_four extends class_five  {
	
	 int a=76;
	 public int s=90;
	 private int g=78;
	 protected int y=89;
	public void add (int a)
	{
		System.out.println("The value of argument a is "+a);
		System.out.println("The value of data varibale a of child/same class "+this.a);
		System.out.println("The value of data varibale a of parent class "+super.a);
	}
	
	public void mul ()
	{
		System.out.println("this is the mul method of child class");
	}

	public static void main(String[] args) {
		class_four obj =new class_four(); 
		obj.add(23);
		
		

	}

	
}
