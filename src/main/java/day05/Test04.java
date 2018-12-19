package day05;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**
 *创建一个Map，保存某个学生的成绩:
 *在控制台输入该学生成绩，格式:
 *科目:成绩;科目:成绩;...
 *例如:  
 *语文:99;数学:98;英语:97;物理:96;化学:95
 *然后输出物理的成绩。
 *然后将化学的成绩设置为96
 *然后删除英语这一项。
 *然后遍历该Map分别按照遍历key，Entry，value
 *的形式输出该Map信息。
 */
public class Test04 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		System.out.println("请输入学生成绩(格式如下: 语文:99;数学:98;英语:97;物理:96;化学:95):");
		Scanner scn = new Scanner(System.in);
		String input = scn.nextLine();
		scn.close();
		
		String[] data = input.split(";");
		for (String string : data) {
			String[] detail = string.split(":");
			map.put(detail[0], Integer.parseInt(detail[1]));
		}
//		System.out.println(map);
		System.out.println("物理成绩:" + map.get("物理"));
		map.put("化学", 96);
		System.out.println("修改化学为96后:" + map);
		map.remove("英语");
		System.out.println("删除英语后:" + map);
		
		System.out.println("\r\n以下为遍历Key:");
		Set<String> keySet = map.keySet();
		for(String str : keySet){
			System.out.println(str);
		}
		
		System.out.println("\r\n以下为遍历Entry:");
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for(Entry<String, Integer> entry : entrySet){
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		System.out.println("\r\n以下为遍历Value:");
		Collection<Integer> values = map.values();
		for(Integer i : values){
			System.out.println(i);
		}
	}
}
