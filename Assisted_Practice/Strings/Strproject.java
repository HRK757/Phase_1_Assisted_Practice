package str;

public class Strproject {
	public static void main(String[] args) {
		//methods of strings
		System.out.println("Methods of Strings");
		
		String sl=new String("Hello World");
		System.out.println("Length of string :"+sl.length());

		//substring
		String sub=new String("Welcome");
		System.out.println("Sub string in string : "+sub.substring(2));

		//String Comparison
		String s1="Hello";
		String s2="Heldo";
		System.out.println("Comparison  of two strings : "+s1.compareTo(s2));

		//IsEmpty
		String s4="";
		System.out.println("Is string Empty: "+s4.isEmpty());

		//toLowerCase
		String s5="HeLlo";
		System.out.println("Conversion to lower case:"+s1.toLowerCase());
		
		//toUpperCase
		String st="hello";
		System.out.println("Conversion to upper case:"+st.toUpperCase());
		
		//replace
		String s6="Heldo";
		String replace=s2.replace('d', 'l');
		System.out.println(replace);

		//equals
		String x="Welcome to Java";
		String y="WeLcOmE tO JaVa";
		System.out.println(x.equals(y));
 
		System.out.println("\n");
		System.out.println("Creating StringBuffer");
		//Creating StringBuffer and append method
		StringBuffer s=new StringBuffer("Welcome to Java!");
		s.append("Enjoy your learning");
		System.out.println(s);

		//insert method
		s.insert(0, 'w');
		System.out.println(s);

		//replace method
		StringBuffer sb=new StringBuffer("Hello");
		sb.replace(0, 2, "hEl");
		System.out.println(sb);

		//delete method
		sb.delete(0, 1);
		System.out.println(sb);
		
		//StringBuilder
		System.out.println("\n");
		System.out.println("Creating StringBuilder");
		StringBuilder sb1=new StringBuilder("Happy");
		sb1.append("Learning");
		System.out.println(sb1);

		System.out.println(sb1.delete(0, 1));

		System.out.println(sb1.insert(1, "Welcome"));

		System.out.println(sb1.reverse());
				
		//conversion	
		System.out.println("\n");
		System.out.println("Conversion of Strings to StringBuffer and StringBuilder");
		
		String str = "Hello"; 
        
        // conversion from String object to StringBuffer 
        StringBuffer sbr = new StringBuffer(str); 
        sbr.reverse(); 
        System.out.println("String to StringBuffer");
        System.out.println(sbr); 
          
        // conversion from String object to StringBuilder 
        StringBuilder sbl = new StringBuilder(str); 
        sbl.append("everyone"); 
        System.out.println("String to StringBuilder");
        System.out.println(sbl);              		
	}
}

