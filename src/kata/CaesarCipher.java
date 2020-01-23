
public class CaesarCipher {


	public static void main (String[] args) {
		
		
		
		System.out.println(crypto("zabcd", -2));
		
	
			
	}
	
	
	public static String crypto (String sentence, int key) {
		
		String alphabet= "abcdefghijklmnopqrstuvwxyz";
		String crypted = "";
		for (char letter : sentence.toCharArray()) {
			int index = Math.floorMod(alphabet.indexOf(letter) + key, 26);
			char result = alphabet.charAt(index);
			crypted += result;
		}
		return crypted;
		
		
	}
}
