package JAVA;

public class Swappingnumbers {

	public static void main(String[] args) {
		int a=12;int b=78;
		//using third variablr
//    int x=10;int y=20;
//    int temp=x;
//    x=y;
//    y=temp;
//    System.out.println(x);
//    System.out.println(y);
    //without using third variable
     a=a+b;
     b=a-b;
     a=a-b;
    
    System.out.println(a);
    System.out.println(b);

    

    

	}

}
