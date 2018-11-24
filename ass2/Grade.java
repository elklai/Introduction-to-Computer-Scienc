
public class Grade {
	
	private Course course;
	private int grade;
	
	public Grade(Course course, int grade){
		if(course==null|grade<0|grade>100)
			throw new IllegalArgumentException();
		this.course=course;
		this.grade=grade;
	}

	public int getGrade() {
		return grade;
	}

	public int setGrade(int grade) {
		if(grade<0|grade>100)
			throw new IllegalArgumentException();
		int output=this.getGrade();
		this.grade=grade;
		return output;
	}

	public Course getCourse() {
		return course;
	}
	
	public String toString(){
		String output;
		if(this.getGrade()>56)
			output="passed";
		else
			output="fail";
		return output;
	}
	
	public boolean equals(Object other){
		if(!(other instanceof Grade))
			return false;
		return(((this.getCourse()).equals(((Grade)other).getCourse()))&(this.getGrade()==((Grade)other).getGrade()));
	}
	
	public int computeFinalGrade(){//checks the kind of the grade.getCourse and compute the final grade
		if((this.getCourse()) instanceof ElectiveCourse){
			if((this.getCourse()) instanceof CsElectiveCourse)
				return ((CsElectiveCourse)(this.getCourse())).computeFinalGrade(this.getGrade());
			return (((ElectiveCourse)(this.getCourse())).computeFinalGrade(this.getGrade()));
		}
		if((this.getCourse())instanceof MathElectiveCourse)
			return (((MathElectiveCourse)(this.getCourse())).computeFinalGrade(this.getGrade()));
		return this.getGrade();
	}
}
