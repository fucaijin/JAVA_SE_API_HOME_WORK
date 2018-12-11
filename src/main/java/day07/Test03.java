package day07;

import java.util.Scanner;

/**
 * 要求用户控制台输入想输入的员工人数（至少5个），然后依序输入员工信息，每行为
 * 一条员工信息，格式如:张三,25,男,5000,2006-3-18
 * 然后将该对象写入到文件<name>.obj并保存到当前项目根目录中，例如:张三.obj。
 *
 */
public class Test03 {
	public static void main(String[] args) {
		System.out.println("请输入员工信息(格式如:张三,25,男,5000,2006-3-18,至少输入5人,输入\"exit\"退出):");
		Scanner scn = new Scanner(System.in);
		int empNum = 0;
		while(true){
			String input = scn.nextLine();
			String[] split = input.split(",");
			
//			退出业务
			if (input.equalsIgnoreCase("eixt")) {
				if (empNum < 5) {
					System.out.println("输入人数不够");
				}else{
					break;
				}
			}
			
//			判断信息是否正确 TODO 未完成
			if (split.length != 5) {
				System.out.println("信息输入有误,请重新输入");
				continue;
			}
			empNum++;
		}
		scn.close();
	}
}
