package day08;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * 使用异常捕获机制完成下述IO操作 编写程序，要求下面的类实现功能:
 * 
 * 添加新员工 要求用户输入一个员工信息，格式如下: jackson,25,男,5000,2008-12-22
 * 
 * 用户输入后需要做下述验证: 要求用户名长度在1-20个字符之间且必须是英文 年龄在0-100之间的整数 性别只能是:"男"或"女"
 * 当发现用户输入有不符合规定时，提醒用户 相关内容输入不符合要求，并要求重新输入。 都输入正确后，将该员工添加到emp.txt文件 的最后一行。
 */
public class Test06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		try {
			RandomAccessFile raf = new RandomAccessFile("./src/main/java/day08/emp.txt", "rw");
			while (true) {
				System.out.println("请输入员工信息(格式如下:姓名,25,男,5000,2008-12-22):");
				String inputStr = scn.nextLine();
				String[] split = inputStr.split(",");
				if (split.length != 5) {
					System.out.println("输入项目不完整,请重新输入");
					continue;
				}

				// 姓名:要求用户名长度在1-20个字符之间且必须是英文
				String name = split[0];
				if (name.length() == 0) {
					System.out.println("请输入姓名,请重新输入");
					continue;
				} else if (name.length() > 20) {
					System.out.println("姓名过长,请重新输入");
					continue;
				} else if (!name.matches("[a-zA-z]+")) {
					System.out.println("姓名不是纯英文,请重新输入");
					continue;
				}

				// 年龄:在0-100之间的整数
				int age;
				if (!split[1].matches("\\d+")) {
					System.out.println("年龄不是整数,请重新输入");
					continue;
				} else if (Integer.parseInt(split[1]) > 100) {
					System.out.println("错误:年龄过大,请重新输入");
					continue;
				} else {
					age = Integer.parseInt(split[1]);
				}

				// 性别:只能是:"男"或"女"
				String gender = split[2];
				if (!gender.matches("[男女]")) {
					System.out.println("性别输入有误,请重新输入");
					continue;
				}

				// 工资:5000
				int salary = -1;
				if (!split[3].matches("\\d+")) {
					System.out.println("工资输入有误,请重新输入");
					continue;
				} else {
					salary = Integer.parseInt(split[3]);
				}

				// 入职时间:2008-12-22
				if (!split[4].matches("\\d{4}-((0[1-9])|(1[0-2]))-(([0-2][0-9])|(3[0-1]))")) {
					System.out.println("入职时间有误,请重新输入");
					continue;
				}

				String hiredate = split[4];

				// 都输入正确后，将该员工添加到emp.txt文件的末尾
				String empInfo = name + "," + age + "," + gender + "," + salary + "," + hiredate + "\n";
				// 将指针移动到文件末尾,并添加信息进去
				raf.seek(raf.length());
				raf.write(empInfo.getBytes());
				System.out.println("信息写入完毕!");
				raf.close();
				break;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		scn.close();
	}
}
