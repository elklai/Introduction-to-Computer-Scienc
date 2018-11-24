
public class ElectiveCourse extends Course{ 
	
	private String name;
	private int courseNum;
	private int credit;

	public ElectiveCourse(String name, int number, int credit) {
	super(name,number,credit);
	}

	public int computeFinalGrade(int grade){//override Course_computeFinalGrade, add 10% to the grade(if it meets the task's conditions

		if(grade<0|grade>100)
			throw new IllegalArgumentException();
		if(grade<56)
			return grade;
		grade=(int)(grade*1.1);
		if(grade>100)
			return 100;
		return grade;
	}

}
