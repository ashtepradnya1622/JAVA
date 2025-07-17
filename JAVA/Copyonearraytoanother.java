package JAVA;

import java.util.Arrays;

public class Copyonearraytoanother {
public static void main(String[] args) {
		int[] rollno=new int[]{10,20,30,40};
		int[]rollno1=new int[4];
		for(int i=0;i<rollno1.length;i++) {
			rollno1[i]=rollno[i];
		}
		System.out.println("Input Arrays"+Arrays.toString(rollno));
		System.out.println("OutputArrays"+Arrays.toString(rollno1));

		
		
		


	}

}































//int rollno[]=new int[] {10,20,30,40};
//int rollno1[]=new int[4];
//for(int i=0;i<rollno1.length;i++)
//{
//rollno1[i]=rollno[i];
//}
//System.out.println("input ARray->"+Arrays.toString(rollno));
//System.out.println("Output ARray->"+Arrays.toString(rollno1));
