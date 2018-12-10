package day04;

import java.util.ArrayList;

/**
 * 创建一个集合c1，存放元素"one","two","three"
 * 再创建一个集合c2，存放元素"four","five","six"
 * 然后将c2元素全部存入c1集合
 * 然后在创建集合c3,存放元素"one,five"
 * 然后输出集合c1是否包含集合c3的所有元素
 * 然后将c1集合中的"two"删除后再输出c1集合
 */
public class Test01 {
	public static void main(String[] args) {
//		创建一个集合c1，存放元素"one","two","three"
		ArrayList<String> c1 = new ArrayList<String>();
		c1.add("one");
		c1.add("two");
		c1.add("three");
		
//		再创建一个集合c2，存放元素"four","five","six"
		ArrayList<String> c2 = new ArrayList<String>();
		c1.add("four");
		c1.add("five");
		c1.add("six");
		
//		然后将c2元素全部存入c1集合
		c1.addAll(c2);
		
//		然后在创建集合c3,存放元素"one,five"
		ArrayList<String> c3 = new ArrayList<String>();
		c1.add("one");
		c1.add("five");
		
		
//		然后输出集合c1是否包含集合c3的所有元素
		if (c1.containsAll(c3)) {
			System.out.println("c1包含集合c3的所有元素");
		}else{
			System.out.println("c1包含集合c3的所有元素");
		}
		
//		然后将c1集合中的"two"删除后再输出c1集合
		c1.remove("two");
		System.out.println(c1.toString());
	}
}




