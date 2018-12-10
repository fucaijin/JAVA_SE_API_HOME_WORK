package day03;

import java.io.File;
import java.sql.Date;
import java.util.Scanner;

/**
 * 实现时间的计算: 要求用户输入身份证号，若格式有误，要求其重新输入。然后根据身份证号码输出20岁生日 所在周的周三的日期。 例如:
 * 出生日期:1992-07-15。 20岁生日:2012-07-15 当周的周三为:2012-07-18
 */
public class Test05 {
	public static void main(String[] args) {
		System.out.println("请输入身份证号:");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
//		匹配18位数字，或者17位数字+字母x或字母X
		if (input.length() == 18 && input.matches("\\d{18}|(\\d{17}[xX])")) {
//			截取年月日
			String birth = input.substring(6, 14);
//			分别截取年、月、日
			String y = birth.substring(0, 4);
			String m = birth.substring(4, 6);
			String d = birth.substring(6, 8);
//			年份+20岁，并输出
			String twBirth = (Integer.parseInt(y) + 20) + "-" + m + "-"  + d;
			Date date = Date.valueOf(twBirth);
			System.out.println("20岁生日:" + date.toString()); // 20岁生日:2011-01-12
//			System.out.println("那周的周三为:" + twBirth);
		}else{
			System.out.println("格式有误");
		}

		scanner.close();
	}
}
