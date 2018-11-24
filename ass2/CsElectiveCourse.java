
public class CsElectiveCourse extends ElectiveCourse { // You need to add inheritance

	private String name;
	private int courseNum;
	private int credit;
	
	public CsElectiveCourse(String name, int number, int credit) {//use ElectiveCourse instructor
		super(name,number,credit);
	}
	
	public int computeFinalGrade(int grade){//override ElectiveCourse_computeFinalGrade by using it and add 5 more points(if it meets the task's conditions
		int output=super.computeFinalGrade(grade);
		if(output<56)
			return output;
		output=output+5;
		if(output>100)
			return 100;
		return output;
	}

}
