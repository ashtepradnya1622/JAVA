package JAVA;

public class DuplicateCharacterofString {

public static void main(String[] args) {
String s="Pradnya";
int count=0;
System.out.println(s.toLowerCase());
char[]ch=s.toCharArray();
for(int i=0;i<s.length();i++) {
	for(int j=i+1;j<s.length();j++) {
		if (ch[i]==ch[j]) {
			System.out.println("Duplicate characters are="+ch[j]);
			count++;
		}
	}
}
System.out.println("number of duplicate charactrs are"+count);
	}

}
