package day02;
/**
 * 测试正则表达式，并尝试编写规则: 电话号码可能有3-4位区号，
 * 7-8位号码:0415-5561111
 */
public class Test06 {
	public static void main(String[] args) {
		String str = "0215-55578752";
		String regex = "\\d{3,4}-\\d{7,8}"; // 匹配3个或4个数字 然后匹配"-",接着匹配7个或8个数字
		if (str.matches(regex)) {
			System.out.println("电话号码正确");
		}else{
			System.out.println("电话号码错误");
		}
	}
}
