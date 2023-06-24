package demo_package;

public class shirt {
	int a;
    String colour = "pink";
    String c2 = "This is dark is";
    public String c1 ="PINK";
    String c3="Elephant";

	public static void main(String[] args) {
		shirt s = new shirt();
		System.out.println(s.colour.charAt(2));
		System.out.println(s.colour.compareTo(s.c1));
		System.out.println(s.colour.compareToIgnoreCase(s.c1));
		System.out.println(s.c2+" "+s.colour);
		System.out.println(s.c2.concat(s.c1));
		System.out.println(s.colour.contentEquals("pink"));
		System.out.println(s.colour.equalsIgnoreCase(s.c1));
		System.out.println(s.colour.equals(s.c2));
		System.out.println(s.colour.contains("in"));
		
		System.out.println(s.colour.endsWith("ink"));
		
	System.out.println(s.colour.indexOf('n'));
	System.out.println(s.c2.indexOf("is"));	
	System.out.println(s.c1.isEmpty());
	System.out.println(s.c2.lastIndexOf("is"));
	System.out.println(s.c2.length());
	System.out.println(s.c2.replace('i', 'z'));
	String[] s2 = s.c2.split(" ");
	for(int i=0;i<s2.length;i++)
		System.out.println(s2[i]);
	
	System.out.println(s.colour.startsWith("pin"));
	System.out.println(s.c3.substring(2));
	System.out.println(s.c3.substring(2, 4));
	
	System.out.println(s.c3.toUpperCase());
	System.out.println(s.c2.toLowerCase());
	
	
		char[] ch = s.colour.toCharArray();
		for(int i=0;i<ch.length;i++)
			System.out.println(ch[i]);
		
	}

}
