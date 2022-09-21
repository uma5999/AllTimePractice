import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesInString {

	public static void main(String[] args) {


		String str = "umamahesh";
		Set<Character> set = new HashSet<>();	
		for(char c: str.toCharArray()) {
			set.add(c);
		}
		System.out.println(set);

	}

}
