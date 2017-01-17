package chapter04;

public class StringTest02 {

	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = "cde";
		String str3 = str2;
			
		
		str2=str1.toUpperCase();
		
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3+"\n");
		
		String str4 = str2.concat("??");
		System.out.println(str2);
		System.out.println(str4+"\n");
		
		String str5="!".concat(str2).concat("@");
		System.out.println(str5);
		
		//String s1= "!";
		//String s2 =a1.concat(str2);
		//String str5 = s2.concat("@");

	}

}
