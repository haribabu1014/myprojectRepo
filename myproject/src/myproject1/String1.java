package myproject1;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String age="37";
		int a=Integer.parseInt(age)/2;
		System.out.println(a);
       */
		/*
		double sal=78069.05;
		double tax=0.0;
		if(sal<=1500) {
			tax=sal*.10;
			
		}else if(sal<=50000) {
			tax=sal*.20;
		}else if(sal<=80000) {
			tax=sal*.30;
		}
		System.out.println(tax);
		*/
		int total=0;
		String[] s={"10","20","30"};
		for(String temp:s) {
			total=total+Integer.parseInt(temp);
			
		}
		System.out.println(total);
		
		
	}

}
