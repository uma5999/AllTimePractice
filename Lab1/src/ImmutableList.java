import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImmutableList {

	public static void main(String[] args) {

		
		String str = "uma mahesh naidu golakaramrao";
		String stra[] = str.split(" ");
		List<String> myl = Arrays.asList(stra);
		Map<Integer,String> myMap = new HashMap<>();
		
		int count = 0;
		for(String s: myl) {
			myMap.put(s.length(), s);
		}
		System.out.println(myMap);
		
		System.out.println(myMap.get(12));
		
	
	}

}
