package day01;
/**
 * 1:输出字符串"HelloWorld"的字符串长度
 * 2:输出"HelloWorld"中"o"的位置
 * 3:输出"HelloWorld"中从下标5出开始第一次出现"o"的位置
 * 4:截取"HelloWorld"中的"Hello"并输出
 * 5:截取"HelloWorld"中的"World"并输出
 * 6:将字符串"  Hello   "中两边的空白去除后输出
 * 7:输出"HelloWorld"中第6个字符"W"
 * 8:输出"HelloWorld"是否是以"h"开头和"ld"结尾的。
 * 9:将"HelloWorld"分别转换为全大写和全小写并输出。
 */
public class Test01 {
	public static void main(String[] args) {
		String str = "HelloWorld";
		test1(str);
		test2(str);
		test3(str);
		test4(str);
		test5(str);
		String str2 = "  Hello   ";
		test6(str2);
		test7(str);
		test8(str);
		test9(str);
		//以下自行调用test2,test3...等方法。
	}
	
	/**
	 * 1:输出传进来的字符串长度
	 * @param str 传进来的字符串
	 */
	public static void test1(String str){
		System.out.println(str.length());
	}
	
	/**
	 * 2:输出传进来的字符串中"o"的位置
	 * @param str 传进来的字符串
	 */
	public static void test2(String str){
		System.out.println(str.indexOf('o'));
	}
	
	/**
	 * 3:输出传进来的字符串中从下标5出开始第一次出现"o"的位置
	 * @param str 传进来的字符串
	 */
	public static void test3(String str){
		System.out.println(str.indexOf('o', 5));
	}
	
	/**
	 * 4:输出传进来的字符串中的"Hello"并输出
	 * @param str 传进来的字符串
	 */
	public static void test4(String str){
		System.out.println(str.substring(0, str.indexOf("o")+1));
	}
	
	/**
	 * 5:输出传进来的字符串中的"World"并输出
	 * @param str 传进来的字符串
	 */
	public static void test5(String str){
		System.out.println(str.substring(str.indexOf("o")+1, str.length()));
		
	}
	
	/**
	 * 6:将字符串"  Hello   "中两边的空白去除后输出
	 * @param str 传进来的字符串
	 */
	public static void test6(String str){
		System.out.println(str.trim());
	}
	
	/**
	 * 7:输出"HelloWorld"中第6个字符"W"
	 * @param str 传进来的字符串
	 */
	public static void test7(String str){
		System.out.println(str.charAt(5));
	}
	
	/**
	 * 8:输出"HelloWorld"是否是以"h"开头和"ld"结尾的。
	 * @param str 传进来的字符串
	 */
	public static void test8(String str){
		System.out.println("String is start width \"h\":" + str.startsWith("h"));
		System.out.println("String is end width \"ld\":" + str.endsWith("ld"));
	}
	
	/**
	 * 9:将"HelloWorld"分别转换为全大写和全小写并输出。
	 * @param str 传进来的字符串
	 */
	public static void test9(String str){
		System.out.println("UpperCase:" + str.toUpperCase());
		System.out.println("LowerCase:" + str.toLowerCase());
	}
	
}
