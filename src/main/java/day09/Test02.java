package day09;
/**
 * 使用线程方式二创建两个线程:分别输出1000次，你好和再见
 * 2.使用Runnable(实现Runnable接口单独定义线程任务)
 */
public class Test02 {
	public static void main(String[] args) {
		Runnable1 runnable1 = new Runnable1();
		Thread thread1 = new Thread(runnable1);
		
		Runnable2 runnable2 = new Runnable2();
		Thread thread2 = new Thread(runnable2);
		
		thread1.start();
		thread2.start();
	}
}

class Runnable1 implements Runnable{
	public void run(){
		for (int i = 0; i < 1000; i++) {
			System.out.println("你好");
		}
	}
}

class Runnable2 implements Runnable{
	public void run(){
		for (int i = 0; i < 1000; i++) {
			System.out.println("再见");
		}
	}
}