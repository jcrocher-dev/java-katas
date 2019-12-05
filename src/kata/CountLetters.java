public class CountLetters {

	public static int countLetters(String sentence, char search) {
		if (sentence == null)
			return -1;
		int count =0;
		for (int i = 0; i < sentence.length(); i++) {
			if(sentence.charAt(i) == search)
				count++;
		}
		return count;
			
		
	}
		
			
}
