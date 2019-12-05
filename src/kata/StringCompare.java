

public class StringCompare {
	
	public static int countChar (String str1, String str2){
		int count=0;
		if(str1 == null || str2 == null || str1.length() != str2.length())
			return -1;
		

		for (int i=0; i<str1.length(); i++) 
				if (str1.charAt(i) == str2.charAt(i)) 
					count++;
		
		return count;
	
	}
}
