import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class flatmap {

	public static void main(String[] args) {
		List<String> ls = new ArrayList<>();
		ls.add("hello");
		ls.add("hi");
		
		List<String> ls1 = new ArrayList<>();
		ls.add("uma");
		ls.add("mahesh");

		List<List<String>> l = new ArrayList<>();
		l.add(ls);
		l.add(ls1);
		
		
		l.stream().map(e -> e).collect(Collectors.toList());
		System.out.println(l);
	}

}
