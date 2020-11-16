package chapter1;

import java.util.Iterator;

public class IteratorMain {
	
	public static void main(String[] args) {
		
		//배열로 구현한 doList
		DoList doList = new DoList(4);
		doList.appendDo(new Do("일어나기"));
		doList.appendDo(new Do("씻기"));
		doList.appendDo(new Do("밥먹기"));
		doList.appendDo(new Do("출근하기"));
		
		Iterator doListIterator = doList.iterator();
		
		while(doListIterator.hasNext()) {
			Do doo = (Do)doListIterator.next();
			System.out.println(doo.getName());
		}
		
		System.out.println("Vector로 구현한 doneList");
		DoneList doneList = new DoneList();
		doneList.appendDo(new Do("일어났음"));
		doneList.appendDo(new Do("씻었음"));
		doneList.appendDo(new Do("밥먹었음"));
		doneList.appendDo(new Do("출근했음"));
		
		Iterator doneListIterator = doneList.iterator();
		while(doneListIterator.hasNext()) {
			Do done = (Do)doneListIterator.next();
			System.out.println(done.getName());
		}		
	}
}
