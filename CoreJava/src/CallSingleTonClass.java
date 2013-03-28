import java.lang.reflect.Constructor;
import java.util.Arrays;


public class CallSingleTonClass {
public static void main(String[] args) throws Exception {
	SingletonClass sc = SingletonClass.getInstance();
		Class<SingletonClass> person = SingletonClass.class;
		Constructor<SingletonClass> conz = person.getDeclaredConstructor(null);
		conz.setAccessible(true);
		SingletonClass s2 = conz.newInstance(null);
		//System.out.println(Arrays.toString(person.getDeclaredMethods()));
}
}