package day07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用缓冲流复制myfile.txt文件为myfile_cp2.txt
 */
public class Test02 {
	public static void main(String[] args) {
		try {
			long time = System.currentTimeMillis();
			System.out.println("开始复制");
			FileInputStream fis = new FileInputStream("myfile.txt");
			BufferedInputStream isb = new BufferedInputStream(fis);
			
			FileOutputStream fos = new FileOutputStream("myfile_cp.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			int i = -1;
			byte[] b = new byte[1024];
			while ((i = isb.read(b)) != -1) {	//BufferedInputStream.read(byte[]) 返回的是读取的字节数
				bos.write(b, 0, i);
				bos.flush();
			}
			isb.close();
			bos.close();
			System.out.println("复制完毕!用时:" + (System.currentTimeMillis()-time) + "ms");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
