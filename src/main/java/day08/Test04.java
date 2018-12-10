package day08;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 使用异常捕获机制完成下述读取操作 读取emp.txt文件，并将每个员工信息读取出来，以一个Emp实例保存，然后将
 * 这些Emp实例存入到一个Map集合中。其中key为字符串，是该员工名字，而value 是该Emp实例。 存入后，要求用户输入一个员工的名字,如:张三
 * 若该员工存在则输出该员工所有信息(Emp的toString方法返回的字符串) 输入的员工名若是英文，不要求区分大小写。
 * 若输入的员工名字不存在，则显示"查无此人"
 *
 */
public class Test04 {
	public static void main(String[] args) {
		try {
			// 准备流读文件
			FileInputStream fis = new FileInputStream("./src/main/java/day08/emp.txt");
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			String line = null;

			// 准备一个map来装Emp
			HashMap<String, Emp> map = new HashMap<String, Emp>();

			// 读取文件
			while ((line = br.readLine()) != null) { // BufferedReader.readLine()如果读到末尾则返回null
				String[] split = line.split(",");
				// Emp(String name, int age, String gender, int salary, Date
				// hiredate)
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

//				获取文件中的一条信息中的每项信息
				String name = split[0];
				int age = Integer.parseInt(split[1]);
				String gender = split[2];
				int salary = Integer.parseInt(split[3]);
				Date hiredate = sdf.parse(split[4]);
				// 根据每项信息创建Emp实例并放入map中
				Emp emp = new Emp(name, age, gender, salary, hiredate);
				System.out.println(emp);
//				放入时候如果有英文统一改为小写
				map.put(name.toLowerCase(), emp);
			}
			
//			获取输入
			System.out.println("请输入一个员工名字:");
			Scanner scn = new Scanner(System.in);
			String input = scn.nextLine().toLowerCase().trim();
//			根据输入获取员工对象
			Emp emp = map.get(input);
			if (emp != null) {
				System.out.println(emp);
			} else {
				System.out.println("查无此人");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
