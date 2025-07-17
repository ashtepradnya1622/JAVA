package JAVA;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
    String s="stopu";
    String s2="post";
    if(s.length()!=s2.length()) {
    	System.out.println("length is not same they never be anagarm");
    }
    else {
    	System.out.println("length is same find the logic");
    	char[]c1=s.toCharArray();
    	char[]c2=s.toCharArray();
    	if(Arrays.equals(c1, c2)) {
    		System.out.println("they are anagram");
}
    	else {
    		System.out.println("they are not anagram");
    	}
    }
	}

}
