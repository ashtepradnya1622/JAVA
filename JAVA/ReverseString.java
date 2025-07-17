package JAVA;

public class ReverseString {

	public static void main(String[] args) {
//String s="Pradnya";
//String rev="";
//for(int i=s.length()-1;i>=0;i--) {
//	rev=rev+s.charAt(i);
//	
//}
//System.out.println(rev);
		//method2 using builtin function
		StringBuilder s=new StringBuilder("Pradnya");
		s.reverse();
		System.out.println(s);
	}

}
