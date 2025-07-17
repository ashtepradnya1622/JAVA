package JAVA;

public class Print1_100withoutlppo {
	public static void main(String[] args) {
				PrintNumbers(1);
				}
public static void PrintNumbers(int num) {
		System.out.println(num);
		if(num<=100)
		PrintNumbers(num+1);
		
		
	}

}
