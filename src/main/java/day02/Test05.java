package day02;

import java.io.File;
import java.util.Scanner;

/**
 * 实现文件重命名。 要求用户输入一个文件名称，例如:abc.jpg 然后对该名字进行重新命名，输出的格式为:系统时间毫秒值.jpg
 * 例如:1465266796279.jpg
 */
public class Test05 {
	public static void main(String[] args) {
		System.out.println("请输入一个文件名");
		Scanner scn = new Scanner(System.in);
		String input = scn.nextLine().trim();
		File file = new File(input);
		
//		使用.分割取最后一个索引(扩展名)
		String[] split = input.split("\\.");
		input = Long.toString(System.currentTimeMillis()) + "." + split[split.length - 1];
		file.renameTo(new File(input));

		System.out.println("重命名完成");
		scn.close();
	}
}
