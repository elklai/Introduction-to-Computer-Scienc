
public class Student {
	private static final int creditRequired=120;
	private String firstName;
	private String lastName;
	private int id;
	private LinkedList courses;
	private LinkedList grades;

	public Student(String firstName, String lastName, int id) {
		if((firstName==null|lastName==null)||(firstName.length()==0|lastName.length()==0)||(!(namesCheck(firstName)))|(!(namesCheck(lastName)))|id<0)
			throw new IllegalArgumentException();
		this.firstName=firstName;
		this.lastName=lastName;
		this.id=id;
		this.courses=new LinkedList();
		this.grades=new LinkedList();
	}


	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getId() {
		return id;
	}

	public boolean isRegisteredTo(Course course){
		return courses.contains(course);
	}

	public boolean registerTo(Course course){
		if(isRegisteredTo(course))
			return false;
		courses.add(course);
		return true;
	}

	public double calculateAverage(){
		double sumGrades=0;
		double sumCredits=0;
		if(grades.size()==0)
			return 0;
		for(Object g:grades){
			sumGrades=sumGrades+((Grade)g).getGrade()*(((Grade)g).getCourse()).getCourseCredit();
			sumCredits=sumCredits+(((Grade)g).getCourse()).getCourseCredit();
		}
		double output=sumGrades/sumCredits;
		return output;
	}

	public boolean addGrade(Course course, int grade){
		if(grade<0|grade>100)
			throw new IllegalArgumentException();
		Grade g=new Grade(course,grade);
		 if(isAddGradePossible(g)&(this.isRegisteredTo(course))){
			 grades.add(g);
			 return true;
		 }
		 return false;
	}

	public int setGrade(Course course, int grade){
		if(grade<0|grade>100)
			throw new IllegalArgumentException();	
		Grade g=new Grade(course,grade);
		if(isAddGradePossible(g))
			 throw new IllegalArgumentException();
		int preGrade=setGrade(g);
		if(preGrade==-1)
			throw new IllegalArgumentException();
		return preGrade;
	}

	public String toString(){
		String output=this.getFirstName()+this.getLastName()+" id is "+this.getId();
		return output;
	}

	public boolean equals(Object other){
		if(!(other instanceof Student))
			return false; 
		if(this.getId()==((Student)other).getId())
			return true;
		return false;
	}

	public int getTotalCreditRequired(){
		return creditRequired;
	}

	public double computeFinalGrade(){
		Comparator comp=new FinalGradeComparator();
		grades.sortBy(comp);
		double output=-1;
		double sumOfCredit=0;
		double sumOfGrades=0;
		double realSumOfCredit=0;
		LinkedListIterator itergrade=(LinkedListIterator)grades.iterator();
			while(itergrade.hasNext()&sumOfCredit<this.getTotalCreditRequired()){
			Grade grade=(Grade)itergrade.next();
			if(grade.getGrade()>55){
				sumOfCredit=sumOfCredit+((grade.getCourse()).getCourseCredit());
				sumOfGrades=sumOfGrades+((grade.computeFinalGrade())*((grade.getCourse()).getCourseCredit()));
			}
			else{
				realSumOfCredit=sumOfCredit;
				sumOfCredit=this.getTotalCreditRequired();
			}
		}
			if(realSumOfCredit>0)
				sumOfCredit=realSumOfCredit;
		if(sumOfCredit>=this.getTotalCreditRequired())
			output=sumOfGrades/sumOfCredit;
		return output;
	}
	
	private boolean namesCheck(String name){//checks if the name(string)meets with the task's conditions 
		boolean output =true;
		for(int i=0;i<name.length()&output;i=i+1){
			char c=name.charAt(i);
			if(!((c>='a'&c<='z')|(c<='Z'&c>='A')|(c==' ')))
				output=false;
		}
		return output;	
	}
	
	private boolean isAddGradePossible(Grade grade){//checks if exist grade in the student's course(different from contain)
		if(grades.size()==0)				
			return true;
		for(Object g:grades)
			if((((Grade)g).getCourse()).equals(grade.getCourse()))
				return false;
			return true;
	}
			
	private int setGrade(Grade grade){				
		for(Object g:grades)
			if((((Grade)g).getCourse()).equals(grade.getCourse()))
				return((Grade)g).setGrade(grade.getGrade());
		return -1;
		}
}
