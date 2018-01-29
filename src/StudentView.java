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
	
	public void setStudentDetails(Student student) {
	
	}
	
	public void printStudentDetails() {
		if (this.student == null) throw new IllegalArgumentException("student");		

		System.out.println("Student's first name is " + this.student.getFirstName());
		System.out.println("Student's last name is " + this.student.getLastName());
		System.out.println("Student's email is " + this.student.getEmail());
		System.out.println("Student's id number is " + this.student.getIdNumber());
		for(int i = 0; i < this.student.getCourses().size(); i++) {
			System.out.println(this.student.getCourses().get(i).getCourseName() + this.student.getCourses().get(i).getProfessor().getFirstName() + this.student.getCourses().get(i).getProfessor().getLastName());
		}
	}
}
