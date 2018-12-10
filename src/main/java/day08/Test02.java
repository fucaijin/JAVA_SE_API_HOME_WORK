package day08;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * 使用异常捕获完成下述操作 将控制台输入的每一行字符串使用缓冲字符输出流PrintWriter 按行以GBK编码写入到文件note.txt中
 */
public class Test02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String nextLine = "";
		try {
			FileOutputStream fos = new FileOutputStream("note.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos, "GBK");
			BufferedWriter bw = new BufferedWriter(osw);
			PrintWriter pw = new PrintWriter(bw, true);
			System.out.println("请输入文字,输入exit退出");
			// 如果没有输入退出,就把当前控制台输入的一行字符串写入文件
			while (!(nextLine = scn.nextLine()).equalsIgnoreCase("exit")) {
				pw.println(nextLine);
			}
			pw.close();
			System.out.println("程序结束");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			scn.close();
		}
	}
}
