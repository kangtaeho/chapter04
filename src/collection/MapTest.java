package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set; //셋 리턴

public class MapTest {
	
	public static void main(String[] args){
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("나", new Integer(100));//이게 정석
		map.put("현재형", 60 ); //auto boxing new Integer(자동으로 생성)
		map.put("박강",90);
		map.put("현재형", 100);// 재형이 키는 그대로 유지되고 값이 새로 세팅된다
		
		Integer score1 = map.get("마이콜");
		System.out.println(score1);
		
		int score2 = map.get("박강"); //자동으로 빡싱이 생성 된다.
		System.out.println(score2);
		
		//평균
		int sum=0;
		Set<String> keyset = map.keySet();
		int count = keyset.size();
		
		Iterator<String> it =keyset.iterator();
		
		while(it.hasNext()){
			String key = it.next();
			//System.out.println(key);
			int score = map.get(key);
			//System.out.println(key+" : "+score);
			sum+=score;
		}
		
		System.out.println("평균 : "+(sum/count));
	}

}
