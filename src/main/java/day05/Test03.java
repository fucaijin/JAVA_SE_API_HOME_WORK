package day05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个List集合中。
 * 并对集合排序，然后输出每个员工信息。
 * 
 * 再根据员工的入职时间排序，入职晚的在前，早的在后并
 * 输出每个员工的信息。
 */
public class Test03 {
//	测试数据: 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;王五,18,女,9000,2007-02-25;赵柳,32,女,12000,2000-10-14;
	public static void main(String[] args) {
		List<Emp> list = new ArrayList<Emp>();
		System.out.println("请输入若干员工信息(格式为:张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...)");
//		获取用户输入
		Scanner scn = new Scanner(System.in);
		String inputLine = scn.nextLine();
		
//		将输入字符串解析为多条信息
		String[] infoArr = inputLine.split(";");
		for (String oneInfo : infoArr) {
//			将一条信息解析为详细信息
			String[] detailArr = oneInfo.split(",");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date hiredate;
			try {
				hiredate = sdf.parse(detailArr[4]);
//				将解析到的信息创建Emp对象并存入集合中
				Emp emp = new Emp(detailArr[0], Integer.parseInt(detailArr[1]), detailArr[2], Integer.parseInt(detailArr[3]), hiredate);
				list.add(emp);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		//对集合进行排序
		Collections.sort(list);
		System.out.println(list);//根据list内的元素的compare()方法来排序的

//		根据入职日期排序
		Collections.sort(list, new Comparator<Emp>(){
			@Override
			public int compare(Emp o1, Emp o2) {
				return (int) -((o1.getHiredate().getTime() - o2.getHiredate().getTime())/(1000*60*24));//除以1000是long转int会溢出运算结果有误
			}
			
		});
		
		System.out.println(list);
		scn.close();
	}
}
