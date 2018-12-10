package day01;

import java.util.Scanner;

/**
 * 要求用户从控制台输入一个email地址，然后获取该email的用户名(@之前的内容)
 */
public class Test04 {
	public static void main(String[] args) {
		System.out.println("请输入email:");
		Scanner scn = new Scanner(System.in);
		String inputStr = scn.nextLine();
		
		if (!inputStr.matches("\\w+@[a-zA-z0-9]+(\\.[a-zA-z]+)+")) {
			System.out.println("你输入的不是邮箱");
		}else{
			String usrName = inputStr.substring(0, inputStr.indexOf("@"));
			System.out.println(usrName);
		}
		scn.close();
	}
}
