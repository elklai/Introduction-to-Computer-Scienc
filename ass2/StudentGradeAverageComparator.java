
public class StudentGradeAverageComparator implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {//compare between students by their calculateAverage(higher is smaller)
		if((!(obj1 instanceof Student))|(!(obj2 instanceof Student)))
			throw new ClassCastException();
		if(((Student)obj1).calculateAverage()>((Student)obj2).calculateAverage())
			return -1;
		if(((Student)obj1).calculateAverage()<((Student)obj2).calculateAverage())
			return 1;
		return 0;
	}

}
