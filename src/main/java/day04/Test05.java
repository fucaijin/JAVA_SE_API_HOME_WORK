package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个List集合，并添加元素0-9 将集合转换为一个Integer数组并输出数组每一个元素
 */
public class Test05 {
	public static void main(String[] args) {
		// 创建一个List集合，并添加元素0-9
		List<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			arr.add(i);
		}
		
		Integer[] intArr = arr.toArray(new Integer[arr.size()]);
		for (Integer integer : intArr) {
			System.out.println(integer);
		}
		
//		// 以下为提前的自己的写法
//		// 将集合转换为一个Integer数组
//		Integer[] i = new Integer[arr.size()];
//		arr.toArray(i);
//
//		// 输出数组每一个元素
//		for (Integer integer : i) {
//			System.out.println(integer);
//		}
	}
}
