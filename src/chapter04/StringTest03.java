package chapter04;

public class StringTest03 {

	public static void main(String[] args) {
		String s =" aBcABCabcABC ";
		
		//char.At
		System.out.println(s.charAt(2)+"\n");
		
		//indexOf
		System.out.println(s.indexOf("abc"));
		System.out.println(s.indexOf("xyz")+"\n");
		
		System.out.println(s.length()+"\n");
		
		//replace : 치환
		System.out.println(s.replace('a', 'R'));
		System.out.println(s+"\n");
		
		//replaceAll : 치환
		System.out.println(s.replaceAll("abc", "123"));
		
		//substring
		System.out.println(s.substring(0,3));
		
		//to.lowerCase
		System.out.println(s.toCharArray());
		
		String str1 ="abcd";
		String str2 =",efg";
		
		//concat : 문자열
		str1=str1.concat(str2);
		System.out.println(str1);
		
		//trim : 공백을 제거함. 단, 앞뒤의 공백만 제거함
		System.out.println(str1);
		System.out.println("-"+str1.trim()+"-");
		
		//split 문자열 분리
		String[] result = str1.split(","); //,가지고 분리
		for(String str : result){
			System.out.println(str);
		}
		
		//split의 예외
		String str5 = "abcdefg";
		String[] resu = str5.split(",");
		for(String str : resu){
			System.out.println(str);		
		}
		

	}

}
