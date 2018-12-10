package day04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 创建一个List集合并添加元素0-9
 * 然后获取子集[3,4,5,6]
 * 然后将子集元素扩大10倍
 * 然后输出原集合。
 * 之后删除集合中的[7,8,9]
 */
public class Test04 {
	public static void main(String[] args) {
//		创建一个List集合并添加元素0-9
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			al.add(i);
		}
//		获取子集[3,4,5,6]
		List<Integer> subList = al.subList(4, 8);
//		subList = subList.subList(0, subList.size()*10);
//		
//		Iterator<Integer> iterator = al.iterator();
//		while(iterator.hasNext()){
//			System.out.println(iterator.next());
//		}
//		
//		List<Integer> subList3 = new ArrayList<Integer>();
//		subList3.add(7);
//		subList3.add(8);
//		subList3.add(9);
//		al.removeAll(subList3);
//		Iterator<Integer> iterator2 = subList3.iterator();
//		while(iterator2.hasNext()){
//			System.out.println(iterator2.next());
//		}
		
	}
}
