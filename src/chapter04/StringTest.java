package chapter04;

public class StringTest {

	public static void main(String[] args) {
		
		// 출력하고 싶응ㄴ 따옴표 앞에  역슬래쉬를 넣어 주어야한다
		String s = "i say\"hello\" ";
		System.out.println(s+"\n");
		
		//문자형에서 ' -> 출력
		char c ='\'';
		
		//C:\dowork 출력
		String s1 = "c:\\dowork";
		System.out.println(s1+"\n");
		
		//\t, \n, \r,\n
		System.out.println("\n");
		
		//*연산이 가능하다.
		String s2 = "hello"+"java";
		System.out.println(s2);
		System.out.println(s2.charAt(3));
		

	}

}
