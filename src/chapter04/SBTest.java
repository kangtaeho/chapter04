package chapter04;

public class SBTest {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("This");
		
		//문자열 덧붙이기
		
		sb.append("is pencil");
		System.out.println(sb);
		
		sb.insert(7, "my");
		System.out.println(sb);
		
		//치환
		sb.replace(8, 10, "yours");
		System.out.println(sb);
		
		//버퍼크기 조절
		sb.setLength(5);
		System.out.println(sb);
		
		//더 중요한 것은 문자열 +연산은
		//내부적으로 StringBuffer 객체로 변환한다.
		String s1 = "Hello"+"World"+10+true;
		String s2 = "Hello"+"World"+new Integer(10);
		
		

	}

}
