import java.util.*;

public class Student {
	private String firstName;
	private String lastName;
	private String email;
	private int idNumber;
	private List<Course> courses;
	
	public Student(String firstName, String lastName, String email, int idNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.idNumber = idNumber;
		this.courses = new ArrayList<Course>();
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getIdNumber() {
		return this.idNumber;
	}
	
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<Course> getCourses() {
		return this.courses;
	}
	
	public void addCourses(Course[] courses) {
		this.courses.addAll(Arrays.asList(courses));
	}
	
}