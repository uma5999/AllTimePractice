import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {

	public static void main(String[] args) {
		
		String str ="communication";
		HashMap<Character,Integer> myMap = new HashMap<>();
		
		for(int i=0;i <str.length();i++) {
			if(myMap.containsKey(str.charAt(i))) {
				int count = myMap.get(str.charAt(i));
				myMap.put(str.charAt(i), ++count);
			}else {
				myMap.put(str.charAt(i), 1);
			}
		}
		
				System.out.println(myMap);

	}

}
