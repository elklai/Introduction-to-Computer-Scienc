
public class EngineeringStudent extends Student { 

	private static final int creditRequired=160;
	private String firstName;
	private String lastName;
	private int id;
	private LinkedList courses;
	private LinkedList grades;
	
	public EngineeringStudent(String firstName, String lastName, int id) {
		super(firstName,lastName,id);
	}
	
	public int getTotalCreditRequired(){
		return creditRequired;
	}

}
