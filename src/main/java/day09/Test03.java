package day09;
/**
 * 使用匿名内部类方式创建两个线程:分别输出1000次，你好和再见
 */
public class Test03 {
	public static void main(String[] args) {
		Thread thread1 = new Thread(){
			public void run(){
				for(int i = 0; i < 1000; i++){
					System.out.println("你好");
				}
			}
		};
		thread1.start();
		
		Thread thread2 = new Thread(new Runnable(){
			public void run(){
				for (int i = 0; i < 1000; i++) {
					System.out.println("再见");
				}
			}
		});
		thread2.start();
	}
}
