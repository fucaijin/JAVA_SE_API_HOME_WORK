package day08;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 使用异常捕获机制完成下述读取操作。 使用缓冲流读取note.txt文件，并将每行字符串输出到控制台上
 *
 */
public class Test03 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("note.txt");
			InputStreamReader isr = new InputStreamReader(fis,"GBK");
			BufferedReader bis = new BufferedReader(isr);
			String readLine = null;
			while ((readLine = bis.readLine()) != null) {
				System.out.println(readLine);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
