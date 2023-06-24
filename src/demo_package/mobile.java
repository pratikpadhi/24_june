package demo_package;

public class mobile {
	
 final int ram =90; ;
 int rom=78 ;
 final static int network=67;

	
	public static void main(String[] args) {
		mobile mi =new mobile();
		mobile redmi =new mobile();
		mi.ram=89;
		mi.rom=54;
	}
	
	
	public void add(int a)
	{
		 System.out.println("This is static function");
	}

	public int add()
	{
		 System.out.println("This is static function");
		 return 12;
	}

	
}
