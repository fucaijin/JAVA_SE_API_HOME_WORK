package day02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 要求用户输入若干员工信息，格式为： name,age,gender,salary;name,age,gender,salary;.... 例如:
 * 张三,25,男,5000;李四,26,女,6000;... 然后将每个员工信息解析成Person对象。并存入到一个数组中。
 * 然后循环数组，输出每一个员工信息(输出使用toString返回的字符串)
 * 
 * name,age,gender,salary; name,age,gender,salary; name,age,gender,salary;
 * 
 * 张三,25,男,5000; 张三,25,男,5000; 张三,25,男,5000;
 *
 */
public class Test08 {
	public static void main(String[] args) {
		System.out.println("请输入员工信息,输入exit退出");
		Scanner scn = new Scanner(System.in);

		Employee[] person = {};
		String str;

		while (true) {
			Employee p = new Employee();
			
			System.out.println("姓名:");
			str = scn.nextLine();
			if (str.equalsIgnoreCase("exit"))break;
			p.setName(str);
			
			System.out.println("年龄:");
			str = scn.nextLine();
			if (str.equalsIgnoreCase("exit"))break;
			p.setAge(Integer.parseInt(str));

			System.out.println("性别:");
			str = scn.nextLine();
			if (str.equalsIgnoreCase("exit"))break;
			p.setGender(str);
			
			System.out.println("工资:");
			str = scn.nextLine();
			if (str.equalsIgnoreCase("exit"))break;
			p.setSalary(Integer.parseInt(str));;

			person = Arrays.copyOf(person, person.length+1);	
			person[person.length-1] = p;
			
			System.out.println("下一个,输入exit退出");
		}
		
		for (int i = 0; i < person.length; i++) {
			System.out.print(person[i].toString());
		}

		scn.close();
	}
}

class Employee{
	private String name;
	private int age;
	private String gender;
	private int salary;
	public String toString() {
		return name + "," + age + "," + gender + "," + salary + ";";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
