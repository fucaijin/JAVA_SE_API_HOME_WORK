package day09;
/**
 * 使用线程方式一创建两个线程:分别输出1000次，你好和再见
 * 1.重写Thread的run方法(定义一个线程类并继承线程Thread,然后重写其run方法.run方法用来定义要执行的任务代码.)
 */
public class Test01 {
	public static void main(String[] args) {
		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();
		thread1.start();
		thread2.start();
	}
}

class Thread1 extends Thread{
	public void run(){
		for (int i = 0; i < 1000; i++) {
			System.out.println("你好");
		}
	}
}

class Thread2 extends Thread{
	public void run(){
		for (int i = 0; i < 1000; i++) {
			System.out.println("再见");
		}
	}
}