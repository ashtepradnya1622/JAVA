package JAVA;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
    int num=sc.nextInt();
    int sum=0;int r;
    int temp=num;
    while(num>0) {
    	r=num%10;
    	num=num/10;
    	sum=sum+r*r*r;
    }
    if(temp==sum) {
    	System.out.println("aramstrong");
    }
    else
    	System.out.println("not armstrong");

}

}






























//int num=sc.nextInt();
//int temp=num;
//int r;int sum=0;
//while(num>0) {
//	r=num%10;
//	num=num/10;
//	sum=sum+r*r*r;
//}
//if(temp==sum) {
//	System.out.println("aramstrong number");
//}
//else
//	System.out.println("not armstrong number");
