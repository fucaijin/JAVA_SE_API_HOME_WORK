package day04;

import java.util.Scanner;

/**
 * 通过控制台输入3个日期(yyyy-MM-dd格式)，然后转换为Date对象后存入集合，
 * 然后对该集合排序后输出所有日期。
 */
public class Test08 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("请输入3个日期(格式:2018-02-21):");
		int inputTimes = 0;
		while (inputTimes<3) {
			String input = scn.nextLine();
//			TODO 尚未完成考虑月份不能超过12,日不能超过31
			String[] split = input.split("-");
			if (split.length == 3 && input.matches("\\d{4}(-\\d{1,2}){2}")) {
//			截取年\月\日
				int year = Integer.parseInt(split[0]);
				int month = Integer.parseInt(split[1]);
				int day = Integer.parseInt(split[2]);
				
//				if (month < 13 && day < 32) {
//					
//				}
				
				System.out.println("输入正确");
				inputTimes++;
			}else if(input.equalsIgnoreCase("exit")){
				break;
			}else{
				System.out.println("输入错误,请重新输入");
			}
		}
	}
}
