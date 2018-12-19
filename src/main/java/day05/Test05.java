package day05;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 有下列字符串:
 * 销售:张三;财务:李四;销售:王五;财务:赵六;程序:mike;程序:jerry;美工:jackson;前端:green;前端:nick;程序:钱七;销售:alice
 * 分析上述字符串然后统计每个职位总共多少人? 使用Map保存统计的结果，其中key:职位,value为该职位人数
 * 然后分别输出各职位的名称(keySet),各职位人数(entrySet)
 */
public class Test05 {
	public static void main(String[] arg) {
		String info = "销售:张三;财务:李四;销售:王五;财务:赵六;程序:mike;程序:jerry;美工:jackson;前端:green;前端:nick;程序:钱七;销售:alice";
		String[] split = info.split(";");
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String str : split) {
			String[] detail = str.split(":");
			if(map.get(detail[0]) == null){
				map.put(detail[0], 1);
			}else{
				map.put(detail[0], map.get(detail[0])+1);
			}
		}
//		输出所有职位
		Set<String> set = map.keySet();
		System.out.println(set);
		
//		分别输出各个职位有多少人
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for(Entry<String, Integer> entry : entrySet){
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}
