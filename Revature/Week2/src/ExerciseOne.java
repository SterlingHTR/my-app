public class ExerciseOne {

	public static void main(String[] args) {
		first10();
		getAlphabetArray();
	}
	
	public static void first10() {
		int x = 1;
		
		do {
			System.out.println(x);
			x++;
		} while (x <= 9);
	}
	
	public static void getAlphabetArray() {
		
		char[] alphabet =  new char[26];
		
		char filler = 'a';
		int place = 0;
		
		do {
			alphabet[place] = filler;
			filler++;
			place++;
		}
		while (place < 26);
		
		for(int i = 0; i < 26; i++) {
			System.out.print(alphabet[i]);
		}
		
		System.out.println("Trial");
		
		
        int a = 5;
        int b = 2;
        int c;
        int d;
        c = ++b; // LINE A
        d = a++; // LINE B
        c++; // LINE C
        System.out.println("a = " + a + " b = " + b + " c = " + c + " d = " + d);
		
	}
}
