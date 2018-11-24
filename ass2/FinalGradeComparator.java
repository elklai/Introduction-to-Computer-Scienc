
public class FinalGradeComparator implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {//compare between grades(higher grade is smaller)
		if((!(obj1 instanceof Grade))|(!(obj2 instanceof Grade)))
			throw new ClassCastException();
		if((((Grade)obj1).computeFinalGrade())>(((Grade)obj2).computeFinalGrade()))
			return -1;
		if((((Grade)obj1).computeFinalGrade())<(((Grade)obj2).computeFinalGrade()))
			return 1;
		return 0;
	}

}
