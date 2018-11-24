
public class StudentNameComparator implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		if((!(obj1 instanceof Student))|(!(obj2 instanceof Student)))
			throw new ClassCastException();
		String lastName1=((Student)obj1).getLastName();
		String lastName2=((Student)obj2).getLastName();
		for(int i=0;i<lastName1.length()&i<lastName2.length();i=i+1){
			if(lastName1.charAt(i)>lastName2.charAt(i))
				return 1;
			if(lastName1.charAt(i)<lastName2.charAt(i))
				return -1;
		}
		if(lastName1.length()>lastName2.length())
			return 1;
		if(lastName1.length()<lastName2.length())
			return -1;
		String firstName1=((Student)obj1).getFirstName();
		String firstName2=((Student)obj2).getFirstName();
		for(int i=0;i<firstName1.length()&i<firstName2.length();i=i+1){
			if(firstName1.charAt(i)>firstName2.charAt(i))
				return 1;
			if(firstName1.charAt(i)<firstName2.charAt(i))
				return -1;
		}
		if(firstName1.length()>firstName2.length())
			return 1;
		if(firstName1.length()<firstName2.length())
			return -1;
		return 0;
	}

}
