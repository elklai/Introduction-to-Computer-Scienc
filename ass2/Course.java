
public class Course {

	private String name;
	private int courseNum;
	private int credit;
	
	public Course(String name, int number, int credit){
		if(name==null||name.length()==0|!nameCheck(name)|number<=0|credit<=0)
			throw new IllegalArgumentException();
		this.name=name;
		this.courseNum=number;
		this.credit=credit;
	}

	public String getCourseName(){
		return name;
	}

	public int getCourseNumber(){
		return courseNum;
	}

	public int getCourseCredit(){
		return credit;
	}

	public String toString(){
		String output=this.getCourseName()+" course number is "+this.getCourseNumber();
		return output;
	}

	public boolean equals(Object other){//According to the course number  
		if (!(other instanceof Course))
				return false;
			return(this.getCourseNumber()==((Course)other).getCourseNumber());
	}

	public int computeFinalGrade(int grade){//bonus=none 
		if(grade<0|grade>100)
			throw new IllegalArgumentException();
		return grade;
	}
	
	private boolean nameCheck(String name){//this function gets name (String) and checks if it's  according to the task  
		boolean output =true;
		for(int i=0;i<name.length()&output;i=i+1){
			char c=name.charAt(i);
			if(!((c>='a'&c<='z')|(c<='Z'&c>='A')|(c>='0'&c<='9')|(c==' ')))
				output=false;
		}
		return output;	
	}
}
