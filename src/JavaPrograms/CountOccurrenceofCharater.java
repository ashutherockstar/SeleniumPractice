package JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrenceofCharater {
	public static void getCharcount(String s) {
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		char strArray[] = s.toCharArray();

		for (char ch : strArray) {
			if (!String.valueOf(ch).isBlank()) {
				if (charMap.containsKey(ch)) {
					charMap.put(ch, charMap.get(ch) + 1);
				} else {
					charMap.put(ch, 1);
				}

			}  
		}
		System.out.println(s + ":" + charMap);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getCharcount("Ashutosh Raanjan");
	}

}
