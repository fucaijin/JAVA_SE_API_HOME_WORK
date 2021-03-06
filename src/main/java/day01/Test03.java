package day01;
/**
 * 检查一个字符串是否为回文
 * 回文:正着念与反着念一样，例如:上海自来水来自海上
 */
public class Test03 {
	public static void main(String[] args) {
		/*
		 * 编写一个回文字符串，然后调用check方法检查
		 * 该字符串是否为回文，然后输出检查结果。
		 * 若是回文则输出:是回文
		 * 否则输出:不是回文
		 */
		
		String str1 = "上海自来水来自海上";
		String str2 = "山东落花生花落东山";
		String str3 = "黄山落叶松叶落山黄";
		
		System.out.println(check(str1) ? str1 + ":是回文" : str1 + ":不是回文");
		System.out.println(check(str2) ? str2 + ":是回文" : str2 + ":不是回文");
		System.out.println(check(str3) ? str3 + ":是回文" : str3 + ":不是回文");
		
	}
	/**
	 * 判读该方法是否是回文
	 * @param str 需要判断的字符串
	 * @return true表示是回文，false表示不是回文
	 */
	public static boolean check(String str){
		for (int i = 0; i < str.length()/2; i++) {
			if(str.indexOf(i) != str.indexOf(str.length()-i)){
				return false;
			}
		}
		return true;
	}
}
