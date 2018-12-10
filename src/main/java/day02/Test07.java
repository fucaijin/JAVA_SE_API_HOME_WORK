package day02;

import java.util.Scanner;

/**
 * 输入一个数学计算表达式，如:1+2 然后输出计算后的结果:1+2=3 这里计算表达式只计算一次即可，可以使用加减乘除任意一个,可以进行小数运算。
 */
public class Test07 {
	public static void main(String[] args) {
		System.out.println("请输入一个数学计算表达式如:1+2");
		Scanner scn = new Scanner(System.in);
		String input = scn.nextLine().trim();

		// 匹配是否只有一个运算符,且是整数或小数
		if (input.matches("\\d+(\\.?\\d+)?[+*/-]\\d+(\\.?\\d+)?")) {
			System.out.println("满足要求");
			String[] split = input.split("[+*/-]");
			
			// 分割字符串,取得数值类型,判断是否含有小数
			boolean isInt = true;
			for (int i = 0; i < split.length; i++) {
				// 判断第一个数是整数还是小数
				if (split[i].matches("\\d+")) {
					Integer.parseInt(split[i]);
				} else {
					Double.parseDouble(split[i]);
					isInt = false;
				}
			}

			// 判断运算符类型
			if (isInt) {
				int a = Integer.parseInt(split[0]);
				int b = Integer.parseInt(split[1]);
				if (input.contains("+")) {
					System.out.println(input + " = " + (a + b));
				} else if (input.contains("-")) {
					System.out.println(input + " = " + (a - b));
				} else if (input.contains("*")) {
					System.out.println(input + " = " + (a * b));
				} else if (input.contains("/")) {
					// 可以被整除
					if (a % b == 0) {
						System.out.println(input + " = " + (a / b));
					} else {
						System.out.println(input + " = " + ((a + 0.0) / b));
					}
				}
			} else {
				double a = Double.parseDouble(split[0]);
				double b = Double.parseDouble(split[1]);
				if (input.contains("+")) {
					System.out.println(input + " = " + (a + b));
				} else if (input.contains("-")) {
					System.out.println(input + " = " + (a - b));
				} else if (input.contains("*")) {
					System.out.println(input + " = " + (a * b));
				} else if (input.contains("/")) {
					// 可以被整除
					System.out.println(input + " = " + (a / b));
				}
			}
		} else {
			System.out.println("表达式错误");
		}

		scn.close();
	}
}
