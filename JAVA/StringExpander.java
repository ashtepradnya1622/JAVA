package JAVA;

		//A Java program to generate the output "aabbbcccc" from the input "a2b3c4" can be implemented by iterating through the input string and repeating each character according to the subsequent digit. 
		public class StringExpander {

		    public static void main(String[] args) {
		        String input = "a2b3c4";
		        String output = expandString(input);
		        System.out.println(output); // Output: aabbbcccc
		    } 

		    public static String expandString(String input) {
		        StringBuilder result = new StringBuilder();
		        for (int i = 0; i < input.length(); i += 2) {
		            char character = input.charAt(i);
		            int count = Character.getNumericValue(input.charAt(i + 1));
		            for (int j = 0; j < count; j++) {
		                result.append(character);
		            }
		        }
		        return result.toString();
		    }
}
