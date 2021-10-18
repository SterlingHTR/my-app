
public class vowelCounter {

	public static void main(String[] args) {
		
		String myWord = "supercallafraglisticexpialldoshus";	
		countVowels(myWord);
	}
	
	public static void countVowels(String word) {
		
		int count = 0;
		
		for(int i = 0; i < word.length(); i++) {
			switch (word.charAt(i)) {
				case 'a','e','i','o','u': {
					count++;
					break;
				}
				default:
					break;
				}
			}
		
	
		System.out.println(count);	
	}
}
