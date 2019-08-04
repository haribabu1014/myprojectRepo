package Class;

public class ThisKeyword {
	private int x;
	
	public ThisKeyword(int x) {
		this.x=x;
		
	}
	public void show() {
		System.out.println(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword tk=new ThisKeyword(6);
		tk.show();
		

	}

}
