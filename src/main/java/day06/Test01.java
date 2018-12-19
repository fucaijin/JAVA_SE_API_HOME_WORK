package day06;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/**
 * 通过File输出当前项目目录下的文件"myfile.txt"的名字，大小，最后修改时间。
 * 最后修改时间格式如:2016-03-23 14:22:16
 */
public class Test01 {
	public static void main(String[] args){
		File file = new File("myfile.txt");
		System.out.println(file.getName());
		System.out.println(file.length());
		System.out.println(file.lastModified());
//		设置修改时间
		try {
			long time;
			time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2016-03-23 14:22:16").getTime();
			System.out.println(file.setLastModified(time));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
