package day01;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 要求用户输入一个计算表达式，可以使用加减乘除。 只处理一次运算的，不要有连续加减乘除的表达式,且不做小数计算。(例:1+2+3) 例如: 1+2
 * 然后经过处理计算结果并输出:1+2=3
 *
 */
public class Test06 {
	public static void main(String[] args) {
		System.out.println("请输入一个计算整数表达式(不要有连续加减乘除,例:1+2+3),例如:1+2");
		Scanner scn = new Scanner(System.in);
		String input = scn.nextLine().trim();
		caculate(input);
		// 输出计算结果
		scn.close();
	}

	/**
	 * 判断除去所有整数后,是否只剩一个字符(不是则提示运算符有误).是则判断是哪个字符(根据不同运算符进行计算).
	 * 
	 * @param inputStr 用户输入的计算表达式
	 * @return 计算结果
	 */
	public static void caculate(String inputStr) {
		inputStr = inputStr.trim();
		// 匹配算数运算符和数字。如果有其他的，就说明表达式错误,则提示表达式有误并结束程序。且以数字开头，数字结尾
		if (inputStr.matches("^[0-9]+[*/+-][0-9]+$")) {// 匹配: 整数 [加减乘除]整数
			String[] split = inputStr.split("[*/+-]");// 以数学运算符进行分割
			System.out.println(Arrays.toString(split));
			int i = Integer.parseInt(split[0]);
			int j = Integer.parseInt(split[1]);
			String operator = inputStr.replaceAll("\\d+", "");//替换所有的整数,只保留数学运算符

			// 判断数学运算符(匹配所有jdk版本)
			if (operator.equals("+")) {
				System.out.println(inputStr + "=" + (i + j));
			}else if(operator.equals("-")){
				System.out.println(inputStr + "=" + (i - j));
			}else if(operator.equals("*")){
				System.out.println(inputStr + "=" + (i * j));
			}else if(operator.equals("/")){
				System.out.println(inputStr + "=" + (i / j));
			}else{
				System.out.println("输入的运算符有误");
			}
			
//			// 匹配字符串 兼容jdk1.7及以上版本
//			switch (operator) {
//			case "+":
//				System.out.println(inputStr + "=" + (i + j));
//				break;
//			case "-":
//				System.out.println(inputStr + "=" + (i - j));
//				break;
//			case "*":
//				System.out.println(inputStr + "=" + (i * j));
//				break;
//			case "/":
//				System.out.println(inputStr + "=" + (i / j));
//				break;
//			}
		} else {
			System.out.println("错误的表达式");
		}
	}

	public static int parseInt(String str) {
		// 最后要生成的数字
		int num = 0;
		// 临时变量，用于计算对应位数的数字
		int flag = 0;
		for (int i = 0; i < str.length(); i++) {
			flag = (str.charAt(i) - 48);
			/*
			 * 这里是将对应的数字计算为对应的位，例如百位数字就要用该数字乘以10的2次方 得到
			 * 可以用Math的相关方法处理(自行查看API文档)
			 */
			for (int n = 0; n < str.length() - 1 - i; n++) {
				flag *= 10;
			}
			num += flag;
		}
		return num;
	}
}
