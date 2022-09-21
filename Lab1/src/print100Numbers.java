
public class print100Numbers {

	public static void main(String[] args) {
		Hello.print(100); 	


	}

}
class Hello{
static void print(int n) 
{ 
if(n > 0){ 
print(n - 1); 
System.out.print(n + " "); 
} 
return; 
} 
}