package day02;
/**
 * 将字符串123,456,789,012根据","拆分，并输出拆分后的每一项
 *
 */
public class Test02 {
	public static void main(String[] args) {
		String str = "123,456,789,012";
		String[] split = str.split(",");
		for (String string : split) {
			System.out.println(string);
		}
	}
}
