package arrpro;

public class Arrproject {
	public static void main(String[] args) {
		int[] a=new int[7];
		a[0]=4;
		a[1]=45;
		a[2]=7;
		a[3]=1;
		a[4]=27;
		a[5]=8;
		a[6]=10;
		System.out.println("Array a");
		for(int i=0;i<=6;i++)
			System.out.println("Number at "+i+"="+a[i]);
		
		System.out.println("\nArray b");
		int b[]= {1,3,2,5,8,2,4};
		for(int i=0;i<b.length;i++)
			System.out.println("Number at "+i+"= "+b[i]);
		
		//Multi dimensional Array
		int[][] c = {{3,2},{8,5},{34,1}};
		System.out.println("\nMulti dimensional Array");
		for(int i=0;i<=2;i++)
			for(int j=0;j<=1;j++)
				System.out.println("Number at ["+i+"]["+j+"]="+c[i][j]);

	}

}
