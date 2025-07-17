package JAVA;

public class Fibonaciesseries {

	public static void main(String[] args) {
int first=0;int second=1;
int num = 10;
for(int i=0;i<=num;i++) {
	int third=second+first;
	first=second;
	second=third;
	System.out.println(first);
}


	}

}
