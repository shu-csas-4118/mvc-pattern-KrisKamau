import java.util.*;

public class RegistrationController {
	
	private List<Course> availableCourses;
	private CourseView courseView;
	private StudentController studentController;
	
	public RegistrationController(CourseView courseView, StudentController studentController) {
		this.availableCourses = new ArrayList<Course>();
		this.courseView = courseView;
		this.studentController = studentController;
	}
	
	public void addCourses(Course...courses) {
		this.availableCourses.addAll(Arrays.asList(courses));
	}
	
	public List<Course> getAvailableCourses() {
		return availableCourses;
	}

	public void printAvailableCourses() {
		for(Course course: this.availableCourses) {
			courseView.printCourseDetails(course);
		}
	}
	
	public void registerStudentCourses(Course...courses) {
		this.studentController.registerCourses(courses);
	}

}
