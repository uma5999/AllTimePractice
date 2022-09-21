import java.util.HashMap;

public class MissingNumbersInArray {

	public static void main(String[] args) {
	
		
		
		int[] arr = {3, 1, 2, 2, 7, 7, 5, 5, 9, 9, 5};
	     HashMap map = new HashMap<>();
	     
	     for(int i=0; i<arr.length;i++){
	         map.put(arr[i],arr[i]);
	     }
	     
	     for(int i=1;i<=arr.length;i++){
	        if(!map.containsKey(i)){
	            System.out.println(i);
	        }
	     }
	     
	}

}
