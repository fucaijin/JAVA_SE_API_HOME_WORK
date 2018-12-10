package day08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 对myfile.txt文件进行复制操作，要求使用异常捕获机制对流的异常进行捕获和处理， finally中要将流关闭
 */
public class Test01 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			System.out.println("开始复制");
//			复制文件
			fis = new FileInputStream("myfile.txt");
			fos = new FileOutputStream("myfile_cp.txt");
			byte[] b = new byte[1024];
			int len = -1;
			while ((len = fis.read(b)) != -1) {
				fos.write(b, 0, len);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
//			关流
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("复制完毕");
		}
	}
}
