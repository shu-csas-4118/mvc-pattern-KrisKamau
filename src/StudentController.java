public class StudentController {
	private StudentView studentView;
	private Student	student;
	
	public StudentController(Student student, StudentView studentView) {
		this.student = student;
		this.studentView = studentView;
	}
	
	public void printStudentDetails() {
		this.studentView.printStudentDetails(this.student);
	}
}
