package day02;

import java.util.Scanner;

/**
 * 输入一个IP地址，然后将4段数字分别输出
 */
public class Test03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("请输入一个ip地址:");
		String nextLine = scn.nextLine().trim();
//		TODO 正则表达式未完成
		
//		[0-9]|\\d{2}|1\\d\\d|2[0-5][0-5])\\. 匹配1个数字 或 2个数字 或3个数字和.
//		String reg = "(\\d|\\d{2}|1\\d\\d|2[0-5][0-5]|2[0-4]\\d)\\.";
		String regex = "(1?[0-9]?[0-9]?|2[0-4][0-9]|25[0-5])\\.(1?[0-9]?[0-9]?|2[0-4][0-9]|25[0-5])\\.(1?[0-9]?[0-9]?|2[0-4][0-9]|25[0-5])\\.(1?[0-9]?[0-9]?|2[0-4][0-9]|25[0-5])";
		if(nextLine.matches(regex)){
			String[] split = nextLine.split("\\.");// 分割符的字符串是正则表达式,因此对于.需要两个反斜杠来转义

			for (String string : split) {
				System.out.println(string);
			}
			
			System.out.println("ip地址正确");
		}else{
			System.out.println("ip地址不正确");
		}
		scn.close();
	}
}
