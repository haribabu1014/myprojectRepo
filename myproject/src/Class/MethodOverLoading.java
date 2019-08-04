package Class;

public class MethodOverLoading {
	
	static void add(int x) {
		System.out.println(x);
	}
	static void add(int x,int y) {
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add(1);
		add(2,3);
		
		

	}

}
