package day08;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

/**
 * 使用异常捕获机制完成下述读取操作，并在finally中有关闭RandomAccessFile操作。
 * 将emp.dat文件中所有员工解析出来，并创建为若干Emp实例存入一个 集合，然后按照员工入职从晚到早的顺序依次输出员工信息。
 * 
 * 该文件560字节，每56个字节为一个员工的信息。 其中: name为字符串，长度为32个字节，编码为:UTF-8 age为short,长度为2个字节
 * gender为字符串，长度为10个字节，编码为:UTF-8 salary为int,长度为4个字节 hiredate为long，长度为8个字节
 * 
 * 格式可参考当前包中emp.jpg图
 *
 */
public class Test05 {
	public static void main(String[] args) {
		RandomAccessFile raf = null;
		try {
			ArrayList<Emp> arr = new ArrayList<Emp>();
			raf = new RandomAccessFile("./src/main/java/day08/emp.dat", "r");
			for (int i = 0; i < raf.length() / 56; i++) {
				// 获取名字
				byte[] name = new byte[32];
				raf.read(name);
				String nameStr = new String(name).trim();

				// 获取年龄
				int age = raf.readShort();

				// 获取名字
				byte[] gender = new byte[10];
				raf.read(gender);
				String genderStr = new String(gender).trim();

//				薪水
				int salary = raf.readInt();

//				入职时间
				long hiredate = raf.readLong();
				
//				System.out.println(nameStr + age + genderStr + salary + hiredate);
				arr.add(new Emp(nameStr, age, genderStr, salary, new Date(hiredate)));
			}
//			System.out.println(arr);
//			对arr集合进行排序
			Collections.sort(arr, new Comparator<Emp>(){
				@Override
				public int compare(Emp o1, Emp o2) {
					if (o1.getHiredate().getTime()<o2.getHiredate().getTime()) {
						return 1;
					}else if (o1.getHiredate().getTime()>o2.getHiredate().getTime()) {
						return -1;
					}
					return 0;
				}
			});
			
//			遍历输出员工信息
			for (Emp emp : arr) {
				System.out.println(emp);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (raf != null) {
				try {
					raf.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
