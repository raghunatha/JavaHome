import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class SingletonClass {
	
	public static SingletonClass m_instance;
	
	public static void main(String[] args) {

		Map m1 = new HashMap();
		m1.put(2, "raghu");
		m1.put(4, "naveen");
		m1.put(1, "tiru");
		m1.put(0, "r");
		m1.put(-4, "nan");
		m1.put(5, "ti");
		Set s1 = m1.keySet();
		Iterator itr1 = s1.iterator();
		while(itr1.hasNext()){
			System.out.println(m1.get(itr1.next()));
		}
		
		TreeMap t1 = new TreeMap(m1);
		Set sortedKeys = new TreeSet(m1.keySet());
		//TreeSet s2 = (TreeSet) t1.keySet();
		Iterator itr = sortedKeys.iterator();
		while(itr.hasNext()){
			System.out.println(t1.get(itr.next()));
		}
	}

	private SingletonClass() throws Exception {
		if(m_instance != null){
		throw new Exception("Singleton already initialised");}
		System.out.println("Private Constructor");
	}
	
	public static synchronized SingletonClass getInstance() throws Exception{
		if(null == m_instance){
			m_instance = new SingletonClass();
		}
		
		return m_instance;
	}
}

//http://extreme-java.blogspot.com/2010/08/what-is-difference-between-class-level.html
//http://javarevisited.blogspot.com/2011/04/synchronization-in-java-synchronized.html
//http://javarevisited.blogspot.com/2011/03/10-interview-questions-on-singleton.html


//Doubts
//http://javarevisited.blogspot.com/2011/02/how-hashmap-works-in-java.html
//http://javarevisited.blogspot.com/2011/09/servlet-interview-questions-answers.html

//http://javarevisited.blogspot.sg/2011/07/java-multi-threading-interview.html
//http://javarevisited.blogspot.sg/2011/04/top-20-core-java-interview-questions.html