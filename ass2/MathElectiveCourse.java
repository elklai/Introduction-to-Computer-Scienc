
public class MathElectiveCourse extends Course { 
	
	private String name;
	private int courseNum;
	private int credit;

	public MathElectiveCourse(String name, int number, int credit) {
		super(name,number,credit);
	}
	
	public int computeFinalGrade(int grade){//override Course_computeFinalGrade by using it and add 5 more points(if it meets the task's conditions
		int output=super.computeFinalGrade(grade);
		if(output<56)
			return output;
		output=output+5;
		if(output>100)
			return 100;
		return output;
		
	}

}
