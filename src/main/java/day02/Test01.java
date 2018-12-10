package day02;

import java.util.Scanner;

/**
 * 要求用户输入一个字符串，
 * 然后若该字符串是一个整数，则转换为整数后输出乘以10后的结果
 * 若是小数，则转换为一个小数后输出乘以5后的结果，若不是数字则输出"不是数字"
 * 需要使用正则表达式进行判断。
 */
public class Test01 {
	public static void main(String[] args) {
		System.out.println("请输入一个字符串");
		Scanner scn = new Scanner(System.in);
		String input = scn.nextLine().trim();
		if (input.matches("\\d+")) {
//			整数
			System.out.println("整数:" + Integer.valueOf(input)*10);
		}else if(input.matches("^\\d*\\.\\d*$")){
//			小数
			System.out.println(Double.valueOf(input)*5);
		}else{
			System.out.println("不是数字");
		}
		
		scn.close();
	}
}
