package day04;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 创建一个集合，存放元素"1","$","2","$","3","$","4"
 *   使用迭代器遍历集合，并在过程中删除所有的"$"，
 *   最后再将删除元素后的集合使用新循环遍历，并输出每一个元素。
 *
 */
public class Test02 {
	public static void main(String[] args) {
//		创建一个集合，存放元素"1","$","2","$","3","$","4"
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("1");
		arr.add("$");
		arr.add("2");
		arr.add("3");
		arr.add("$");
		arr.add("4");

//		使用迭代器遍历集合，并在过程中删除所有的"$"，
		Iterator<String> iterator = arr.iterator();
		while(iterator.hasNext()){
			if (iterator.next().equals("$")) {
				iterator.remove();
			}
		}
		
//		将删除元素后的集合使用新循环遍历，并输出每一个元素
		iterator = arr.iterator();//一个迭代器只能迭代一次，因此需要在生成一个新迭代器使用
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
//		for each循环法：
		for (String string : arr) {
			System.out.println(string);
		}
	}
}
