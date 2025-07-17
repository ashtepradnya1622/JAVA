package JAVA;

public class Reversewords {

public static void main(String[] args) {
String s="Automation QA Engineer";
String rev[]=s.split(" ");
for(int i=rev.length-1;i>=0;i--) {
	System.out.print(rev[i]+" ");
}
	}

}
