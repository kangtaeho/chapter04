package chapter04;

public class WrapperClassTest02 {

	public static void main(String[] args) {
		Character c = 'A';
		
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.isDigit('B'));
		System.out.println(Character.isDigit('9'));
		
		int i = Integer.parseInt("-1234");
		System.out.println(i);
		
		System.out.println(Integer.parseInt("A",16));
		System.out.println(Integer.toBinaryString(256));
		System.out.println(Integer.toHexString(256));
		System.out.println(Double.parseDouble("44.13e-16"));
		System.out.println(Long.parseLong("123456789"));
		
	}

}
