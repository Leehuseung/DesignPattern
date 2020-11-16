package chapter1;


public class DoListIterator implements Iterator {
	
	private DoList doList;
	private int index;
	
	public DoListIterator(DoList doList) {
		this.doList = doList;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		if(index < doList.getLength()) {
			return true;
		} else { 
			return false;
		}
	}

	@Override
	public Object next() {
		Do doo = doList.getDoAt(index);
		index++;
		return doo;
	}

}
