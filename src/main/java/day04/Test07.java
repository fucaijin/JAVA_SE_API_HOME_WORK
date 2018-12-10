package day04;

import java.util.ArrayList;
import java.util.Random;

/**
 * 创建一个List集合，并存放10个随机数，然后排序该集合
 * 后输出
 *
 */
public class Test07 {
	public static void main(String[] args) {
		Random random = new Random();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			al.add(random.nextInt(50));
		}
		
		System.out.println("排序前:" + al.toString());
		al.sort(null);
		System.out.println("排序后:" + al.toString());
	}
}
