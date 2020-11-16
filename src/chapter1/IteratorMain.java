package chapter1;

import java.util.Iterator;

public class IteratorMain {
	
	public static void main(String[] args) {
		
		//�迭�� ������ doList
		DoList doList = new DoList(4);
		doList.appendDo(new Do("�Ͼ��"));
		doList.appendDo(new Do("�ı�"));
		doList.appendDo(new Do("��Ա�"));
		doList.appendDo(new Do("����ϱ�"));
		
		Iterator doListIterator = doList.iterator();
		
		while(doListIterator.hasNext()) {
			Do doo = (Do)doListIterator.next();
			System.out.println(doo.getName());
		}
		
		System.out.println("Vector�� ������ doneList");
		DoneList doneList = new DoneList();
		doneList.appendDo(new Do("�Ͼ��"));
		doneList.appendDo(new Do("�ľ���"));
		doneList.appendDo(new Do("��Ծ���"));
		doneList.appendDo(new Do("�������"));
		
		Iterator doneListIterator = doneList.iterator();
		while(doneListIterator.hasNext()) {
			Do done = (Do)doneListIterator.next();
			System.out.println(done.getName());
		}		
	}
}
