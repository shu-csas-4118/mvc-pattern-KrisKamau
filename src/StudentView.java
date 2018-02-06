public class StudentView {
	private Student student;
	
	public StudentView(Student student) {
		this.student = student;
	}
	
	public StudentView() {
		
	}
	
	public void printStudentDetails(Student student) {
		this.student = student;
		printStudentDetails();
	}
	
	public void printStudentDetails() {
		if (this.student == null) throw new IllegalArgumentException("student");		

		System.out.println("Student's first name is " + this.student.getFirstName());
		System.out.println("Student's last name is " + this.student.getLastName());
		System.out.println("Student's email is " + this.student.getEmail());
		System.out.println("Student's id number is " + this.student.getIdNumber());
		
	}
	
	public void printStudentCourses() {
		for(Course course: this.student.getCourses()) {
			System.out.println(course.getCourseName());
			System.out.println(course.getCourseNumber());
			System.out.println(course.getCredit());
			printProfessorDetails(course.getProfessor());
		}
	}
	
	public void printProfessorDetails(Professor professor) {
		System.out.println(professor.getFirstName());
		System.out.println(professor.getLastName());
		System.out.println(professor.getPhoneNumber());
	}
}