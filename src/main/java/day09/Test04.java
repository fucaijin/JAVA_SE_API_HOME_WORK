package day09;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 创建一个线程，每秒输出一次当前系统时间:yyyy-MM-dd HH:mm:ss
 */
public class Test04 {
	public static void main(String[] args) {
		Thread thread = new Thread(){
			@Override
			public void run() {
				try {
					while(true){
						Date date = new Date();
						SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
						String format = simpleDateFormat.format(date);
						System.out.println(format);
						Thread.sleep(1000);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		thread.start();
	}
}
