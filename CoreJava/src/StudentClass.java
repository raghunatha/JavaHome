import java.io.Serializable;


public class StudentClass implements Serializable{

	private int age;
	private String name;
	private Object m_object;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Object getM_object() {
		return m_object;
	}
	public void setM_object(Object m_object) {
		this.m_object = m_object;
	}
	
	
	
	
}
