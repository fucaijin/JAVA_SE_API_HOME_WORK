package day07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件流复制myfile.txt文件为myfile_cp.txt
 */
public class Test01 {
	public static void main(String[] args) {
		try {
			long time = System.currentTimeMillis();
			System.out.println("开始复制");
			FileInputStream fis = new FileInputStream("myfile.txt");
			FileOutputStream fos = new FileOutputStream("myfile_cp.txt");
			byte[] b = new byte[1024];
			int len = -1;
			while ((len = fis.read(b)) != -1) {
				fos.write(b, 0, len);
				fos.flush();
			}
			fis.close();
			fos.close();
			System.out.println("复制完毕!用时:" + (System.currentTimeMillis()-time) + "ms");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
