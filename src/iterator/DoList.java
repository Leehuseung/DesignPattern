package iterator;

import java.util.Iterator;

public class DoList implements Aggregate{
	
	private Do[] doList;
	
	private int last = 0;
	
	public DoList(int maxsize) {
		this.doList = new Do[maxsize];
	}
	
	public Do getDoAt(int index) {
		return doList[index];
	}
	
	public void appendDo(Do doo) {
		this.doList[last] = doo;
		last ++;
	}
	
	public int getLength() {
		return last;
	}

	public Iterator iterator() {
		return (Iterator) new DoListIterator(this);
	}

}
