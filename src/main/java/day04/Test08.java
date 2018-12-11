package day04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * 通过控制台输入3个日期(yyyy-MM-dd格式)，然后转换为Date对象后存入集合， 然后对该集合排序后输出所有日期。
 */
public class Test08 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("请输入3个日期(格式:2018-02-21):");
		int inputTimes = 0;
		List<Date> list = new ArrayList<Date>();

		// 循环接收一直等等输入退出或输入完毕
		while (inputTimes < 3) {
			String input = scn.nextLine().trim();
			String[] split = input.split("-");

			// 判断格式是否正确
			if (split.length == 3 && input.matches("\\d{4}(-\\d{1,2}){2}")) {
				// 截取年\月\日
				int month = Integer.parseInt(split[1]);
				int day = Integer.parseInt(split[2]);

//				月份不能为0或超过12,每个月不能超过31天
				if (month != 0 && month < 13 && day < 32) {
					
//					解析日期，并添加到集合中，然后记录输入的正确个数
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					try {
						Date date = sdf.parse(input);
						list.add(date);
					} catch (ParseException e) {
						System.out.println("输入错误,请重新输入");
						continue;
					}
					System.out.println("输入正确,请继续输入下一个:");
					inputTimes++;
				} else {
					System.out.println("月份/日输入错误");
					continue;
				}
			} else if (input.equalsIgnoreCase("exit")) {
				break;
			} else {
				System.out.println("输入错误,请重新输入");
			}
		}

		Collections.sort(list);
		System.out.println(list);
		scn.close();
	}
}
