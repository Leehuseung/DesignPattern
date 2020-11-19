
package iterator;

import java.util.Iterator;
import java.util.Vector;

public class DoneList implements Aggregate{
	
	private Vector<Do> doList;
	
	private int last = 0;
	
	public DoneList() {
		doList = new Vector<Do>();
	}
	
	public Do getDoAt(int index) {
		return doList.get(index);
	}
	
	public void appendDo(Do done) {
		doList.add(last, done);
		last ++;
	}
	
	public int getLength() {
		return last;
	}

	public Iterator iterator() {
		return (Iterator) new DoneListIterator(this);
	}

}
