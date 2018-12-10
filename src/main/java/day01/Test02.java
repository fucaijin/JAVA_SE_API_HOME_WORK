package day01;

/**
 * 将"大家好!"修改为:"大家好!我是程序员!"并输出。 
 * 然后将"大家好!我是程序员!"修改为:"大家好!我是优秀的程序员!"并输出
 * 然后再修改为:"大家好!我是牛牛的程序员!"并输出
 * 然后在修改为:"我是牛牛的程序员!"并输出
 *
 */
public class Test02 {
	public static void main(String[] args) {
		String str = "大家好!";
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.append("我是程序员"));
		System.out.println(sb.insert(sb.indexOf("程序员"), "优秀的"));
		System.out.println(sb.replace(sb.indexOf("是") + 1, sb.indexOf("的程序员"), "牛牛"));
		System.out.println(sb.substring(sb.indexOf("我是"), sb.length()));

	}
}
