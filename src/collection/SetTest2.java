package collection;

import java.util.HashSet;
import java.util.Set;

public class SetTest2 {
	
	public static void main(String [] arg){
		
		Set<Gugudan> set = new HashSet<Gugudan>();
		
		set.add(new Gugudan(2,3));
		set.add(new Gugudan(2,4));
		set.add(new Gugudan(2,6));
		set.add(new Gugudan(2,7));
	}

}
