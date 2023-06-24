package demo_package;

public class boy {
	
	private static boy instance = null;
	
	private boy()
	{
		System.out.println("I am boy class no argument constructor");
	}
	
	
	public static boy getinstance()
	{
		if(instance == null)
			instance = new boy();
		return instance;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boy b =new boy();
		boy b1 =new boy();
		System.out.println("I am inside main");


	}

}
