package chapter1;


public class DoneListIterator implements Iterator {
	
	private DoneList doneList;
	private int index;
	
	public DoneListIterator(DoneList doneList) {
		this.doneList = doneList;
		this.index = 0;
	}

	public boolean hasNext() {
		if(index < doneList.getLength()) {
			return true;
		} else { 
			return false;
		}
	}

	public Object next() {
		Do done = doneList.getDoAt(index);
		index++;
		return done;
	}

}
