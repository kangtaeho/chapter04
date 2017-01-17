package chapter04;

public class WrapperClassTest {

	public static void main(String[] args) {
		
		Integer i = new Integer(10);
		Character c = new Character('a');
		Float f = new Float(3.14);
		Boolean v = new Boolean(true);
		
		//자동으로 박싱이 일어난다
		
		Integer j = 10;
		//Integer k = 10;
		
		//auto unboxing
		
		//int k = 10+j.intValue();
		
		int k =10*j;
		
		//swap(new Integer(10),new Integer(20)
		swap(10,20);

	}
	
	public static void swap(Integer a ,Integer b){
		//이런 형식으로는 객체이지만
		//절대 바뀌지 않는다.
		//이유는 wrapper객체는 내부를 수정할 수 없기 땜누이다.
	}

}
