package day01;

import java.util.Random;
import java.util.Scanner;


/**
 * 随机生成一个5位的英文字母验证码(大小写混搭) 然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
 * 然后判定用户输入的验证码是否有效(无论用户输入大小写，只要字母都正确即可)。
 */
public class Test05 {
	public static void main(String[] args) {
		String verificationCode = verificationCodeFactory1(5);
//		String verificationCode = verificationCodeFactory2(5);//生成指定位数的随机大小写字母
//		String verificationCode = verificationCodeFactory3(5);//生成指定位数的随机大小写字母
		System.out.println("验证码:" + verificationCode);
		System.out.println("请输入验证码(不区分大小写):");
		Scanner scn = new Scanner(System.in);
		String inputStr = scn.nextLine();
		// 把验证码和用户输入的都转成大写,再比较
		if (verificationCode.toUpperCase().equals(inputStr.toUpperCase())) {
			System.out.println("验证码校验成功!");
		} else {
			System.out.println("验证码校验失败!");
		}
		scn.close();

//		char c = 48;
//		char d = 65;
//		char e = 97;
//		System.out.println(c);// 0
//		System.out.println(d);// A
//		System.out.println(e);// a

	}

	/**
	 * 算法3
	 * @param lenth
	 * @return
	 */
	private static String verificationCodeFactory3(int lenth) {
		String str = "qwertyuioplkjhgfdsazxcvbnm";
		str+=str.toUpperCase();
		Random rand = new Random();
		String s = "";
		for (int i = 0; i < 5; i++) {
			s+=str.charAt(rand.nextInt(str.length()));
		}
		return s;
	}

	/**
	 * 算法2
	 * 先统一生成5个随机的大写/小写字母
	 * 遍历这5个字母,随机转成小写/大写
	 * @return 返回5个随机的大小写字母
	 */
	public static String verificationCodeFactory2(int lenth) {
		Random rd = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 5; i++) {
			char c = (char) (65+rd.nextInt(26));
			sb.append(c);
		}
		
		char[] charArray = sb.toString().toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			int is2Upper = (int) (Math.random()*2);
			if (is2Upper == 0) {
				charArray[i] = (charArray[i]+ "").toLowerCase().charAt(0);
			}
		}
		return new String(charArray);
	}

	/**
	 * 算法1
	 * 验证码工厂方法
	 * @return 返回一个随机的5位英文字母验证码(大小写混搭)
	 */
	public static String verificationCodeFactory1(int lenth) {
		
		StringBuilder resultStr = new StringBuilder();
		char[] c = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
				'u', 'v', 'w', 's', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
				'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'S', 'Y', 'Z', };
		Random rd = new Random();
		for (int i = 0; i < lenth; i++) {
			// 0 A a在ASCLL码中分别是48 65 97
			resultStr.append(c[rd.nextInt(c.length)]);
		}
		return resultStr.toString();
	}

}
