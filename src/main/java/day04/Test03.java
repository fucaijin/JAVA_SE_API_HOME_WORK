package day04;

import java.util.LinkedList;

/**
 * 创建一个List集合(ArrayList,LinkedList均可) 存放元素"one","two","three","four"。
 * 获取集合第二个元素并输出。 将集合第三个元素设置为"3" 在集合第二个位置上插入元素"2" 删除集合第三个元素。
 */
public class Test03 {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("one");
		ll.add("two");
		ll.add("three");
		ll.add("four");
		System.out.println(ll);

		String string = ll.get(1);
		System.out.println("第二个元素为:" + string);
		ll.set(2, "3");
		ll.add(1, "2");
		ll.remove(2);
		
		System.out.println(ll);
	}
}
