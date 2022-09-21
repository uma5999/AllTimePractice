
@FunctionalInterface
public interface MyInterface {

	public abstract void method10();
	
	default void defaultMethod() {
        System.out.println("default method");
    }
	static void m2() {
		System.out.println("static method");
	}
}
