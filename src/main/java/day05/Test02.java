package day05;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 创建一个栈，存入Integer类型元素1,2,3,4,5
 * 然后遍历队列并输出每个元素
 */
public class Test02 {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		queue.offer(5);
		
		for (Integer i : queue) {
			System.out.println(i);
		}
	}
}
