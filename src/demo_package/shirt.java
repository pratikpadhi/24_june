package demo_package;

public class shirt {
	int a;
    String colour = "pink";
    String c2 = "This is dark is";
    public String c1 ="PINK";
    String c3="Elephant";
static int mark =6765;
	public static void main(String[] args) {
	
		int[] b =new int[5];
		int[][] f=new int[3][2];
		char[] n=new char[6];
		String[] h=new String[45];
		
		b[0] =45;
		b[1] =67;
		b[2] = 23;
		b[3] = 26;
		b[4] = 39;
	
		
		for(int i=0;i<b.length;i++)
			System.out.println(b[i]);
		
		f[0][0] =11;
		f[0][1]=22;
		f[1][0]=33;
		f[1][1] =44;
		f[2][0] =55;
		f[2][1] =66;
		
		for(int j=0;j<3;j++)
		{
			for(int i=0;i<2;i++)
				System.out.print(f[j][i]+" ");
			
			//System.out.println("\n");
			
		}
		
		
		}
	
	

}
