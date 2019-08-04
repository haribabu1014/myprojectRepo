package Class;

import java.util.ArrayList;
import java.util.List;

public class ListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List mylist=new ArrayList();
		
		mylist.add("object1");
		mylist.add("object 2");
		
		System.out.println(mylist);
		
		//mylist.remove(1);
		//System.out.println(mylist);
		
		System.out.println(mylist.get(0));
		
		for(Object n:mylist) {
			System.out.println(n);
			
		}
		
		
		
		
			
		

	}

}
