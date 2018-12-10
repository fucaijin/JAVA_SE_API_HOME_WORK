package day04;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 创建一个字符串数组:{"one","two","three"}
 * 然后将该数组转换为一个List集合
 */
public class Test06 {
	public static void main(String[] args) {
//		创建一个字符串数组:{"one","two","three"}
		String[]  str = {"one","two","three"};
		
//		将该数组转换为一个List集合
		List<String> arr = Arrays.asList(str);
		
//		遍历输出
		Iterator<String> iterator = arr.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
