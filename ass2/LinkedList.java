import java.util.Iterator;
public class LinkedList implements List {

	private Link first;
	private Link last;
	private int size;
	
	
	private Link getFirst(){
		return this.first;
	}
	
	private Link getLast(){
		return this.last;
	}
	public LinkedList(){
		first = null;
		last = null;
		size = 0;
	}

	public void sortBy(Comparator comp){
		if(comp==null)
			throw new NullPointerException();
		if(this.size()>1){
			for(int i=this.size()-1;i>0;i=i-1){
				Link current=this.getFirst();
				Link next=current.getNext();
				for(int j=0;j<i;j=j+1){
					if(comp.compare(current.getData(),next.getData())>0)
						current.setData(next.setData(current.getData()));
					current=current.getNext();
					next=next.getNext();
					
				}
			}
		}
	}

	public String toString() {
		return ("description:\n"+ "all "+this.size()+" objects are saved");
	}

	public boolean equals(Object other) {  
		if((!(other instanceof LinkedList))||((LinkedList)other).size()!=this.size())
			return false;
		boolean output=true;
		Iterator iterThis=this.iterator();
		Iterator iterOther=((LinkedList)other).iterator();
		for(int i=0;i<this.size()&output;i=i+1)
			output=(iterThis.next()).equals(iterOther.next());
		return output;
	}

	public void add(int index, Object element) {
		rangeCheck(index);
		nullCheck(element);
		if(index == 0) {
			first = new Link(element, first) ;
			if(last == null)
				last = first ;
		} else {
			Link prev = null ;
			Link curr = first ;
			for(int i=0; i<index; i=i+1) {
				prev = curr ;
				curr = curr.getNext() ;
			}
			Link toAdd = new Link(element, curr);
			prev.setNext(toAdd);
			if(index == size())
				last = toAdd;
		}
		size=this.size()+1;
	}

	public void add(Object element) {
		nullCheck(element);
		if(isEmpty()){
			first = new Link(element);
			last = first;
		}
		else {
			Link newLast = new Link(element);
			last.setNext(newLast);
			last = newLast;
		}
		size=this.size()+1;

	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean contains(Object element) {
		for(Object obj:this)
			if((obj).equals(element))
				return true;
		return false;


	}

	@Override
	public boolean isEmpty() {
		if(this.size()==0)
			return true;
		return false;
	}

	@Override
	public Object get(int index) {
		rangeCheck(index);
		LinkedListIterator iterGet=(LinkedListIterator)this.iterator();
		Object output=iterGet.next();
		for(int i=1;i<=index;i++)
			output=iterGet.next();
		return output;
			

	}

	@Override
	public Object set(int index, Object element) {
		nullCheck(element);
		rangeCheck(index);
		Link a=this.getFirst();
		for(int i=1;i<=index;i++)
			a=a.getNext();
		return a.setData(element);
		
	}

	@Override
	public Iterator iterator() {
		return new LinkedListIterator(this.getFirst());
	}

	// throws an exception if the given index is not in range
	private void rangeCheck(int index) {
		if(index < 0 || index >= size())
	        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
	}
	
	// throws an exception if the given element is null
	private void nullCheck(Object element){
		if (element == null)
			throw new NullPointerException();
	}

}
