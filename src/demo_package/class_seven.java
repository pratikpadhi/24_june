package demo_package;

public class class_seven implements interface_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(interface_one.a);
		//interface_one.a =78;
		class_seven obj = new class_seven();
		obj.slow();
	}

	@Override
	public void slow() {
		
		System.out.println("This isslow function");
		
	}

	@Override
	public void see() {
		
		System.out.println("This is see function");
	}

}
