package demo_package_two;

import demo_package.class_six;

public class class_eight extends  class_six{

	public static void main(String[] args) {
		 class_six obj = new class_six();
		 class_eight obj2 =new class_eight();
			System.out.println(obj.a);
			System.out.println(obj.s);
			System.out.println(obj.g);
			System.out.println(obj2.y);

	}

}

// public : can be accessed everywhere in the project irrespective of package and class
// private : can be accessed in its own class only
// protected : can be accessed in its own package but to access it outside the package need to inerit the class containing the 
              //data member
// default : can be accessed inside the package where the class is present.