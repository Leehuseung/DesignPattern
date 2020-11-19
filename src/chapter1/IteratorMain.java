package chapter1;

import java.util.Iterator;

public class IteratorMain {
	
	public static void main(String[] args) {
		
		//�迭�� ������ doList
		DoList doList = new DoList(4);
		doList.appendDo(new Do("A하기"));
		doList.appendDo(new Do("B하기"));
		doList.appendDo(new Do("C하기"));
		doList.appendDo(new Do("D하기"));
		
		Iterator doListIterator = doList.iterator();
		
		while(doListIterator.hasNext()) {
			Do doo = (Do)doListIterator.next();
			System.out.println(doo.getName());
		}
		
		System.out.println("Vector로구현한 doneList");
		DoneList doneList = new DoneList();
		doneList.appendDo(new Do("A헀음"));
		doneList.appendDo(new Do("B했음"));
		doneList.appendDo(new Do("C했음"));
		doneList.appendDo(new Do("D했음"));
		
		Iterator doneListIterator = doneList.iterator();
		while(doneListIterator.hasNext()) {
			Do done = (Do)doneListIterator.next();
			System.out.println(done.getName());
		}		
	}
}
