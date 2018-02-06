import java.util.ArrayList;

public class MyMvcDemo {

	public static void main(String[] args) {
		// TODO Add examples of professors, courses and students
		
		Student student = new Student("Kris", "Kamau", "kamaukri@shu.edu", 12345678);
		StudentView studentView =  new StudentView();
		StudentController controller =  new StudentController(student, studentView);
		CourseView courseView = new CourseView();
		
		ArrayList<Professor> professors = new ArrayList<Professor>();
		professors.add(new Professor("Jacob", "Edison", "jacob.edison@shu.edu", "1800253422"));
		professors.add(new Professor("Liza", "Rafaeli", "liza.rafaeli@shu.edu", "1800254422"));
		professors.add(new Professor("Edward", "Kelly", "edward.kelly@shu.edu", "1800999383"));
		professors.add(new Professor("Rachel", "Robinson", "rachel.robinson@shu.edu", "1800498372"));
		
		RegistrationController regController = new RegistrationController(courseView, controller);
		
		
		regController.addCourses(new Course("Data Mining", 3010, 3, professors.get(1)));
		regController.addCourses(new Course("Sociology", 8393, 2, professors.get(2)));
		regController.addCourses(new Course("Software Engineering", 4100, 3, professors.get(3)));
		regController.addCourses(new Course("Economics", 1212, 3, professors.get(0)));
		
		regController.registerStudentCourses(regController.getAvailableCourses().get(0), regController.getAvailableCourses().get(2));
		controller.printStudentDetails();
		

	}

}