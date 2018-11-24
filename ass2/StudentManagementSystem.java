
public class StudentManagementSystem {
	
	private LinkedList students;
	private LinkedList courses;
	private int numOfStudents;
	private int numOfCourses;
	
	public StudentManagementSystem() {
		students=new LinkedList();
		courses=new LinkedList();
		numOfStudents=0;
		numOfCourses=0;
	}
	
	public boolean addStudent(Student student){
		if(students.contains(student))
			return false;
		students.add(student);
		numOfStudents=this.getNumberOfStudents()+1;
		return true;
	}
	
	public boolean addCourse(Course course){
		if(courses.contains(course))
			return false;
		courses.add(course);
		numOfCourses=this.getNumberOfCourses()+1;
		return true;
	}
	
	public boolean register(Student student, Course course){
		if(!(students.contains(student)&courses.contains(course)))
			return false;
		return student.registerTo(course);
	}
	
	public boolean addGradeToStudent(Student student, Course course, int grade){
		if(!(students.contains(student)&courses.contains(course)))
			return false;
		if(!(student.isRegisteredTo(course)))
			return false;
		return (student.addGrade(course,grade));
	}
		
	
	public LinkedList getFirstKStudents(Comparator comp, int k){//sorts (by comp) students and return the first k Students
		if(comp==null|k<0|students.size()<k)
			throw new IllegalArgumentException();
		LinkedList output=new LinkedList();
		students.sortBy(comp);
		if(students.size()==k)
			return students;
		LinkedListIterator iterStudents=(LinkedListIterator)(students.iterator());
		for(int i=0;i<k;i=i+1)
			output.add(iterStudents.next());
		return output;
	}
	
	public double computeFinalGrade(Student student){
		if (student==null)
			throw new IllegalArgumentException();
		if(!(students.contains(student)))
			return -1;
		return (student.computeFinalGrade());	
	}

	public int getNumberOfStudents() {
		return numOfStudents;
	}

	public int getNumberOfCourses() {
		return numOfCourses;
	}
}
